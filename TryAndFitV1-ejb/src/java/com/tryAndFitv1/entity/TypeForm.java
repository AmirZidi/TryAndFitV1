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
@Table(name = "type_form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeForm.findAll", query = "SELECT t FROM TypeForm t")
    , @NamedQuery(name = "TypeForm.findById", query = "SELECT t FROM TypeForm t WHERE t.id = :id")
    , @NamedQuery(name = "TypeForm.findByTypeForm", query = "SELECT t FROM TypeForm t WHERE t.typeForm = :typeForm")
    , @NamedQuery(name = "TypeForm.findByDescription", query = "SELECT t FROM TypeForm t WHERE t.description = :description")
    , @NamedQuery(name = "TypeForm.findByImage", query = "SELECT t FROM TypeForm t WHERE t.image = :image")
    , @NamedQuery(name = "TypeForm.findByVideo", query = "SELECT t FROM TypeForm t WHERE t.video = :video")
    , @NamedQuery(name = "TypeForm.findByTexte", query = "SELECT t FROM TypeForm t WHERE t.texte = :texte")
    , @NamedQuery(name = "TypeForm.findBySection", query = "SELECT t FROM TypeForm t WHERE t.section = :section")})
public class TypeForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "type_form")
    private String typeForm;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private Boolean image;
    @Column(name = "video")
    private Boolean video;
    @Column(name = "texte")
    private Boolean texte;
    @Column(name = "section")
    private Boolean section;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "typeForm")
    private FormContent formContent;

    public TypeForm() {
    }

    public TypeForm(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeForm() {
        return typeForm;
    }

    public void setTypeForm(String typeForm) {
        this.typeForm = typeForm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Boolean getTexte() {
        return texte;
    }

    public void setTexte(Boolean texte) {
        this.texte = texte;
    }

    public Boolean getSection() {
        return section;
    }

    public void setSection(Boolean section) {
        this.section = section;
    }

    public FormContent getFormContent() {
        return formContent;
    }

    public void setFormContent(FormContent formContent) {
        this.formContent = formContent;
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
        if (!(object instanceof TypeForm)) {
            return false;
        }
        TypeForm other = (TypeForm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.TypeForm[ id=" + id + " ]";
    }
    
}
