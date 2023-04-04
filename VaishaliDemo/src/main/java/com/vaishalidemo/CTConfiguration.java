package com.vaishalidemo;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CTConfiguration {
    String client_id = "6Y8G5HQZUZWmjUdjRB9fT7rg";
    String client_secret = "C6f4jmhJ3G3CWd8aUly9w010rzlRObBL";
    String projectKey = "new-vaishali-ct";

    @Bean
    public ProjectApiRoot createApiClient() {
        final ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId("6Y8G5HQZUZWmjUdjRB9fT7rg")
                                .withClientSecret("C6f4jmhJ3G3CWd8aUly9w010rzlRObBL")
                                .build(),
                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build("new-vaishali-ct");

        return apiRoot;
    }
}
