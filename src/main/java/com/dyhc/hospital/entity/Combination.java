package com.dyhc.hospital.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Combination {
    private String combinationId;
    private String deskId;
    private String combinationName;
    private String pinyinCode;
    private String clinicalSignificance;
    private String promptInformation;
    private String normalDesc;
    private String checkType;
    private String resultToWay;
    private int isSpecimen;
    private String specimenType;
    private int isEnable;

    @Id
    @Column(name = "combination_id")
    public String getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
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
    @Column(name = "combinationName")
    public String getCombinationName() {
        return combinationName;
    }

    public void setCombinationName(String combinationName) {
        this.combinationName = combinationName;
    }

    @Basic
    @Column(name = "pinyin_code")
    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    @Basic
    @Column(name = "clinical_significance")
    public String getClinicalSignificance() {
        return clinicalSignificance;
    }

    public void setClinicalSignificance(String clinicalSignificance) {
        this.clinicalSignificance = clinicalSignificance;
    }

    @Basic
    @Column(name = "prompt_information")
    public String getPromptInformation() {
        return promptInformation;
    }

    public void setPromptInformation(String promptInformation) {
        this.promptInformation = promptInformation;
    }

    @Basic
    @Column(name = "normalDesc")
    public String getNormalDesc() {
        return normalDesc;
    }

    public void setNormalDesc(String normalDesc) {
        this.normalDesc = normalDesc;
    }

    @Basic
    @Column(name = "checkType")
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    @Basic
    @Column(name = "resultToWay")
    public String getResultToWay() {
        return resultToWay;
    }

    public void setResultToWay(String resultToWay) {
        this.resultToWay = resultToWay;
    }

    @Basic
    @Column(name = "isSpecimen")
    public int getIsSpecimen() {
        return isSpecimen;
    }

    public void setIsSpecimen(int isSpecimen) {
        this.isSpecimen = isSpecimen;
    }

    @Basic
    @Column(name = "specimen_type")
    public String getSpecimenType() {
        return specimenType;
    }

    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType;
    }

    @Basic
    @Column(name = "isEnable")
    public int getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(int isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Combination that = (Combination) o;
        return isSpecimen == that.isSpecimen &&
                isEnable == that.isEnable &&
                Objects.equals(combinationId, that.combinationId) &&
                Objects.equals(deskId, that.deskId) &&
                Objects.equals(combinationName, that.combinationName) &&
                Objects.equals(pinyinCode, that.pinyinCode) &&
                Objects.equals(clinicalSignificance, that.clinicalSignificance) &&
                Objects.equals(promptInformation, that.promptInformation) &&
                Objects.equals(normalDesc, that.normalDesc) &&
                Objects.equals(checkType, that.checkType) &&
                Objects.equals(resultToWay, that.resultToWay) &&
                Objects.equals(specimenType, that.specimenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(combinationId, deskId, combinationName, pinyinCode, clinicalSignificance, promptInformation, normalDesc, checkType, resultToWay, isSpecimen, specimenType, isEnable);
    }
}
