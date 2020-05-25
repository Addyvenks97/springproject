package com.addy.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "loginPage";

    }
    @RequestMapping(value = "/loginPage", method = RequestMethod.POST)
        public String firstPage(Model model, @RequestParam String userName, @RequestParam String userMail){
            model.addAttribute("name", userName);
            model.addAttribute("email", userMail);
            return "firstPage";
        }

    }



