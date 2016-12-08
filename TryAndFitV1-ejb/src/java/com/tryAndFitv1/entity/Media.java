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
@Table(name = "media")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Media.findAll", query = "SELECT m FROM Media m")
    , @NamedQuery(name = "Media.findById", query = "SELECT m FROM Media m WHERE m.id = :id")
    , @NamedQuery(name = "Media.findByResponsesIdresponses", query = "SELECT m FROM Media m WHERE m.responsesIdresponses = :responsesIdresponses")
    , @NamedQuery(name = "Media.findByQuestionsIdquestions", query = "SELECT m FROM Media m WHERE m.questionsIdquestions = :questionsIdquestions")
    , @NamedQuery(name = "Media.findByMediaType", query = "SELECT m FROM Media m WHERE m.mediaType = :mediaType")
    , @NamedQuery(name = "Media.findByMediaDescription", query = "SELECT m FROM Media m WHERE m.mediaDescription = :mediaDescription")
    , @NamedQuery(name = "Media.findByImage", query = "SELECT m FROM Media m WHERE m.image = :image")
    , @NamedQuery(name = "Media.findByVideo", query = "SELECT m FROM Media m WHERE m.video = :video")
    , @NamedQuery(name = "Media.findByText", query = "SELECT m FROM Media m WHERE m.text = :text")})
public class Media implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "responses_idresponses")
    private int responsesIdresponses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "questions_idquestions")
    private int questionsIdquestions;
    @Size(max = 20)
    @Column(name = "media_type")
    private String mediaType;
    @Column(name = "media_description")
    private Integer mediaDescription;
    @Size(max = 45)
    @Column(name = "image")
    private String image;
    @Size(max = 45)
    @Column(name = "video")
    private String video;
    @Size(max = 45)
    @Column(name = "text")
    private String text;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Questions questions;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Responses responses;

    public Media() {
    }

    public Media(Integer id) {
        this.id = id;
    }

    public Media(Integer id, int responsesIdresponses, int questionsIdquestions) {
        this.id = id;
        this.responsesIdresponses = responsesIdresponses;
        this.questionsIdquestions = questionsIdquestions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getResponsesIdresponses() {
        return responsesIdresponses;
    }

    public void setResponsesIdresponses(int responsesIdresponses) {
        this.responsesIdresponses = responsesIdresponses;
    }

    public int getQuestionsIdquestions() {
        return questionsIdquestions;
    }

    public void setQuestionsIdquestions(int questionsIdquestions) {
        this.questionsIdquestions = questionsIdquestions;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Integer getMediaDescription() {
        return mediaDescription;
    }

    public void setMediaDescription(Integer mediaDescription) {
        this.mediaDescription = mediaDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        if (!(object instanceof Media)) {
            return false;
        }
        Media other = (Media) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.Media[ id=" + id + " ]";
    }
    
}
