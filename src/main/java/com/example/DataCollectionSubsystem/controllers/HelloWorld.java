package com.example.DataCollectionSubsystem.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("")
public class HelloWorld {
    @GetMapping("/")
    ResponseEntity<String> getAll() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
