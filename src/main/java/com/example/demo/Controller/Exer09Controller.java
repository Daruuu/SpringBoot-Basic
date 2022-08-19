package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/apiVersion")
public class Exer09Controller {

    @GetMapping("/hacercafe")
    @ResponseStatus(value = HttpStatus.OK)
    public String hacerCafe(){
        return "hacer cafe correcto";
    }

    @GetMapping("hacerte")
    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT)
    public String hacerTe(){
        return "Soy una tetera";
    }

    @GetMapping("/notfound")
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String notFound(){
        return "Not found";
    }
}
