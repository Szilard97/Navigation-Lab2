package com.example.navigationapp;

import java.util.ArrayList;

public class Registered {

    private ArrayList<Users> usersArrayList = new ArrayList<>();

    public Registered(Users users) {
        usersArrayList.add(users);
    }

    public Registered() {
    }

    public ArrayList<Users> getUsersArrayList() {
        return usersArrayList;
    }
}
