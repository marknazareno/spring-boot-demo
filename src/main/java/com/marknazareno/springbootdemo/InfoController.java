package com.marknazareno.springbootdemo;

import org.springframework.boot.info.BuildProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    final BuildProperties buildProperties;

    public InfoController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping
    public ResponseEntity<Info> getMessage() {
        Info info = new Info("Hello Kubernetes!", buildProperties);
        return ResponseEntity.ok(info);
    }
}
