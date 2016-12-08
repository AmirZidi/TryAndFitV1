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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amir.zidi
 */
@Entity
@Table(name = "json_param")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JsonParam.findAll", query = "SELECT j FROM JsonParam j")
    , @NamedQuery(name = "JsonParam.findById", query = "SELECT j FROM JsonParam j WHERE j.id = :id")
    , @NamedQuery(name = "JsonParam.findByLabel", query = "SELECT j FROM JsonParam j WHERE j.label = :label")
    , @NamedQuery(name = "JsonParam.findByDescription", query = "SELECT j FROM JsonParam j WHERE j.description = :description")
    , @NamedQuery(name = "JsonParam.findByClassName", query = "SELECT j FROM JsonParam j WHERE j.className = :className")
    , @NamedQuery(name = "JsonParam.findByName", query = "SELECT j FROM JsonParam j WHERE j.name = :name")
    , @NamedQuery(name = "JsonParam.findByValue", query = "SELECT j FROM JsonParam j WHERE j.value = :value")
    , @NamedQuery(name = "JsonParam.findByEnableRoles", query = "SELECT j FROM JsonParam j WHERE j.enableRoles = :enableRoles")
    , @NamedQuery(name = "JsonParam.findByRequired", query = "SELECT j FROM JsonParam j WHERE j.required = :required")
    , @NamedQuery(name = "JsonParam.findByButtonStyle", query = "SELECT j FROM JsonParam j WHERE j.buttonStyle = :buttonStyle")
    , @NamedQuery(name = "JsonParam.findByToggle", query = "SELECT j FROM JsonParam j WHERE j.toggle = :toggle")
    , @NamedQuery(name = "JsonParam.findByType", query = "SELECT j FROM JsonParam j WHERE j.type = :type")
    , @NamedQuery(name = "JsonParam.findByEnableOther", query = "SELECT j FROM JsonParam j WHERE j.enableOther = :enableOther")
    , @NamedQuery(name = "JsonParam.findByOptionValues", query = "SELECT j FROM JsonParam j WHERE j.optionValues = :optionValues")
    , @NamedQuery(name = "JsonParam.findByMultiple", query = "SELECT j FROM JsonParam j WHERE j.multiple = :multiple")
    , @NamedQuery(name = "JsonParam.findByMaxlength", query = "SELECT j FROM JsonParam j WHERE j.maxlength = :maxlength")
    , @NamedQuery(name = "JsonParam.findByParagraphContent", query = "SELECT j FROM JsonParam j WHERE j.paragraphContent = :paragraphContent")
    , @NamedQuery(name = "JsonParam.findByMin", query = "SELECT j FROM JsonParam j WHERE j.min = :min")
    , @NamedQuery(name = "JsonParam.findByMax", query = "SELECT j FROM JsonParam j WHERE j.max = :max")
    , @NamedQuery(name = "JsonParam.findByPlaceHolder", query = "SELECT j FROM JsonParam j WHERE j.placeHolder = :placeHolder")})
public class JsonParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "label")
    private String label;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @Size(max = 45)
    @Column(name = "class_name")
    private String className;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "value")
    private String value;
    @Column(name = "enable_roles")
    private Boolean enableRoles;
    @Column(name = "required")
    private Boolean required;
    @Size(max = 45)
    @Column(name = "button_style")
    private String buttonStyle;
    @Column(name = "toggle")
    private Boolean toggle;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Size(max = 45)
    @Column(name = "enable_other")
    private String enableOther;
    @Size(max = 45)
    @Column(name = "option_values")
    private String optionValues;
    @Column(name = "multiple")
    private Boolean multiple;
    @Column(name = "maxlength")
    private Integer maxlength;
    @Size(max = 255)
    @Column(name = "paragraph_content")
    private String paragraphContent;
    @Column(name = "min")
    private Integer min;
    @Column(name = "max")
    private Integer max;
    @Size(max = 45)
    @Column(name = "place_holder")
    private String placeHolder;

    public JsonParam() {
    }

    public JsonParam(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getEnableRoles() {
        return enableRoles;
    }

    public void setEnableRoles(Boolean enableRoles) {
        this.enableRoles = enableRoles;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getButtonStyle() {
        return buttonStyle;
    }

    public void setButtonStyle(String buttonStyle) {
        this.buttonStyle = buttonStyle;
    }

    public Boolean getToggle() {
        return toggle;
    }

    public void setToggle(Boolean toggle) {
        this.toggle = toggle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnableOther() {
        return enableOther;
    }

    public void setEnableOther(String enableOther) {
        this.enableOther = enableOther;
    }

    public String getOptionValues() {
        return optionValues;
    }

    public void setOptionValues(String optionValues) {
        this.optionValues = optionValues;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public Integer getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(Integer maxlength) {
        this.maxlength = maxlength;
    }

    public String getParagraphContent() {
        return paragraphContent;
    }

    public void setParagraphContent(String paragraphContent) {
        this.paragraphContent = paragraphContent;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
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
        if (!(object instanceof JsonParam)) {
            return false;
        }
        JsonParam other = (JsonParam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tryAndFitv1.entity.JsonParam[ id=" + id + " ]";
    }
    
}
