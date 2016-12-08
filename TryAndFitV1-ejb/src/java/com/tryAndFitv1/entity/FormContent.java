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
@Table(name = "form_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormContent.findAll", query = "SELECT f FROM FormContent f")
    , @NamedQuery(name = "FormContent.findById", query = "SELECT f FROM FormContent f WHERE f.id = :id")
    , @NamedQuery(name = "FormContent.findByCodeQuestion", query = "SELECT f FROM FormContent f WHERE f.codeQuestion = :codeQuestion")
    , @NamedQuery(name = "FormContent.findByQuestionNumber", query = "SELECT f FROM FormContent f WHERE f.questionNumber = :questionNumber")
    , @NamedQuery(name = "FormContent.findByQuestionDescription", query = "SELECT f FROM FormContent f WHERE f.questionDescription = :questionDescription")
    , @NamedQuery(name = "FormContent.findByTypeformIdtypeform", query = "SELECT f FROM FormContent f WHERE f.typeformIdtypeform = :typeformIdtypeform")
    , @NamedQuery(name = "FormContent.findByIdForm", query = "SELECT f FROM FormContent f WHERE f.idForm = :idForm")
    , @NamedQuery(name = "FormContent.findByRank", query = "SELECT f FROM FormContent f WHERE f.rank = :rank")
    , @NamedQuery(name = "FormContent.findByRequiredQuestion", query = "SELECT f FROM FormContent f WHERE f.requiredQuestion = :requiredQuestion")})
public class FormContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "code_question")
    private String codeQuestion;
    @Column(name = "question_number")
    private Integer questionNumber;
    @Size(max = 45)
    @Column(name = "question_description")
    private String questionDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "typeform_idtypeform")
    private int typeformIdtypeform;
    @Column(name = "id_form")
    private Integer idForm;
    @Column(name = "rank")
    private Integer rank;
    @Column(name = "required_question")
    private Boolean requiredQuestion;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Form form;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TypeForm typeForm;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "formContent")
    private Questions questions;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "formContent")
    private Responses responses;

    public FormContent() {
    }

    public FormContent(Integer id) {
        this.id = id;
    }

    public FormContent(Integer id, int typeformIdtypeform) {
        this.id = id;
        this.typeformIdtypeform = typeformIdtypeform;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeQuestion() {
        return codeQuestion;
    }

    public void setCodeQuestion(String codeQuestion) {
        this.codeQuestion = codeQuestion;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public int getTypeformIdtypeform() {
        return typeformIdtypeform;
    }

    public void setTypeformIdtypeform(int typeformIdtypeform) {
        this.typeformIdtypeform = typeformIdtypeform;
    }

    public Integer getIdForm() {
        return idForm;
    }

    public void setIdForm(Integer idForm) {
        this.idForm = idForm;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getRequiredQuestion() {
        return requiredQuestion;
    }

    public void setRequiredQuestion(Boolean requiredQuestion) {
        this.requiredQuestion = requiredQuestion;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public TypeForm getTypeForm() {
        return typeForm;
    }

    public void setTypeForm(TypeForm typeForm) {
        this.typeForm = typeForm;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
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
        if (!(object instanceof FormContent)) {
            return false;
        }
        FormContent other = (FormContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.FormContent[ id=" + id + " ]";
    }
    
}
