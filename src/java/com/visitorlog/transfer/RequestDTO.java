/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.transfer;

import com.visitorlog.DTO.AdminDTO;
import com.visitorlog.DTO.CompanyDTO;
import com.visitorlog.DTO.ErrorStoreDTO;
import com.visitorlog.DTO.LogBookDTO;
import com.visitorlog.DTO.MemberDTO;
import com.visitorlog.DTO.VisitorDTO;

/**
 *
 * @author CodeTribe1
 */
public class RequestDTO {
    
    private AdminDTO admin;
    private CompanyDTO company;
    private ErrorStoreDTO errorStore;
    private LogBookDTO logBook;
    private MemberDTO member;
    private VisitorDTO visitor;
    
    private Integer adminID, companyID, errorstoreID, logID, memberID, visitorID, RequestType;
    
   public static final int ADD_ADMIN =100;
   public static final int GET_ALL_VISITORS = 110;
   public static final int  GET_VISITOR_BY_ID = 120;

    public AdminDTO getAdmin() {
        return admin;
    }

    public void setAdmin(AdminDTO admin) {
        this.admin = admin;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public ErrorStoreDTO getErrorStore() {
        return errorStore;
    }

    public void setErrorStore(ErrorStoreDTO errorStore) {
        this.errorStore = errorStore;
    }

    public LogBookDTO getLogBook() {
        return logBook;
    }

    public void setLogBook(LogBookDTO logBook) {
        this.logBook = logBook;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember(MemberDTO member) {
        this.member = member;
    }

    public VisitorDTO getVisitor() {
        return visitor;
    }

    public void setVisitor(VisitorDTO visitor) {
        this.visitor = visitor;
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getErrorstoreID() {
        return errorstoreID;
    }

    public void setErrorstoreID(Integer errorstoreID) {
        this.errorstoreID = errorstoreID;
    }

    public Integer getLogID() {
        return logID;
    }

    public void setLogID(Integer logID) {
        this.logID = logID;
    }

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public Integer getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(Integer visitorID) {
        this.visitorID = visitorID;
    }

    public Integer getRequestType() {
        return RequestType;
    }

    public void setRequestType(Integer RequestType) {
        this.RequestType = RequestType;
    }
  
   
  
}
