# Spring-Core-Basic-BootCamp

Points to consider:  
1. Explain the basic app 
2. Use interfaces instead of concret classes
3. Add spring-context 
  1. AnnotationConfig class 
  2. Add AppConfig ,define beans and add compnent scan
  3. Explain bean scope
  4. Autowired 
      by Name 
      by Type 
  5. Dependency injection using setter, constructor and field injection 
  6. Qualifier   

4. Reading the property file
  - @PropertySource("classpath:application.properties")
  - @Value("${application.enable.creditcard.payment:false}")

5. bean lifecycle 
   - init 
   - destroy

6. Aspect oriented programming
  - @EnableAspectJAutoProxy
  - Advices - 
  - pointcut - 
  - join-point
    compile 'aopalliance:aopalliance:1.0'
    compile 'org.aspectj:aspectjweaver:1.9.7'
    compile 'org.aspectj:aspectjrt:1.9.7'
  
