/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.DTO;


import com.visitorlog.Data.Member;
import com.visitorlog.Data.Visitor;
import java.util.List;


/**
 *
 * @author CodeTribe1
 */

public class MemberDTO {
  
   
    private Integer memberID;
  
    private String memberName;
    
    private String memberSurname;
   
    private int companyID;
  
    private List<VisitorDTO> visitorList;

    public MemberDTO(Member m) {
        this.companyID=m.getCompany().getCompanyID();
        this.memberName=m.getMemberName();
        this.memberSurname=m.getMemberSurname();
        this.memberID=m.getMemberID();
    }

    public MemberDTO(Integer memberID) {
        this.memberID = memberID;
    }

  
    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSurname() {
        return memberSurname;
    }

    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public List<VisitorDTO> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(List<VisitorDTO> visitorList) {
        this.visitorList = visitorList;
    }
   

   
}
