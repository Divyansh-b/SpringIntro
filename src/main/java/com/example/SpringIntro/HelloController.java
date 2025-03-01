package com.example.SpringIntro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {

    // UC2 - Learned to set a route and access another with it which will call the same page
    @GetMapping(value = {"", "/", "/home"})
    public String Hello() {
        return "Hello World!!";
    }

    // UC2 - Take user input from user in url to reflet in page
        @GetMapping("/query")
        public String Hello(@RequestParam String name){
            return "Hello " + name+" from Bridgelabz";
        }


}