package com.lsiccha.main.application.controllers.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SalidaControllerImpl {

    @GetMapping
    public ResponseEntity<String> hello(){
        String message = "Hello Docker";
        ResponseEntity<String> response = new ResponseEntity<>(message, HttpStatus.OK);
        return response;
    }
}
