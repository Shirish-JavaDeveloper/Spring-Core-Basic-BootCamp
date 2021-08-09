package com.springboot.basic;

import com.springboot.basic.configuration.AppConfig;
import com.springboot.basic.entity.Customer;
import com.springboot.basic.entity.Item;
import com.springboot.basic.entity.Order;
import com.springboot.basic.service.CreditCardPaymentService;
import com.springboot.basic.service.DebitCardPaymentService;
import com.springboot.basic.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ShoppingApplication {
    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer();
        customer.setName("Shirish");
        customer.setAddress("Pune - 411015");
        Item item = new Item();
        item.setName("Redmi Note 10 Pro Mobile");
        item.setPricePerIem(14999.00);
        Item item1 = new Item();
        item1.setName("Pen Drive 32Gb");
        item1.setPricePerIem(349.00);

        Order order = new Order();
        order.setCustomer(customer);
        order.setId("1234");
        order.setItemsList(Arrays.asList(item, item1));

         /*DebitCardPaymentService cardPaymentService = new DebitCardPaymentService();
         PaymentService paymentService = new PaymentService();
         paymentService.makePayment(order);*/

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService paymentService1 = (PaymentService) context.getBean("paymentService");
        paymentService1.makePayment(order);
        //paymentService1.getDescription();
        //paymentService1.getDescription("Welcome");

        Thread.currentThread().sleep(5000);
    }
}
