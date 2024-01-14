package com.example.swagger.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<String>> listUser(){
        return new ResponseEntity<>(List.of("aorjor","anuchito"), HttpStatus.OK);
    }

    @PostMapping
    @ApiResponse(responseCode = "201", description = "User created")
    public ResponseEntity<Integer> createUser(Integer id, String name){
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}
