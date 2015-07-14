/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.DTO;

import com.visitorlog.Data.Admin;



/**
 *
 * @author CodeTribe1
 */

public class AdminDTO  {
  
    private Integer adminID;
    
    private String username;
    
    private String password;
   
    private String email;

    public AdminDTO(Admin a) {
        this.adminID=a.getAdminID();
        this.email=a.getEmail();
        this.password=a.getPassword();
        this.username=a.getUsername();
    }

    public AdminDTO(Integer adminID) {
        this.adminID = adminID;
    }

   

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
