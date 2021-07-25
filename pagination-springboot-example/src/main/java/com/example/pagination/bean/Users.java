package com.example.pagination.bean;

import lombok.Data;

import java.util.List;

@Data
public class Users {
    private Integer id;
    private String username;
    private String password;
    private String address;

    //show pagination
    private Page<Users> page;
    //show and allow input list
    private List<Users> userList;

    public Users(){

    }

    public Users(Integer id, String userName, String password) {
        this.id = id;
        this.username = userName;
        this.password = password;
    }

    public Users(Integer id, String username, String password, String address, Page<Users> page, List<Users> userList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.page = page;
        this.userList = userList;
    }
}
