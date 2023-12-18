package com.example.serviceb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Value("${crossorigin.client}")
    private String client;
    @GetMapping("/serviceB")
    public String serviceBResponse() {
        System.out.println("Client: " );
        return "Service B -> Hello from Service B Welcome! "+ client;
    }
}
