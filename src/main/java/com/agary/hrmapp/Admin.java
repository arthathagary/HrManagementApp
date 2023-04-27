/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agary.hrmapp;

import java.util.ArrayList;

/**
 *
 * @author arthathagary
 */
public class Admin {
    private String userName;
    private String Password;
    
    public Admin(String userName,String password){
        this.userName = userName;
        this.Password = password;
    }
    
    public Admin(){
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public String getUserName() {
        return userName;
    }
    
    
    
    public ArrayList<HrManager> createAccount(int hrId, String hrUserName, String hrPassword, String hrType){
        HrManager hrManager = new HrManager(hrId, hrUserName, hrPassword,hrType);
        ArrayList <HrManager> hrManagers = new ArrayList<>();
        hrManagers.add(hrManager);
        return hrManagers;
    }
}
