/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.DTO;


import com.visitorlog.Data.LogBook;
import java.util.Date;

/**
 *
 * @author CodeTribe1
 */
public class LogBookDTO  {
  
    
    private Integer logID;
    
    private String reason;
    
    private Date signIn;
    
    private Date signOut;
    
    private Date date;
   
    private int visitorID;

    public LogBookDTO(LogBook l) {
        this.date=l.getDate();
        this.logID=l.getLogID();
        this.reason=l.getReason();
        this.signIn=l.getSignIn();
        this.signOut=l.getSignOut();
        this.visitorID=l.getVisitor().getVisitorID();
    }

    public LogBookDTO(Integer logID) {
        this.logID = logID;
    }


    public Integer getLogID() {
        return logID;
    }

    public void setLogID(Integer logID) {
        this.logID = logID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getSignIn() {
        return signIn;
    }

    public void setSignIn(Date signIn) {
        this.signIn = signIn;
    }

    public Date getSignOut() {
        return signOut;
    }

    public void setSignOut(Date signOut) {
        this.signOut = signOut;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(int visitorID) {
        this.visitorID = visitorID;
    }

    

 
}
