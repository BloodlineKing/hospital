package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RoleInfo {
    private int roleInfoId;
    private String roleName;
    private String userName;
    private String password;
    private String deskId;
    private int roleTypeId;

    @Id
    public int getRoleInfoId() {
        return roleInfoId;
    }

    public void setRoleInfoId(int roleInfoId) {
        this.roleInfoId = roleInfoId;
    }

    @Basic
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }

    @Basic
    public int getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(int roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleInfo roleInfo = (RoleInfo) o;
        return roleInfoId == roleInfo.roleInfoId &&
                roleTypeId == roleInfo.roleTypeId &&
                Objects.equals(roleName, roleInfo.roleName) &&
                Objects.equals(userName, roleInfo.userName) &&
                Objects.equals(password, roleInfo.password) &&
                Objects.equals(deskId, roleInfo.deskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleInfoId, roleName, userName, password, deskId, roleTypeId);
    }
}
