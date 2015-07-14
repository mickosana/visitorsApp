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
import com.visitorlog.Data.Visitor;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ResponseDTO {
    
    private AdminDTO admin;
    private CompanyDTO company;
    private ErrorStoreDTO errorStore;
    private LogBookDTO logBook;
    private MemberDTO member;
    private VisitorDTO visitor;
    
     private List<MemberDTO> memberList;
     private List<VisitorDTO> visitorList;
     private List<LogBookDTO> logbookList;
     private List<AdminDTO> adminList;
     private List<CompanyDTO> companyList;
     private List<ErrorStoreDTO> errorstoreList;

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

    public List<MemberDTO> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberDTO> memberList) {
        this.memberList = memberList;
    }

    public List<VisitorDTO> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(List<VisitorDTO> visitorList) {
        this.visitorList = visitorList;
    }

    public List<LogBookDTO> getLogbookList() {
        return logbookList;
    }

    public void setLogbookList(List<LogBookDTO> logbookList) {
        this.logbookList = logbookList;
    }

    public List<AdminDTO> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<AdminDTO> adminList) {
        this.adminList = adminList;
    }

    public List<CompanyDTO> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<CompanyDTO> companyList) {
        this.companyList = companyList;
    }

    public List<ErrorStoreDTO> getErrorstoreList() {
        return errorstoreList;
    }

    public void setErrorstoreList(List<ErrorStoreDTO> errorstoreList) {
        this.errorstoreList = errorstoreList;
    }
     
     
    
}
