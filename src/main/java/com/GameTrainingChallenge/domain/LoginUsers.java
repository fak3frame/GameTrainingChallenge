package com.GameTrainingChallenge.domain;

import javax.persistence.*;

@Entity
@Table(name = "LoginUsers")
@TableGenerator(name = "sequenceOfLoginUsers", initialValue=0, allocationSize=50)
public class LoginUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "sequenceOfLoginUsers")
    private int id;

    private String userName;
    private String password;

    private boolean enable;

    public LoginUsers() {
    }

    public LoginUsers(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.enable = true;
    }

    public LoginUsers(LoginUsers loginUsers){
        this.userName = loginUsers.userName;
        this.password = loginUsers.password;
        this.enable = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
