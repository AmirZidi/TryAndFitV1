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
@Table(name = "questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q")
    , @NamedQuery(name = "Questions.findById", query = "SELECT q FROM Questions q WHERE q.id = :id")
    , @NamedQuery(name = "Questions.findByFormContentidFormContent", query = "SELECT q FROM Questions q WHERE q.formContentidFormContent = :formContentidFormContent")
    , @NamedQuery(name = "Questions.findByCodeQuestion", query = "SELECT q FROM Questions q WHERE q.codeQuestion = :codeQuestion")
    , @NamedQuery(name = "Questions.findByIdMedia", query = "SELECT q FROM Questions q WHERE q.idMedia = :idMedia")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormContent_idFormContent")
    private int formContentidFormContent;
    @Size(max = 45)
    @Column(name = "code_question")
    private String codeQuestion;
    @Column(name = "id_media")
    private Integer idMedia;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private FormContent formContent;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "questions")
    private Media media;

    public Questions() {
    }

    public Questions(Integer id) {
        this.id = id;
    }

    public Questions(Integer id, int formContentidFormContent) {
        this.id = id;
        this.formContentidFormContent = formContentidFormContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFormContentidFormContent() {
        return formContentidFormContent;
    }

    public void setFormContentidFormContent(int formContentidFormContent) {
        this.formContentidFormContent = formContentidFormContent;
    }

    public String getCodeQuestion() {
        return codeQuestion;
    }

    public void setCodeQuestion(String codeQuestion) {
        this.codeQuestion = codeQuestion;
    }

    public Integer getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(Integer idMedia) {
        this.idMedia = idMedia;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.Questions[ id=" + id + " ]";
    }
    
}
