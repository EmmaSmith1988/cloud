package com.example.cloudbusting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/message")
    public String getMessage(){
        return "hello, is this new code working?";
    }

//    @PostMapping("/message")
//    public String addMessage(@RequestBody String text){
//        return text;
//    }
}
