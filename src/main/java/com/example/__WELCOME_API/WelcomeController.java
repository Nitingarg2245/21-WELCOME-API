package com.example.__WELCOME_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private GreetFeignClient greetFeignClient;

    @Autowired
    private Environment environment;

    @GetMapping("/welcome")
    public String welcomeMsg(){
        String property = environment.getProperty("server.port");
        String callResult = greetFeignClient.callGreetApi();
        return callResult+" welcome to Inter service communication demo ::"+property;
    }
}
