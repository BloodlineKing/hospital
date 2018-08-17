package com.dyhc.hospital.entity;

import com.dyhc.hospital.entity.specialentity.MedicalPlus;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Entity
public class Desk {
    private String deskId;
    private String deskName;
    private int deskTypeId;
    private String deskSummary;
    private int deskStatus;
    private String remark;
    private List<MedicalPlus> madicallist;

    public List<MedicalPlus> getMadicallist() {
        return madicallist;
    }

    public void setMadicallist(List<MedicalPlus> madicallist) {
        this.madicallist = madicallist;
    }



    @Id
    @Column(name = "desk_id")
    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }

    @Basic
    @Column(name = "desk_name")
    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName;
    }

    @Basic
    @Column(name = "desk_type_id")
    public int getDeskTypeId() {
        return deskTypeId;
    }

    public void setDeskTypeId(int deskTypeId) {
        this.deskTypeId = deskTypeId;
    }

    @Basic
    @Column(name = "desk_summary")
    public String getDeskSummary() {
        return deskSummary;
    }

    public void setDeskSummary(String deskSummary) {
        this.deskSummary = deskSummary;
    }

    @Basic
    @Column(name = "desk_status")
    public int getDeskStatus() {
        return deskStatus;
    }

    public void setDeskStatus(int deskStatus) {
        this.deskStatus = deskStatus;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desk desk = (Desk) o;
        return deskTypeId == desk.deskTypeId &&
                deskStatus == desk.deskStatus &&
                Objects.equals(deskId, desk.deskId) &&
                Objects.equals(deskName, desk.deskName) &&
                Objects.equals(deskSummary, desk.deskSummary) &&
                Objects.equals(remark, desk.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deskId, deskName, deskTypeId, deskSummary, deskStatus, remark);
    }
}
