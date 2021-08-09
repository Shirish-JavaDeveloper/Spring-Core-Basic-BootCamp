package com.springboot.basic.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:application.properties")
public class AppConfigProperties {
    @Value("${application.payment.service.description:Default description}")
    private String description ;

    @Value("${application.payment.service.supported.types:creditCard}")
    private List<String> supportedPaymentTypes;

    public List<String> getSupportedPaymentTypes() {
        return supportedPaymentTypes;
    }

    public String getDescription() {
        return description;
    }


}
