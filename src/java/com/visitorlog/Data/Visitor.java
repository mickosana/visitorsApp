/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.Data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "visitor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitor.findAll", query = "SELECT v FROM Visitor v"),
    @NamedQuery(name = "Visitor.findByVisitorID", query = "SELECT v FROM Visitor v WHERE v.visitorID = :visitorID"),
    @NamedQuery(name = "Visitor.findByVisitorName", query = "SELECT v FROM Visitor v WHERE v.visitorName = :visitorName"),
    @NamedQuery(name = "Visitor.findByVisitorSurname", query = "SELECT v FROM Visitor v WHERE v.visitorSurname = :visitorSurname"),
    @NamedQuery(name = "Visitor.findByEmail", query = "SELECT v FROM Visitor v WHERE v.email = :email"),
    @NamedQuery(name = "Visitor.findByCompanyName", query = "SELECT v FROM Visitor v WHERE v.companyName = :companyName"),
    @NamedQuery(name = "Visitor.findById", query = "SELECT v FROM Visitor v WHERE v.id = :id")})
public class Visitor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "visitorID")
    private Integer visitorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "visitorName")
    private String visitorName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "visitorSurname")
    private String visitorSurname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "companyName")
    private String companyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ID")
    private String id;
    @OneToMany(mappedBy = "visitor")
    private List<LogBook> logbookList;
    @JoinColumn(name = "memberID", referencedColumnName = "memberID")
    @ManyToOne
    private Member member;

    public Visitor() {
    }

    public Visitor(Integer visitorID) {
        this.visitorID = visitorID;
    }

    public Visitor(Integer visitorID, String visitorName, String visitorSurname, String id) {
        this.visitorID = visitorID;
        this.visitorName = visitorName;
        this.visitorSurname = visitorSurname;
        this.id = id;
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

    @XmlTransient
    public List<LogBook> getLogbookList() {
        return logbookList;
    }

    public void setLogbookList(List<LogBook> logbookList) {
        this.logbookList = logbookList;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitorID != null ? visitorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitor)) {
            return false;
        }
        Visitor other = (Visitor) object;
        if ((this.visitorID == null && other.visitorID != null) || (this.visitorID != null && !this.visitorID.equals(other.visitorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.visitorlog.Data.Visitor[ visitorID=" + visitorID + " ]";
    }
    
}
