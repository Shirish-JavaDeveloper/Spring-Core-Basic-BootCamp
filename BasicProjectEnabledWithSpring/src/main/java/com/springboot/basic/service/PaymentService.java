package com.springboot.basic.service;

import com.springboot.basic.configuration.AppConfigProperties;
import com.springboot.basic.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentService {
    private static Logger logger = LoggerFactory.getLogger(PaymentService.class);
    @Autowired
    private CardPaymentService cardPaymentService;

    @Autowired
    private AppConfigProperties appConfigProperties;

    /*@Autowired
    public PaymentService(@Qualifier("debitCardPaymentService") CardPaymentService cardPaymentService) {
        this.cardPaymentService = cardPaymentService;
    }*/

    /*@Autowired
    public void setCardPaymentService(CardPaymentService cardPaymentService) {
        this.cardPaymentService = cardPaymentService;
    }*/

    public double makePayment(Order order){
        //logger.info("Payment process started for "+order);
        this.getDescription("Welcome to ");
        return cardPaymentService.debitAmount(order.getAmount());
    }

    public String getDescription() {
        return appConfigProperties.getDescription();
    }

    public String getDescription(String preMessage) {
        return preMessage + appConfigProperties.getDescription();
    }

    public List<String> getSupportedType() {
        return appConfigProperties.getSupportedPaymentTypes();
    }
}

