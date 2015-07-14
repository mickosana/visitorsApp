/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "errorstore")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Errorstore.findAll", query = "SELECT e FROM Errorstore e"),
    @NamedQuery(name = "Errorstore.findByErrorstoreID", query = "SELECT e FROM Errorstore e WHERE e.errorstoreID = :errorstoreID"),
    @NamedQuery(name = "Errorstore.findByMessage", query = "SELECT e FROM Errorstore e WHERE e.message = :message"),
    @NamedQuery(name = "Errorstore.findByDateOccured", query = "SELECT e FROM Errorstore e WHERE e.dateOccured = :dateOccured"),
    @NamedQuery(name = "Errorstore.findByOrigin", query = "SELECT e FROM Errorstore e WHERE e.origin = :origin"),
    @NamedQuery(name = "Errorstore.findByStatusCode", query = "SELECT e FROM Errorstore e WHERE e.statusCode = :statusCode")})
public class ErrorStore implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "errorstoreID")
    private Integer errorstoreID;
    @Size(max = 45)
    @Column(name = "message")
    private String message;
    @Column(name = "dateOccured")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOccured;
    @Size(max = 45)
    @Column(name = "origin")
    private String origin;
    @Size(max = 45)
    @Column(name = "statusCode")
    private String statusCode;

    public ErrorStore() {
    }

    public ErrorStore(Integer errorstoreID) {
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
        if (!(object instanceof ErrorStore)) {
            return false;
        }
        ErrorStore other = (ErrorStore) object;
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
