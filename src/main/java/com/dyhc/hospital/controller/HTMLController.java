package com.dyhc.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {
    @RequestMapping("index.html")
    public String toIndex(){
        return "index";
    }
}
