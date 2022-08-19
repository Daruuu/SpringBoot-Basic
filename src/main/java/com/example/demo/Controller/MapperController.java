package com.example.demo.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapperController {
    // return objecto JSON con un object MAPPER utilizando un ObjectNode
    @ResponseBody
    @RequestMapping("/mapper")
    public ObjectNode input(){
        //Alumno a = new Alumno(1,"daruny",26,"Spain");
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("key", "value");
        objectNode.put("foo", "bar");
        objectNode.put("dinero", 4000);
        objectNode.put("number", 20);
        return objectNode;
    }

}
