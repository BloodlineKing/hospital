package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PackageMedical {
    private int packageMedicalId;
    private int packageId;
    private String combinationId;
    private String medicalId;

    @Id
    public int getPackageMedicalId() {
        return packageMedicalId;
    }

    public void setPackageMedicalId(int packageMedicalId) {
        this.packageMedicalId = packageMedicalId;
    }

    @Basic
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Basic
    public String getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    @Basic
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
        PackageMedical that = (PackageMedical) o;
        return packageMedicalId == that.packageMedicalId &&
                packageId == that.packageId &&
                Objects.equals(combinationId, that.combinationId) &&
                Objects.equals(medicalId, that.medicalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageMedicalId, packageId, combinationId, medicalId);
    }
}
