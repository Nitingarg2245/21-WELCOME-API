package com.example.__WELCOME_API;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(url = "http://localhost:9091",name = "greet")  //not recommended
@FeignClient(name = "20-Greet-Api")
public interface GreetFeignClient {

    @GetMapping("/greet")
     String callGreetApi();
}
