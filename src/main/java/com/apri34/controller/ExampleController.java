package com.apri34.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping(value = "/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world");
    }
}
