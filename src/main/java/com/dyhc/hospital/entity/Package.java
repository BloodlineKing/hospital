package com.dyhc.hospital.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Package {
    private int packageId;
    private String packageName;
    private String scopeApplication;
    private String note;
    private int isEnable;

    @Id
    @Column(name = "package_id")
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "package_name")
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Basic
    @Column(name = "scope_application")
    public String getScopeApplication() {
        return scopeApplication;
    }

    public void setScopeApplication(String scopeApplication) {
        this.scopeApplication = scopeApplication;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        Package aPackage = (Package) o;
        return packageId == aPackage.packageId &&
                isEnable == aPackage.isEnable &&
                Objects.equals(packageName, aPackage.packageName) &&
                Objects.equals(scopeApplication, aPackage.scopeApplication) &&
                Objects.equals(note, aPackage.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, packageName, scopeApplication, note, isEnable);
    }
}
