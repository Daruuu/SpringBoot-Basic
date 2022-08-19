package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/exer08", method = RequestMethod.GET)
public class Exercise07Controller {

    @GetMapping("/hola")
    public ResponseEntity<String> hi() {
        HttpStatus status = HttpStatus.ACCEPTED;
        int numRandom = (int) Math.round(Math.random());
        if(numRandom != 1){
            status = HttpStatus.I_AM_A_TEAPOT;
        }
        return new ResponseEntity<>("Hello World!", status);
    }
}
