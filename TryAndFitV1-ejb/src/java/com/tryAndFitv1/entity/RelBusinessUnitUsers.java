/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amir.zidi
 */
@Entity
@Table(name = "rel_business_unit_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelBusinessUnitUsers.findAll", query = "SELECT r FROM RelBusinessUnitUsers r")
    , @NamedQuery(name = "RelBusinessUnitUsers.findById", query = "SELECT r FROM RelBusinessUnitUsers r WHERE r.id = :id")
    , @NamedQuery(name = "RelBusinessUnitUsers.findByUsersEmail", query = "SELECT r FROM RelBusinessUnitUsers r WHERE r.usersEmail = :usersEmail")
    , @NamedQuery(name = "RelBusinessUnitUsers.findByUsersIdusers", query = "SELECT r FROM RelBusinessUnitUsers r WHERE r.usersIdusers = :usersIdusers")
    , @NamedQuery(name = "RelBusinessUnitUsers.findByBusinessunitIdbusinessunit", query = "SELECT r FROM RelBusinessUnitUsers r WHERE r.businessunitIdbusinessunit = :businessunitIdbusinessunit")
    , @NamedQuery(name = "RelBusinessUnitUsers.findByIdusers", query = "SELECT r FROM RelBusinessUnitUsers r WHERE r.idusers = :idusers")})
public class RelBusinessUnitUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "users_email")
    private String usersEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "users_idusers")
    private int usersIdusers;
    @Column(name = "businessunit_idbusinessunit")
    private Integer businessunitIdbusinessunit;
    @Column(name = "idusers")
    private Integer idusers;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private BusinessUnit businessUnit;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users;

    public RelBusinessUnitUsers() {
    }

    public RelBusinessUnitUsers(Integer id) {
        this.id = id;
    }

    public RelBusinessUnitUsers(Integer id, int usersIdusers) {
        this.id = id;
        this.usersIdusers = usersIdusers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    public Integer getBusinessunitIdbusinessunit() {
        return businessunitIdbusinessunit;
    }

    public void setBusinessunitIdbusinessunit(Integer businessunitIdbusinessunit) {
        this.businessunitIdbusinessunit = businessunitIdbusinessunit;
    }

    public Integer getIdusers() {
        return idusers;
    }

    public void setIdusers(Integer idusers) {
        this.idusers = idusers;
    }

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelBusinessUnitUsers)) {
            return false;
        }
        RelBusinessUnitUsers other = (RelBusinessUnitUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.RelBusinessUnitUsers[ id=" + id + " ]";
    }
    
}
