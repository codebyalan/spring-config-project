package com.ambro.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    @Value("${config.status}")
    String value;

    @GetMapping("get")
    public String getValue(){
        return value;
    }


}
