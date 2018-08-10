package com.dyhc.hospital.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Medical {
    private String medicalId;
    private String deskId;
    private String projectName;
    private String applyGender;
    private String pingyingCode;
    private String normalResult;
    private String resultType;
    private BigDecimal price;
    private String promptInfo;
    private String unit;
    private String referenceLowerLimit;
    private String referenceUpperLimit;
    private String lowTip;
    private String highTip;
    private String minValue;
    private String maxValue;
    private int isEnalbe;

    @Id
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "desk_id")
    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }

    @Basic
    @Column(name = "project_name")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "apply_gender")
    public String getApplyGender() {
        return applyGender;
    }

    public void setApplyGender(String applyGender) {
        this.applyGender = applyGender;
    }

    @Basic
    @Column(name = "pingying_code")
    public String getPingyingCode() {
        return pingyingCode;
    }

    public void setPingyingCode(String pingyingCode) {
        this.pingyingCode = pingyingCode;
    }

    @Basic
    @Column(name = "normal_result")
    public String getNormalResult() {
        return normalResult;
    }

    public void setNormalResult(String normalResult) {
        this.normalResult = normalResult;
    }

    @Basic
    @Column(name = "result_type")
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "prompt_info")
    public String getPromptInfo() {
        return promptInfo;
    }

    public void setPromptInfo(String promptInfo) {
        this.promptInfo = promptInfo;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "reference_lower_limit")
    public String getReferenceLowerLimit() {
        return referenceLowerLimit;
    }

    public void setReferenceLowerLimit(String referenceLowerLimit) {
        this.referenceLowerLimit = referenceLowerLimit;
    }

    @Basic
    @Column(name = "reference_ upper_limit")
    public String getReferenceUpperLimit() {
        return referenceUpperLimit;
    }

    public void setReferenceUpperLimit(String referenceUpperLimit) {
        this.referenceUpperLimit = referenceUpperLimit;
    }

    @Basic
    @Column(name = "low_tip")
    public String getLowTip() {
        return lowTip;
    }

    public void setLowTip(String lowTip) {
        this.lowTip = lowTip;
    }

    @Basic
    @Column(name = "high_tip")
    public String getHighTip() {
        return highTip;
    }

    public void setHighTip(String highTip) {
        this.highTip = highTip;
    }

    @Basic
    @Column(name = "min_value")
    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @Basic
    @Column(name = "max_value")
    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    @Basic
    @Column(name = "isEnalbe")
    public int getIsEnalbe() {
        return isEnalbe;
    }

    public void setIsEnalbe(int isEnalbe) {
        this.isEnalbe = isEnalbe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medical medical = (Medical) o;
        return isEnalbe == medical.isEnalbe &&
                Objects.equals(medicalId, medical.medicalId) &&
                Objects.equals(deskId, medical.deskId) &&
                Objects.equals(projectName, medical.projectName) &&
                Objects.equals(applyGender, medical.applyGender) &&
                Objects.equals(pingyingCode, medical.pingyingCode) &&
                Objects.equals(normalResult, medical.normalResult) &&
                Objects.equals(resultType, medical.resultType) &&
                Objects.equals(price, medical.price) &&
                Objects.equals(promptInfo, medical.promptInfo) &&
                Objects.equals(unit, medical.unit) &&
                Objects.equals(referenceLowerLimit, medical.referenceLowerLimit) &&
                Objects.equals(referenceUpperLimit, medical.referenceUpperLimit) &&
                Objects.equals(lowTip, medical.lowTip) &&
                Objects.equals(highTip, medical.highTip) &&
                Objects.equals(minValue, medical.minValue) &&
                Objects.equals(maxValue, medical.maxValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalId, deskId, projectName, applyGender, pingyingCode, normalResult, resultType, price, promptInfo, unit, referenceLowerLimit, referenceUpperLimit, lowTip, highTip, minValue, maxValue, isEnalbe);
    }
}
