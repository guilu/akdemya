package dev.diegobarrioh.akdmia.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendController {


    @GetMapping("/")
    public String home(){
        return "Hello World!";
    }

}
