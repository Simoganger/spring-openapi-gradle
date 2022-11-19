package com.simontech.openapi.controller;

import org.simontech.openapi.api.HelloApi;
import org.simontech.openapi.model.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController implements HelloApi {

    @Override
    public ResponseEntity<Hello> hello() {
        return new ResponseEntity<>(new Hello().text("Hello World!"), HttpStatus.OK);
    }
}
