package com.springboot.basic.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@EnableAspectJAutoProxy
@Aspect
@Component
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("within(com.springboot.basic.service..*)")
    //@Pointcut("execution(public * com.springboot.basic.service.*.*(..))")
    public void matchServicePublicMethods(){

    }

    @Before("matchServicePublicMethods()")
    public void logPreEntry(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        List<String> arguments = Arrays.stream(args).map(Object::toString).collect(Collectors.toList());
        logger.info("LoggingAspect: method: "+joinPoint.toString()+" started at - "+new Date());
//        logger.info("LoggingAspect called before method: "+joinPoint.toString()+" .. Arguments: "+ arguments);
    }

/*
    @Before("matchServicePublicMethods()")
    public void logPreEntry1(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        List<String> arguments = Arrays.stream(args).map(Object::toString).collect(Collectors.toList());
        logger.info("LoggingAspect preEntry 1: method: "+joinPoint.toString()+" started at - "+new Date());
        logger.info("LoggingAspect preEntry 1 called before method: "+joinPoint.toString()+" .. Arguments: "+ arguments);
    }*/

    @After("matchServicePublicMethods()")
    public void logPostExit(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        List<String> arguments = Arrays.stream(args).map(Object::toString).collect(Collectors.toList());
        logger.info("LoggingAspect: method: "+joinPoint.toString()+" Ended at - "+new Date());
    }

}
