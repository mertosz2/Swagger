package com.example.swagger.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.swagger.api.PetApi;
import com.example.swagger.model.Pet;

import java.util.List;

@RestController
public class PetController implements PetApi{

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags){
        var dog = new Pet();
        dog.name("Dogg");
        return new ResponseEntity<>(List.of(dog), HttpStatus.OK);
    }
}
