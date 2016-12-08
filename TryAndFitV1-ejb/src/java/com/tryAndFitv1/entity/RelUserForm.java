/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "rel_user_form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelUserForm.findAll", query = "SELECT r FROM RelUserForm r")
    , @NamedQuery(name = "RelUserForm.findById", query = "SELECT r FROM RelUserForm r WHERE r.id = :id")
    , @NamedQuery(name = "RelUserForm.findByUsersEmail", query = "SELECT r FROM RelUserForm r WHERE r.usersEmail = :usersEmail")
    , @NamedQuery(name = "RelUserForm.findByUsersIdusers", query = "SELECT r FROM RelUserForm r WHERE r.usersIdusers = :usersIdusers")
    , @NamedQuery(name = "RelUserForm.findByIdUsers", query = "SELECT r FROM RelUserForm r WHERE r.idUsers = :idUsers")
    , @NamedQuery(name = "RelUserForm.findByIdForm", query = "SELECT r FROM RelUserForm r WHERE r.idForm = :idForm")})
public class RelUserForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "users_email")
    private String usersEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "users_idusers")
    private String usersIdusers;
    @Column(name = "id_users")
    private Integer idUsers;
    @Column(name = "id_form")
    private Integer idForm;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "relUserForm")
    private Form form;

    public RelUserForm() {
    }

    public RelUserForm(Integer id) {
        this.id = id;
    }

    public RelUserForm(Integer id, String usersEmail, String usersIdusers) {
        this.id = id;
        this.usersEmail = usersEmail;
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

    public String getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(String usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    public Integer getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Integer idUsers) {
        this.idUsers = idUsers;
    }

    public Integer getIdForm() {
        return idForm;
    }

    public void setIdForm(Integer idForm) {
        this.idForm = idForm;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
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
        if (!(object instanceof RelUserForm)) {
            return false;
        }
        RelUserForm other = (RelUserForm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.RelUserForm[ id=" + id + " ]";
    }
    
}
