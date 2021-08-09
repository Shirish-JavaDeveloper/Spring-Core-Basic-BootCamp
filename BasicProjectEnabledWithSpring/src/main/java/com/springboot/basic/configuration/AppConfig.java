package com.springboot.basic.configuration;

import com.springboot.basic.service.CreditCardPaymentService;
import com.springboot.basic.service.DebitCardPaymentService;
import com.springboot.basic.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.springboot.basic")
public class AppConfig {
/*
    @Bean
    public CreditCardPaymentService creditCardPaymentService(){
        return new CreditCardPaymentService();
    }

    @Bean
    public DebitCardPaymentService debitCardPaymentService(){
        return new DebitCardPaymentService();
    }

    @Bean
    public PaymentService creditPaymentService(CreditCardPaymentService creditCardPaymentService){
       return new PaymentService(creditCardPaymentService) ;
    }

    @Bean
    public PaymentService debitPaymentService(DebitCardPaymentService debitCardPaymentService){
        return new PaymentService(debitCardPaymentService) ;
    }*/
}

