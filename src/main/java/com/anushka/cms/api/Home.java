package com.anushka.cms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    @GetMapping
    public String home(){return "Application is Work!!!" + new Date();

    }
}
