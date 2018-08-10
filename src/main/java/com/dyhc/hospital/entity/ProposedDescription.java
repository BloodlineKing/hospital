package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ProposedDescription {
    private int proposedDescriptionId;
    private int commonResultsId;
    private String sciencePopularization;
    private String adviceContent;
    private int isDelete;

    @Id
    public int getProposedDescriptionId() {
        return proposedDescriptionId;
    }

    public void setProposedDescriptionId(int proposedDescriptionId) {
        this.proposedDescriptionId = proposedDescriptionId;
    }

    @Basic
    public int getCommonResultsId() {
        return commonResultsId;
    }

    public void setCommonResultsId(int commonResultsId) {
        this.commonResultsId = commonResultsId;
    }

    @Basic
    public String getSciencePopularization() {
        return sciencePopularization;
    }

    public void setSciencePopularization(String sciencePopularization) {
        this.sciencePopularization = sciencePopularization;
    }

    @Basic
    public String getAdviceContent() {
        return adviceContent;
    }

    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent;
    }

    @Basic
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
        ProposedDescription that = (ProposedDescription) o;
        return proposedDescriptionId == that.proposedDescriptionId &&
                commonResultsId == that.commonResultsId &&
                isDelete == that.isDelete &&
                Objects.equals(sciencePopularization, that.sciencePopularization) &&
                Objects.equals(adviceContent, that.adviceContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proposedDescriptionId, commonResultsId, sciencePopularization, adviceContent, isDelete);
    }
}
