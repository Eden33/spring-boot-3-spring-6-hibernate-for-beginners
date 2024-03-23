package com.luv2code.springboot.demo.mycoolapp.rest2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController2 {
    // expose someting

    @GetMapping("/eden33-1")
    public String theMethod() {
        return "Eden says hello";
    }

    @GetMapping("/eden33-2")
    public String theMethod2() {
        return "Edi says hello 22";
    }    
}
