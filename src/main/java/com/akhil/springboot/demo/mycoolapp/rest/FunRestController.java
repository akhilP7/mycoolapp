package com.akhil.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/") //handle the HTTP GET requests matched with the given URI expression
    public String sayHello(){
        return "hello world!!";
    }
}
