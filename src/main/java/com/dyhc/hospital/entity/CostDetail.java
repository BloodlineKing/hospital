package com.dyhc.hospital.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cost_detail", schema = "hospital_test_manager_db", catalog = "")
public class CostDetail {
    private int costDetailId;
    private String testNumber;
    private String medicalId;
    private int costType;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date date;
    private String note;

    @Id
    @Column(name = "cost_detail_id")
    public int getCostDetailId() {
        return costDetailId;
    }

    public void setCostDetailId(int costDetailId) {
        this.costDetailId = costDetailId;
    }

    @Basic
    @Column(name = "test_number")
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "cost_type")
    public int getCostType() {
        return costType;
    }

    public void setCostType(int costType) {
        this.costType = costType;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CostDetail that = (CostDetail) o;
        return costDetailId == that.costDetailId &&
                costType == that.costType &&
                Objects.equals(testNumber, that.testNumber) &&
                Objects.equals(medicalId, that.medicalId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costDetailId, testNumber, medicalId, costType, date, note);
    }
}
