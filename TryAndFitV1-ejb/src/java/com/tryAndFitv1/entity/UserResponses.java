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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amir.zidi
 */
@Entity
@Table(name = "user_responses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserResponses.findAll", query = "SELECT u FROM UserResponses u")
    , @NamedQuery(name = "UserResponses.findById", query = "SELECT u FROM UserResponses u WHERE u.id = :id")
    , @NamedQuery(name = "UserResponses.findByResponsesIdresponses", query = "SELECT u FROM UserResponses u WHERE u.responsesIdresponses = :responsesIdresponses")
    , @NamedQuery(name = "UserResponses.findByEmail", query = "SELECT u FROM UserResponses u WHERE u.email = :email")
    , @NamedQuery(name = "UserResponses.findByLogin", query = "SELECT u FROM UserResponses u WHERE u.login = :login")
    , @NamedQuery(name = "UserResponses.findByPwd", query = "SELECT u FROM UserResponses u WHERE u.pwd = :pwd")
    , @NamedQuery(name = "UserResponses.findByCodeQuestions", query = "SELECT u FROM UserResponses u WHERE u.codeQuestions = :codeQuestions")
    , @NamedQuery(name = "UserResponses.findByIdWaitedresponses", query = "SELECT u FROM UserResponses u WHERE u.idWaitedresponses = :idWaitedresponses")})
public class UserResponses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "responses_idresponses")
    private Integer responsesIdresponses;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "login")
    private String login;
    @Size(max = 45)
    @Column(name = "pwd")
    private String pwd;
    @Size(max = 45)
    @Column(name = "code_questions")
    private String codeQuestions;
    @Size(max = 45)
    @Column(name = "id_waitedresponses")
    private String idWaitedresponses;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Responses responses;

    public UserResponses() {
    }

    public UserResponses(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResponsesIdresponses() {
        return responsesIdresponses;
    }

    public void setResponsesIdresponses(Integer responsesIdresponses) {
        this.responsesIdresponses = responsesIdresponses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCodeQuestions() {
        return codeQuestions;
    }

    public void setCodeQuestions(String codeQuestions) {
        this.codeQuestions = codeQuestions;
    }

    public String getIdWaitedresponses() {
        return idWaitedresponses;
    }

    public void setIdWaitedresponses(String idWaitedresponses) {
        this.idWaitedresponses = idWaitedresponses;
    }

    public Responses getResponses() {
        return responses;
    }

    public void setResponses(Responses responses) {
        this.responses = responses;
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
        if (!(object instanceof UserResponses)) {
            return false;
        }
        UserResponses other = (UserResponses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.UserResponses[ id=" + id + " ]";
    }
    
}
