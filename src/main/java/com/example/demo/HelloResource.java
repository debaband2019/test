package com.example.demo;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("/home")
public class HelloResource {
  @GetMapping("/")
  String get(){
    //mapped to hostname:port/home/
    return "Hello from get";
  }
  @RequestMapping("/index")
  String index(){
    //mapped to hostname:port/home/index/
    return "Hello from index";
  }
}