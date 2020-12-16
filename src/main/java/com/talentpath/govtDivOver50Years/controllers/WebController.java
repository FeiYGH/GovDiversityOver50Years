package com.talentpath.govtDivOver50Years.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/about")
    public String mayors() {
        return "about.html";
    }

    @RequestMapping("/team")
    public String governors() {
        return "team.html";
    }

}

