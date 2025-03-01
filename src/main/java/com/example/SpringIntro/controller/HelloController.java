package com.example.SpringIntro.controller;
import com.example.SpringIntro.model.User;

import org.springframework.web.bind.annotation.*;

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

    // UC3 - Path Parameters: Handles GET requests at "/{name}" using a path variable.
    // URL: http://localhost:8080/Divyansh
    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " Thanks for using my application";
    }

    // UC4 - PostMethod: Handles POST requests at "/post" with a User object in the request body.
    // URL: Use POST request at http://localhost:8080/post with JSON body: { "firstName": "Divyansh", "lastName": "Bansal," }
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " Thanks for using my application";
    }


}