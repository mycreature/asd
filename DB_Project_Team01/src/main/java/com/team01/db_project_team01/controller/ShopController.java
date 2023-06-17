package com.team01.db_project_team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class ShopController {

    @GetMapping("/shop")
    public ModelAndView shop() {
        return new ModelAndView("index");
    }
}