package com.ananarcisio.netflix.controller;
//colocar um 'decotion' da controller aqui em java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

