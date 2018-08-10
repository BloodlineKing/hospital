package com.dyhc.hospital.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class UnitsGroup {
    private String unitsGroupId;
    private String groupName;
    private String unitsId;
    private String sexCondition;
    private String maritalCondition;
    private Integer ageUpperLimit;
    private Integer ageLowerLimit;
    private String dutyCondition;
    private int createBy;
    @JSONField(format = "yyyy-MM-dd")
    private Date createTime;
    private int modifyBy;
    @JSONField(format = "yyyy-MM-dd")
    private Date modifuTime;
    private int isdelete;

    @Id
    public String getUnitsGroupId() {
        return unitsGroupId;
    }

    public void setUnitsGroupId(String unitsGroupId) {
        this.unitsGroupId = unitsGroupId;
    }

    @Basic
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    public String getUnitsId() {
        return unitsId;
    }

    public void setUnitsId(String unitsId) {
        this.unitsId = unitsId;
    }

    @Basic
    public String getSexCondition() {
        return sexCondition;
    }

    public void setSexCondition(String sexCondition) {
        this.sexCondition = sexCondition;
    }

    @Basic
    public String getMaritalCondition() {
        return maritalCondition;
    }

    public void setMaritalCondition(String maritalCondition) {
        this.maritalCondition = maritalCondition;
    }

    @Basic
    public Integer getAgeUpperLimit() {
        return ageUpperLimit;
    }

    public void setAgeUpperLimit(Integer ageUpperLimit) {
        this.ageUpperLimit = ageUpperLimit;
    }

    @Basic
    public Integer getAgeLowerLimit() {
        return ageLowerLimit;
    }

    public void setAgeLowerLimit(Integer ageLowerLimit) {
        this.ageLowerLimit = ageLowerLimit;
    }

    @Basic
    public String getDutyCondition() {
        return dutyCondition;
    }

    public void setDutyCondition(String dutyCondition) {
        this.dutyCondition = dutyCondition;
    }

    @Basic
    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    @Basic
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Basic
    public Date getModifuTime() {
        return modifuTime;
    }

    public void setModifuTime(Date modifuTime) {
        this.modifuTime = modifuTime;
    }

    @Basic
    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitsGroup that = (UnitsGroup) o;
        return createBy == that.createBy &&
                modifyBy == that.modifyBy &&
                isdelete == that.isdelete &&
                Objects.equals(unitsGroupId, that.unitsGroupId) &&
                Objects.equals(groupName, that.groupName) &&
                Objects.equals(unitsId, that.unitsId) &&
                Objects.equals(sexCondition, that.sexCondition) &&
                Objects.equals(maritalCondition, that.maritalCondition) &&
                Objects.equals(ageUpperLimit, that.ageUpperLimit) &&
                Objects.equals(ageLowerLimit, that.ageLowerLimit) &&
                Objects.equals(dutyCondition, that.dutyCondition) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifuTime, that.modifuTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitsGroupId, groupName, unitsId, sexCondition, maritalCondition, ageUpperLimit, ageLowerLimit, dutyCondition, createBy, createTime, modifyBy, modifuTime, isdelete);
    }
}
