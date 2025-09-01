package com.ra.controller;

import com.ra.model.FormInput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("oto", new FormInput());
        List<String> hobbies = Arrays.asList("boi","nhac","birrila");
        model.addAttribute("hobbies", hobbies);
        return "form";
    }
    @PostMapping("/handle-form")
    public String handleForm(@ModelAttribute("oto") FormInput formInput) {
        return"form";
    }
}
