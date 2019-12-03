package com.example.finalproject;

/** Updates and holds each users information */
public class User {
    private String name;
    private int age;
    private String grade;
    private String major;
    private String gender;
    private String accUser;
    private String accPass;
    public User(String u, String p) {
        accUser = u;
        accPass = p;
    }
}
