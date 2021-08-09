package com.springboot.basic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

@Component
@Primary
public class CreditCardPaymentService  implements CardPaymentService {
    private static Logger logger = LoggerFactory.getLogger(PaymentService.class);

    public double debitAmount(double amount) {
        //    logger.info("Using Credit card to make payment of " + amount);
        return amount;
    }


}
