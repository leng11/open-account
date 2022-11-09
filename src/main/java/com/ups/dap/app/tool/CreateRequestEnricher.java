package com.ups.dap.app.tool;

import com.ups.dap.app.AppConfig;


public interface CreateRequestEnricher {
	public default <T> T enrich(final String scenarioName, final AppConfig appConfig, T aT) {
		 return aT;
	}
}
