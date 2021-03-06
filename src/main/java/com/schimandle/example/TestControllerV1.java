package com.schimandle.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tschi on 1/11/2017.
 */
@RestController
@Profile("version1")
public class TestControllerV1 {

    @Value("${test.value}")
    private String value;

    @GetMapping("/")
    public String getValue() {
        return value;
    }
}
