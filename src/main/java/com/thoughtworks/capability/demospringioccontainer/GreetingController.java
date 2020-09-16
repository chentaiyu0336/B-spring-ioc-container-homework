package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@RestController
public class GreetingController {

//    private final GreetingService greetingService;

    @Autowired
    private BeanFactory beanFactory;

//    @Autowired
//    @Lazy
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = beanFactory.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

}
