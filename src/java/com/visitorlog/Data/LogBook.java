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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "logbook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logbook.findAll", query = "SELECT l FROM Logbook l"),
    @NamedQuery(name = "Logbook.findByLogID", query = "SELECT l FROM Logbook l WHERE l.logID = :logID"),
    @NamedQuery(name = "Logbook.findByReason", query = "SELECT l FROM Logbook l WHERE l.reason = :reason"),
    @NamedQuery(name = "Logbook.findBySignIn", query = "SELECT l FROM Logbook l WHERE l.signIn = :signIn"),
    @NamedQuery(name = "Logbook.findBySignOut", query = "SELECT l FROM Logbook l WHERE l.signOut = :signOut"),
    @NamedQuery(name = "Logbook.findByDate", query = "SELECT l FROM Logbook l WHERE l.date = :date")})
public class LogBook implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "logID")
    private Integer logID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "reason")
    private String reason;
    @Column(name = "signIn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date signIn;
    @Column(name = "signOut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date signOut;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "visitorID", referencedColumnName = "visitorID")
    @ManyToOne
    private Visitor visitor;

    public LogBook() {
    }

    public LogBook(Integer logID) {
        this.logID = logID;
    }

    public LogBook(Integer logID, String reason) {
        this.logID = logID;
        this.reason = reason;
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

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logID != null ? logID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogBook)) {
            return false;
        }
        LogBook other = (LogBook) object;
        if ((this.logID == null && other.logID != null) || (this.logID != null && !this.logID.equals(other.logID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.visitorlog.Data.Logbook[ logID=" + logID + " ]";
    }
    
}
