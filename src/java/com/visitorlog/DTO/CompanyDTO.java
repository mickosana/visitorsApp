/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.DTO;


import com.visitorlog.Data.Company;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */

public class CompanyDTO {
    
 
    private Integer companyID;
    
    private String companyName;
  
    private List<MemberDTO> memberList;

    public CompanyDTO(Company c) {
        this.companyID=c.getCompanyID();
        this.companyName=c.getCompanyName();
        
    }

    public CompanyDTO(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
}
