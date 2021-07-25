package com.example.pagination.bean;

import lombok.Data;

import java.util.List;

@Data
public class Users {
    private Integer id;
    private String username;
    private String password;

    private List<Users> userList;

    public Users(){

    }

    public Users(Integer id, String userName, String password) {
        this.id = id;
        this.username = userName;
        this.password = password;
    }

    public Users(Integer id, String userName, String password, List<Users> userList) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.userList = userList;
    }
}
