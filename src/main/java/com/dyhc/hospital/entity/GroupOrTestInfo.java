package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class GroupOrTestInfo {
    private int groupOrTestInfoId;
    private String unitsGroupId;
    private String medicalId;
    private String combinationId;
    private int packageId;

    @Id
    @Column(name = "group_or_test_info_id")
    public int getGroupOrTestInfoId() {
        return groupOrTestInfoId;
    }

    public void setGroupOrTestInfoId(int groupOrTestInfoId) {
        this.groupOrTestInfoId = groupOrTestInfoId;
    }

    @Basic
    @Column(name = "units_group_id")
    public String getUnitsGroupId() {
        return unitsGroupId;
    }

    public void setUnitsGroupId(String unitsGroupId) {
        this.unitsGroupId = unitsGroupId;
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
    @Column(name = "combination_id")
    public String getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    @Basic
    @Column(name = "package_id")
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupOrTestInfo that = (GroupOrTestInfo) o;
        return groupOrTestInfoId == that.groupOrTestInfoId &&
                packageId == that.packageId &&
                Objects.equals(unitsGroupId, that.unitsGroupId) &&
                Objects.equals(medicalId, that.medicalId) &&
                Objects.equals(combinationId, that.combinationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupOrTestInfoId, unitsGroupId, medicalId, combinationId, packageId);
    }
}
