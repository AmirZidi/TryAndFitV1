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
@Table(name = "form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Form.findAll", query = "SELECT f FROM Form f")
    , @NamedQuery(name = "Form.findById", query = "SELECT f FROM Form f WHERE f.id = :id")
    , @NamedQuery(name = "Form.findByReluserformIdreluserform", query = "SELECT f FROM Form f WHERE f.reluserformIdreluserform = :reluserformIdreluserform")
    , @NamedQuery(name = "Form.findByTitre", query = "SELECT f FROM Form f WHERE f.titre = :titre")
    , @NamedQuery(name = "Form.findByDescription", query = "SELECT f FROM Form f WHERE f.description = :description")
    , @NamedQuery(name = "Form.findByIdusers", query = "SELECT f FROM Form f WHERE f.idusers = :idusers")
    , @NamedQuery(name = "Form.findByGeneratedUrl", query = "SELECT f FROM Form f WHERE f.generatedUrl = :generatedUrl")})
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reluserform_idreluserform")
    private int reluserformIdreluserform;
    @Size(max = 45)
    @Column(name = "titre")
    private String titre;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @Column(name = "idusers")
    private Integer idusers;
    @Size(max = 45)
    @Column(name = "generated_url")
    private String generatedUrl;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "form")
    private FormContent formContent;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private RelUserForm relUserForm;

    public Form() {
    }

    public Form(Integer id) {
        this.id = id;
    }

    public Form(Integer id, int reluserformIdreluserform) {
        this.id = id;
        this.reluserformIdreluserform = reluserformIdreluserform;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getReluserformIdreluserform() {
        return reluserformIdreluserform;
    }

    public void setReluserformIdreluserform(int reluserformIdreluserform) {
        this.reluserformIdreluserform = reluserformIdreluserform;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdusers() {
        return idusers;
    }

    public void setIdusers(Integer idusers) {
        this.idusers = idusers;
    }

    public String getGeneratedUrl() {
        return generatedUrl;
    }

    public void setGeneratedUrl(String generatedUrl) {
        this.generatedUrl = generatedUrl;
    }

    public FormContent getFormContent() {
        return formContent;
    }

    public void setFormContent(FormContent formContent) {
        this.formContent = formContent;
    }

    public RelUserForm getRelUserForm() {
        return relUserForm;
    }

    public void setRelUserForm(RelUserForm relUserForm) {
        this.relUserForm = relUserForm;
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
        if (!(object instanceof Form)) {
            return false;
        }
        Form other = (Form) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.Form[ id=" + id + " ]";
    }
    
}
