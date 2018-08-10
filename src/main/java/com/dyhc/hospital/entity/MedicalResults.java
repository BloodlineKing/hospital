package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class MedicalResults {
    private int medicalResultsId;
    private String testNumber;
    private String medicalId;
    private int roleInfoId;
    private Date checkDate;
    private int commonResultsId;
    private int proposedDescriptionId;

    @Id
    public int getMedicalResultsId() {
        return medicalResultsId;
    }

    public void setMedicalResultsId(int medicalResultsId) {
        this.medicalResultsId = medicalResultsId;
    }

    @Basic
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    public int getRoleInfoId() {
        return roleInfoId;
    }

    public void setRoleInfoId(int roleInfoId) {
        this.roleInfoId = roleInfoId;
    }

    @Basic
    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    public int getCommonResultsId() {
        return commonResultsId;
    }

    public void setCommonResultsId(int commonResultsId) {
        this.commonResultsId = commonResultsId;
    }

    @Basic
    public int getProposedDescriptionId() {
        return proposedDescriptionId;
    }

    public void setProposedDescriptionId(int proposedDescriptionId) {
        this.proposedDescriptionId = proposedDescriptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalResults that = (MedicalResults) o;
        return medicalResultsId == that.medicalResultsId &&
                roleInfoId == that.roleInfoId &&
                commonResultsId == that.commonResultsId &&
                proposedDescriptionId == that.proposedDescriptionId &&
                Objects.equals(testNumber, that.testNumber) &&
                Objects.equals(medicalId, that.medicalId) &&
                Objects.equals(checkDate, that.checkDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalResultsId, testNumber, medicalId, roleInfoId, checkDate, commonResultsId, proposedDescriptionId);
    }
}
