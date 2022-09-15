package br.com.fiap.strixapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.strixapi.model.User;

@RestController
public class Controller {

    @GetMapping("/home")
    public String mensagem(){
        return "Hello World";
    }
    
    @PostMapping("/user")
    public User user(@RequestBody User u){
        return u;
    }

}
