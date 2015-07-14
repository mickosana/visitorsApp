/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.DTO;


import com.visitorlog.Data.ErrorStore;
import java.util.Date;

/**
 *
 * @author CodeTribe1
 */
public class ErrorStoreDTO  {
   
    
    private Integer errorstoreID;
   
    private String message;
    
    private Date dateOccured;
   
    private String origin;
   
    private String statusCode;

    public ErrorStoreDTO(ErrorStore e) {
        this.dateOccured=e.getDateOccured();
        this.errorstoreID=e.getErrorstoreID();
        this.origin=e.getOrigin();
        this.statusCode=e.getStatusCode();
    }

    public ErrorStoreDTO(Integer errorstoreID) {
        this.errorstoreID = errorstoreID;
    }

    public Integer getErrorstoreID() {
        return errorstoreID;
    }

    public void setErrorstoreID(Integer errorstoreID) {
        this.errorstoreID = errorstoreID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateOccured() {
        return dateOccured;
    }

    public void setDateOccured(Date dateOccured) {
        this.dateOccured = dateOccured;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (errorstoreID != null ? errorstoreID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ErrorStoreDTO)) {
            return false;
        }
        ErrorStoreDTO other = (ErrorStoreDTO) object;
        if ((this.errorstoreID == null && other.errorstoreID != null) || (this.errorstoreID != null && !this.errorstoreID.equals(other.errorstoreID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.visitorlog.Data.Errorstore[ errorstoreID=" + errorstoreID + " ]";
    }
    
}
