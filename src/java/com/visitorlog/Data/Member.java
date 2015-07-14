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
@Table(name = "member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"),
    @NamedQuery(name = "Member1.findByMemberID", query = "SELECT m FROM Member1 m WHERE m.memberID = :memberID"),
    @NamedQuery(name = "Member1.findByMemberName", query = "SELECT m FROM Member1 m WHERE m.memberName = :memberName"),
    @NamedQuery(name = "Member1.findByMemberSurname", query = "SELECT m FROM Member1 m WHERE m.memberSurname = :memberSurname")})
public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "memberID")
    private Integer memberID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "memberName")
    private String memberName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "memberSurname")
    private String memberSurname;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne
    private Company company;
    @OneToMany(mappedBy = "member")
    private List<Visitor> visitorList;

    public Member() {
    }

    public Member(Integer memberID) {
        this.memberID = memberID;
    }

    public Member(Integer memberID, String memberName, String memberSurname) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberSurname = memberSurname;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @XmlTransient
    public List<Visitor> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(List<Visitor> visitorList) {
        this.visitorList = visitorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberID != null ? memberID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member)) {
            return false;
        }
        Member other = (Member) object;
        if ((this.memberID == null && other.memberID != null) || (this.memberID != null && !this.memberID.equals(other.memberID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.visitorlog.Data.Member1[ memberID=" + memberID + " ]";
    }
    
}
