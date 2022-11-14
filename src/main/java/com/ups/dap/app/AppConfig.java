package com.ups.dap.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.ups.dap.app.tool.LoggingRequestInterceptor;

import lombok.Getter;

@Configuration
@Getter
public class AppConfig {	
	public static final int SCENARIO_PROPERTIES_JSON_FILE_NAME = 0;
	public static final int SCENARIO_PROPERTIES_CLASS_NAME = 1;
	public static final int SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER = 2;
	
	public static final String OPEN_ACCOUNT_SUCCESS_SCENARIO = "OpenAccountSuccess";
	
	@Value("${api.oauth.partner.client.id}")
	private String clientID;
	
	@Value("${api.oauth.partner.secret}")
	private String secret;
	
	@Value("${api.oauth.base.url}")
	private String oauthBaseUrl;
	
	@Value("${api.oauth.partner.accessToken:#{null}}")
	private String previousObtainedToken;
	
	// transient token populated from previousObtainedToken or 
	// obtained from client_credential grant_type.
	private Map<String,String> accessTokenStore = new ConcurrentHashMap<>();
	
	@Value("${api.open.account.base.url:#{null}}")
	private String rateBaseUrl;
	
	@Value("${api.open.account.version:v1}")
	private String rateVersion;
	
	@Value("${api.opn.account.transaction.source:testing}")
	private String transactionSrc;
	
	@Value("#{${api.open.account.scenario.properties}}")
	private Map<String,List<String>> scenarioProperties;
	
	@Bean 
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		final SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		final RestTemplate restTemplate = builder.requestFactory(() -> factory).build();
		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
//		interceptors.add(new LoggingRequestInterceptor());
		restTemplate.setInterceptors(interceptors);
		
		return restTemplate;
	}
}
