package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CommonResults {
    private int commonResultsId;
    private String resultCheckItem;
    private String resultDesc;
    private String pinyinCode;
    private int isPositive;
    private int isConclusion;
    private int isShowProject;
    private int isDelete;

    @Id
    @Column(name = "common_results_id")
    public int getCommonResultsId() {
        return commonResultsId;
    }

    public void setCommonResultsId(int commonResultsId) {
        this.commonResultsId = commonResultsId;
    }

    @Basic
    @Column(name = "result_checkItem")
    public String getResultCheckItem() {
        return resultCheckItem;
    }

    public void setResultCheckItem(String resultCheckItem) {
        this.resultCheckItem = resultCheckItem;
    }

    @Basic
    @Column(name = "resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @Basic
    @Column(name = "pinyin_code")
    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    @Basic
    @Column(name = "isPositive")
    public int getIsPositive() {
        return isPositive;
    }

    public void setIsPositive(int isPositive) {
        this.isPositive = isPositive;
    }

    @Basic
    @Column(name = "isConclusion")
    public int getIsConclusion() {
        return isConclusion;
    }

    public void setIsConclusion(int isConclusion) {
        this.isConclusion = isConclusion;
    }

    @Basic
    @Column(name = "isShowProject")
    public int getIsShowProject() {
        return isShowProject;
    }

    public void setIsShowProject(int isShowProject) {
        this.isShowProject = isShowProject;
    }

    @Basic
    @Column(name = "isDelete")
    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonResults that = (CommonResults) o;
        return commonResultsId == that.commonResultsId &&
                isPositive == that.isPositive &&
                isConclusion == that.isConclusion &&
                isShowProject == that.isShowProject &&
                isDelete == that.isDelete &&
                Objects.equals(resultCheckItem, that.resultCheckItem) &&
                Objects.equals(resultDesc, that.resultDesc) &&
                Objects.equals(pinyinCode, that.pinyinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonResultsId, resultCheckItem, resultDesc, pinyinCode, isPositive, isConclusion, isShowProject, isDelete);
    }
}
