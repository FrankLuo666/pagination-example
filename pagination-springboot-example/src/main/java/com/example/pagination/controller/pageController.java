package com.example.pagination.controller;

import com.example.pagination.bean.Page;
import com.example.pagination.bean.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class pageController {

    @RequestMapping("/showPage")
    public String initPaginationHtml(ModelMap model){
        //get list from database
        List<Users> list = new ArrayList<>();
        list.add(new Users(123,"Lily","abc123"));
        list.add(new Users(223,"Jack","abc123"));
        list.add(new Users(323,"Tom","abc123"));

        Page<Users> page = new Page<>();
        Users userForm = new Users();
        page.setList(list);
        page.setPageSize(20);
//        userForm.setPage(page);
        userForm.setAddress("北京");
        model.addAttribute("userForm",userForm);
        model.addAttribute("page",page);

//        String url = "/pagination";
//        model.addAttribute("url",url);
//        model.addAttribute("page",page);

        return "pagination";
    }

    @RequestMapping("pagination")
    public String toPage(@ModelAttribute("userForm") Users userForm,
        @ModelAttribute("page") Page page, ModelMap model){

        String currentPage = (String) model.getAttribute("currentPage");
//        model.addAttribute("userForm", userForm);
        return "pagination";
    }
}
