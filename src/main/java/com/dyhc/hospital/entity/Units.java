package com.dyhc.hospital.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Units {
    private String unitsId;
    private String unitsName;
    private String spellCode;
    private String unitsPrincipal;
    private String telephone;
    private String postalCode;
    private String address;
    private String businessBank;
    private String bankNumber;
    private String companyNature;
    private int authorizedNumber;
    private String remark;
    private int isdelete;
    private int createBy;
    private Date createTime;
    private int modifyBy;
    private Date modifyTime;

    @Id
    @Column(name = "units_id")
    public String getUnitsId() {
        return unitsId;
    }

    public void setUnitsId(String unitsId) {
        this.unitsId = unitsId;
    }

    @Basic
    @Column(name = "units_name")
    public String getUnitsName() {
        return unitsName;
    }

    public void setUnitsName(String unitsName) {
        this.unitsName = unitsName;
    }

    @Basic
    @Column(name = "spell_code")
    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    @Basic
    @Column(name = "units_principal")
    public String getUnitsPrincipal() {
        return unitsPrincipal;
    }

    public void setUnitsPrincipal(String unitsPrincipal) {
        this.unitsPrincipal = unitsPrincipal;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "business_bank")
    public String getBusinessBank() {
        return businessBank;
    }

    public void setBusinessBank(String businessBank) {
        this.businessBank = businessBank;
    }

    @Basic
    @Column(name = "bank_number")
    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Basic
    @Column(name = "company_nature")
    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
    }

    @Basic
    @Column(name = "authorized_number")
    public int getAuthorizedNumber() {
        return authorizedNumber;
    }

    public void setAuthorizedNumber(int authorizedNumber) {
        this.authorizedNumber = authorizedNumber;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "isdelete")
    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Basic
    @Column(name = "create_by")
    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modify_by")
    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Basic
    @Column(name = "modify_time")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Units units = (Units) o;
        return authorizedNumber == units.authorizedNumber &&
                isdelete == units.isdelete &&
                createBy == units.createBy &&
                modifyBy == units.modifyBy &&
                Objects.equals(unitsId, units.unitsId) &&
                Objects.equals(unitsName, units.unitsName) &&
                Objects.equals(spellCode, units.spellCode) &&
                Objects.equals(unitsPrincipal, units.unitsPrincipal) &&
                Objects.equals(telephone, units.telephone) &&
                Objects.equals(postalCode, units.postalCode) &&
                Objects.equals(address, units.address) &&
                Objects.equals(businessBank, units.businessBank) &&
                Objects.equals(bankNumber, units.bankNumber) &&
                Objects.equals(companyNature, units.companyNature) &&
                Objects.equals(remark, units.remark) &&
                Objects.equals(createTime, units.createTime) &&
                Objects.equals(modifyTime, units.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitsId, unitsName, spellCode, unitsPrincipal, telephone, postalCode, address, businessBank, bankNumber, companyNature, authorizedNumber, remark, isdelete, createBy, createTime, modifyBy, modifyTime);
    }
}
