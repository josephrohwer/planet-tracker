/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josephrohwer.planettracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author joseph.rohwer
 */
@Controller
public class SignInController {

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String showSignInForm() {
        return "signIn";
    }
}
