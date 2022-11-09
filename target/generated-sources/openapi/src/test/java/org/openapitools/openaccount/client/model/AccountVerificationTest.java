/*
 * UPS Accounts API
 * UPS Open Account API enables UPS 3rd Party Vendors to request a UPS Shipper Account. If the UPS Shipper Account request is approved, an UPS Shipper Account Number is generated. The UPS Ready Vendor user should first complete the registration process and get a My UPS ID before requesting a Shipper Account. Addresses are validated for accuracy. The User is expected to provide the primary reason for requesting a Shipper Account and the estimated number of Packages to be shipped.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.openaccount.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.openaccount.client.model.AccountVerificationDocumentation;
import org.openapitools.openaccount.client.model.Commodities;
import org.openapitools.openaccount.client.model.ContactName1;
import org.openapitools.openaccount.client.model.PaymentType;
import org.openapitools.openaccount.client.model.Title;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for AccountVerification
 */
public class AccountVerificationTest {
    private final AccountVerification model = new AccountVerification();

    /**
     * Model tests for AccountVerification
     */
    @Test
    public void testAccountVerification() {
        // TODO: test AccountVerification
    }

    /**
     * Test the property 'principalName'
     */
    @Test
    public void principalNameTest() {
        // TODO: test principalName
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'accountInitiator'
     */
    @Test
    public void accountInitiatorTest() {
        // TODO: test accountInitiator
    }

    /**
     * Test the property 'documentation'
     */
    @Test
    public void documentationTest() {
        // TODO: test documentation
    }

    /**
     * Test the property 'paymentType'
     */
    @Test
    public void paymentTypeTest() {
        // TODO: test paymentType
    }

    /**
     * Test the property 'commodities'
     */
    @Test
    public void commoditiesTest() {
        // TODO: test commodities
    }

}