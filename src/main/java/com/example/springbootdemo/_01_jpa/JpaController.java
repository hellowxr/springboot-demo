package com.example.springbootdemo._01_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/jpa")
public class JpaController {

    @Autowired
    JpaService jpaService;

    @GetMapping("/findAll")
    public Object findAll(){
        return jpaService.findAll();
    }
}
