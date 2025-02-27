package ru.youdzhin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String getRequest () {
        return "this is just a simple hello-world application\n\nHello world, btw";
    }

}
