package com.marknazareno.springbootdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<Message> getMessage() {
        Message message = new Message("Hello Kubernetes!");
        return ResponseEntity.ok(message);
    }
}
