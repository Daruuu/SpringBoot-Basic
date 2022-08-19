package com.example.demo.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class EndPointsController {

    @GetMapping("/index")
    public String index(){
        return "Hello world this the INDEX ";
    }

    @GetMapping("/contacto")
    public String contacto(){
        return "This is the CONTACT endpoint";
    }

    @GetMapping("/form")
    public String form(){
        return "This is the FORM endpoint";
    }


    @ResponseBody
    @RequestMapping("/texto")
    public TextToJsonController test(){
        return new TextToJsonController("index.html");
    }


}
