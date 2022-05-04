package com.registration.controller;

import com.registration.entity.User;
import com.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String getUser(){
        return "registration";
    }

    @PostMapping("/signup")
    public String getSignUp(@ModelAttribute User user, HttpSession session){
        System.out.println(user);
        repository.save(user);
        session.setAttribute("message","User Saved Successfully");
        return "redirect:/";
    }
}
