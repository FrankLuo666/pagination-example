package com.example.pagination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitPageController {

    @RequestMapping("/showPaginationHtml")
    public String toPaginationHtml(){
        return "pagination";
    }
}
