package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class DeskType {
    private int deskTypeId;
    private String deskTypeName;

    @Id
    @Column(name = "desk_type_id")
    public int getDeskTypeId() {
        return deskTypeId;
    }

    public void setDeskTypeId(int deskTypeId) {
        this.deskTypeId = deskTypeId;
    }

    @Basic
    @Column(name = "desk_type_name")
    public String getDeskTypeName() {
        return deskTypeName;
    }

    public void setDeskTypeName(String deskTypeName) {
        this.deskTypeName = deskTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeskType deskType = (DeskType) o;
        return deskTypeId == deskType.deskTypeId &&
                Objects.equals(deskTypeName, deskType.deskTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deskTypeId, deskTypeName);
    }
}
