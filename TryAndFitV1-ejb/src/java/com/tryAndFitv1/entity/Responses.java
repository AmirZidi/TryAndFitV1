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
@Table(name = "responses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responses.findAll", query = "SELECT r FROM Responses r")
    , @NamedQuery(name = "Responses.findById", query = "SELECT r FROM Responses r WHERE r.id = :id")
    , @NamedQuery(name = "Responses.findByFormcontentIdformcontent", query = "SELECT r FROM Responses r WHERE r.formcontentIdformcontent = :formcontentIdformcontent")
    , @NamedQuery(name = "Responses.findByIdWaitedresponse", query = "SELECT r FROM Responses r WHERE r.idWaitedresponse = :idWaitedresponse")
    , @NamedQuery(name = "Responses.findByIdMedia", query = "SELECT r FROM Responses r WHERE r.idMedia = :idMedia")
    , @NamedQuery(name = "Responses.findByCodeQuestions", query = "SELECT r FROM Responses r WHERE r.codeQuestions = :codeQuestions")})
public class Responses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "formcontent_idformcontent")
    private int formcontentIdformcontent;
    @Column(name = "id_waitedresponse")
    private Integer idWaitedresponse;
    @Column(name = "id_media")
    private Integer idMedia;
    @Size(max = 45)
    @Column(name = "code_questions")
    private String codeQuestions;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private FormContent formContent;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "responses")
    private Media media;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "responses")
    private UserResponses userResponses;

    public Responses() {
    }

    public Responses(Integer id) {
        this.id = id;
    }

    public Responses(Integer id, int formcontentIdformcontent) {
        this.id = id;
        this.formcontentIdformcontent = formcontentIdformcontent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFormcontentIdformcontent() {
        return formcontentIdformcontent;
    }

    public void setFormcontentIdformcontent(int formcontentIdformcontent) {
        this.formcontentIdformcontent = formcontentIdformcontent;
    }

    public Integer getIdWaitedresponse() {
        return idWaitedresponse;
    }

    public void setIdWaitedresponse(Integer idWaitedresponse) {
        this.idWaitedresponse = idWaitedresponse;
    }

    public Integer getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(Integer idMedia) {
        this.idMedia = idMedia;
    }

    public String getCodeQuestions() {
        return codeQuestions;
    }

    public void setCodeQuestions(String codeQuestions) {
        this.codeQuestions = codeQuestions;
    }

    public FormContent getFormContent() {
        return formContent;
    }

    public void setFormContent(FormContent formContent) {
        this.formContent = formContent;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public UserResponses getUserResponses() {
        return userResponses;
    }

    public void setUserResponses(UserResponses userResponses) {
        this.userResponses = userResponses;
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
        if (!(object instanceof Responses)) {
            return false;
        }
        Responses other = (Responses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.Responses[ id=" + id + " ]";
    }
    
}
