package com.addy.springproject.controller;

import com.addy.springproject.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {


    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage(Model model) {
        UserModel userModel = new UserModel();
        model.addAttribute("userDetails", userModel);
        return "loginPage";

    }
    @RequestMapping(value = "/loginPage", method = RequestMethod.POST)
        public String firstPage(@ModelAttribute("userDetails") UserModel userModel){
            return "firstPage";
        }

    }



