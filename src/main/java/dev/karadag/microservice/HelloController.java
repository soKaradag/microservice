package dev.karadag.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/users")
    public String[] sayHello() {
        String[] users = { "Serdar", "Onur" };

        return users;
    }
}
