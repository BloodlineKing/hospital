package com.dyhc.hospital.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class UserRegisterInfo {
    private String testNumber;
    private String userName;
    private int age;
    @JSONField(format = "yyyy-MM-dd")
    private Date born;
    private String sex;
    private String idCard;
    private Integer maritalStatus;
    private String telephone;
    private String address;
    private String nameCode;
    private String workNumber;
    private String personType;
    private int status;
    private Integer belongtoUnits;
    @JSONField(format = "yyyy-MM-dd")
    private Date createTime;
    private int createBy;

    @Id
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    @Basic
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Basic
    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    @Basic
    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    @Basic
    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    @Basic
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    public Integer getBelongtoUnits() {
        return belongtoUnits;
    }

    public void setBelongtoUnits(Integer belongtoUnits) {
        this.belongtoUnits = belongtoUnits;
    }

    @Basic
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegisterInfo that = (UserRegisterInfo) o;
        return age == that.age &&
                status == that.status &&
                createBy == that.createBy &&
                Objects.equals(testNumber, that.testNumber) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(born, that.born) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(idCard, that.idCard) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(nameCode, that.nameCode) &&
                Objects.equals(workNumber, that.workNumber) &&
                Objects.equals(personType, that.personType) &&
                Objects.equals(belongtoUnits, that.belongtoUnits) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testNumber, userName, age, born, sex, idCard, maritalStatus, telephone, address, nameCode, workNumber, personType, status, belongtoUnits, createTime, createBy);
    }
}
