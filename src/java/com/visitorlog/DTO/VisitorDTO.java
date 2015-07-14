/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.DTO;

import com.visitorlog.Data.Visitor;
import java.util.List;


/**
 *
 * @author CodeTribe1
 */

public class VisitorDTO  {
 
   
    private Integer visitorID;
    
    private String visitorName;
   
    private String visitorSurname;
   
    private String email;
    
    private String companyName;
    
    private String id;
   
    private List<LogBookDTO> logbookList;
   
    private int memberID;

   

    public VisitorDTO(Integer visitorID) {
        this.visitorID = visitorID;
       
    }

   public VisitorDTO (Visitor v){
       this.visitorID=v.getVisitorID();
       this.companyName=v.getCompanyName();
       this.email=v.getEmail();
       this.id=v.getId();
       this.visitorName=v.getVisitorName();
       this.memberID=v.getMember().getMemberID();
       
   }
    public Integer getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(Integer visitorID) {
        this.visitorID = visitorID;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorSurname() {
        return visitorSurname;
    }

    public void setVisitorSurname(String visitorSurname) {
        this.visitorSurname = visitorSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setLogbookList(List<LogBookDTO> logbookList) {
        this.logbookList = logbookList;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMember(int memberID) {
        this.memberID = memberID;
    }


    
}
