package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CombinationMedical {
    private int combinationMedicalId;
    private String combinationId;
    private String medicalId;

    @Id
    @Column(name = "combination_ medical_id")
    public int getCombinationMedicalId() {
        return combinationMedicalId;
    }

    public void setCombinationMedicalId(int combinationMedicalId) {
        this.combinationMedicalId = combinationMedicalId;
    }

    @Basic
    @Column(name = "combination_id")
    public String getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    @Basic
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CombinationMedical that = (CombinationMedical) o;
        return combinationMedicalId == that.combinationMedicalId &&
                Objects.equals(combinationId, that.combinationId) &&
                Objects.equals(medicalId, that.medicalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(combinationMedicalId, combinationId, medicalId);
    }
}
