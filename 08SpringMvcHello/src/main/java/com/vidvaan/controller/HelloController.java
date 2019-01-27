package com.vidvaan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	@RequestMapping("/hello")
	public  ModelAndView helloWorld() {  
        String message = "HELLO SPRING MVC, HOW R U ?";  
        System.out.println("hello mapping");
        return new ModelAndView("hellopage", "data", message);  
    }  
	@RequestMapping("/seshu")
	public void display(){
		System.out.println("my name is seshu");
	}

   
}
