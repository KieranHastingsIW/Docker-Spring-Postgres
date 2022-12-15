package com.helloworldapi.helloworld_api.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.helloworldapi.helloworld_api.service.ApiServiceImpl;

import lombok.*;

@AllArgsConstructor
@Controller
public class ApiController{

    ApiServiceImpl apiService;

    @GetMapping("/hello")
    public  ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/message/{name}")
    public  ResponseEntity<String> getMessage(@PathVariable String name){
        
        return new ResponseEntity<>(apiService.createMessage(name), HttpStatus.OK);
    }

}
