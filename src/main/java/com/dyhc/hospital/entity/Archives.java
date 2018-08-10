package com.dyhc.hospital.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Archives {
    private String archivesId;
    private String testNumber;
    private int checkCount;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date archivesDate;

    @Id
    @Column(name = "archives_id")
    public String getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(String archivesId) {
        this.archivesId = archivesId;
    }

    @Basic
    @Column(name = "test_number")
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    @Column(name = "check_count")
    public int getCheckCount() {
        return checkCount;
    }

    public void setCheckCount(int checkCount) {
        this.checkCount = checkCount;
    }

    @Basic
    @Column(name = "archives_ date")
    public Date getArchivesDate() {
        return archivesDate;
    }

    public void setArchivesDate(Date archivesDate) {
        this.archivesDate = archivesDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Archives archives = (Archives) o;
        return checkCount == archives.checkCount &&
                Objects.equals(archivesId, archives.archivesId) &&
                Objects.equals(testNumber, archives.testNumber) &&
                Objects.equals(archivesDate, archives.archivesDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archivesId, testNumber, checkCount, archivesDate);
    }
}
