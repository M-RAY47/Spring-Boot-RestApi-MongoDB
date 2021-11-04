package io.mray.resapimongo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Welcome to my Spring Boot and Mongo DB with mongo express!!!";
    }
}
