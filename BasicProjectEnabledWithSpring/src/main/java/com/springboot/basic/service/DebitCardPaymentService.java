package com.springboot.basic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DebitCardPaymentService implements CardPaymentService{
    private static Logger logger = LoggerFactory.getLogger(PaymentService.class);

    public double debitAmount(double amount) {
        logger.info("Using Debit card to make payment of " + amount);
        return amount;
    }
}
