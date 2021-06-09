package com.marknazareno.springbootdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.info.BuildProperties;

@Data
@AllArgsConstructor
public class Info {

    private String message;

    private BuildProperties buildProperties;
}
