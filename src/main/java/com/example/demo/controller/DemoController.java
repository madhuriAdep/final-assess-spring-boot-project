package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

// import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import com.example.demo.MODEL.User;

import com.example.demo.service.demoService;

@Controller
public class DemoController {

    @Autowired
    demoService demoser;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/list")
    public String List(@ModelAttribute User user, Model model) {
        demoser.Add(user);
        model.addAttribute("Id Type", user.getIdtype());
        model.addAttribute("Name", user.getName());
        model.addAttribute("contact Number", user.getContactno());
        model.addAttribute("vaccine name", user.getVacname());
        List<User> use = demoser.show();
        model.addAttribute("data", use);       
        return "Users";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id,Model model) {
        demoser.deleteById(id);
        // List<User> use = demoser.delete(id);
        model.addAttribute("data",demoser.show());
        return "Users";
    }

    
    @PostMapping("/edit")
    public String edit(@ModelAttribute User user,Model model) {
        demoser.Add(user);
        List<User> use = demoser.show();
        model.addAttribute("data", use);
        return "Users";
    }

    @GetMapping("/edit/{id}")
    public String updateById(@PathVariable Integer id,Model model) {
        // demoser.updateById(id);
        User us = demoser.getById(id);
        model.addAttribute("updtdata",us);
        return "update";
    }


}
