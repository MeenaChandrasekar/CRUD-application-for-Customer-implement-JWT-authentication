package com.SunbaseData.demo.Sunbase.model;

public class AuthRequest {

    private String login_id;
    private String password;

    // Constructors, getters, and setters

    public AuthRequest() {
    }

    public AuthRequest(String login_id, String password) {
        this.login_id = login_id;
        this.password = password;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
