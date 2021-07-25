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
        List<Users> list = new ArrayList<>();
        list.add(new Users(123,"Lily","abc123"));
        list.add(new Users(223,"Jack","abc123"));
        list.add(new Users(323,"Tom","abc123"));

        Users userForm = new Users();
        userForm.setUserList(list);
        model.addAttribute("userForm",userForm);

        String url = "/pagination";
        Page<Users> page= new Page<Users>();
        model.addAttribute("url",url);
        model.addAttribute("page",page);

        return "pagination";
    }

    @RequestMapping("pagination")
    public String toPage(@ModelAttribute("userForm") Users userForm,
        @ModelAttribute("page") Page page,ModelMap model,
                         @ModelAttribute("pageNum") String pageNum){

        Page page1 = (Page)model.getAttribute("page");
        model.addAttribute("userForm", userForm);
        return "pagination";
    }
}
