package com.example.navigationapp;

import java.util.ArrayList;

public class Users {

    private String firstName;
    private String lastName;
    private String department;



    public Users() {
    }

    public Users(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstLastNameAndDepartment(){

        return firstName + " "+ lastName + " "+ department;
    }
}