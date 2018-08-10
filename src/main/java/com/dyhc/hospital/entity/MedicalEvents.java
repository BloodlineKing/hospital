package com.dyhc.hospital.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MedicalEvents {
    private int medicalEventsId;
    private String eventsName;
    private String unit;
    private String referenceLowerLimit;
    private String referenceUpperLimit;
    private String lowTip;
    private String highTip;
    private String minValue;
    private String maxValue;
    private String medicalId;

    @Id
    @Column(name = "medical_events_id")
    public int getMedicalEventsId() {
        return medicalEventsId;
    }

    public void setMedicalEventsId(int medicalEventsId) {
        this.medicalEventsId = medicalEventsId;
    }

    @Basic
    @Column(name = "events_name")
    public String getEventsName() {
        return eventsName;
    }

    public void setEventsName(String eventsName) {
        this.eventsName = eventsName;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "reference_ lower_limit")
    public String getReferenceLowerLimit() {
        return referenceLowerLimit;
    }

    public void setReferenceLowerLimit(String referenceLowerLimit) {
        this.referenceLowerLimit = referenceLowerLimit;
    }

    @Basic
    @Column(name = "reference_ upper_limit")
    public String getReferenceUpperLimit() {
        return referenceUpperLimit;
    }

    public void setReferenceUpperLimit(String referenceUpperLimit) {
        this.referenceUpperLimit = referenceUpperLimit;
    }

    @Basic
    @Column(name = "low_tip")
    public String getLowTip() {
        return lowTip;
    }

    public void setLowTip(String lowTip) {
        this.lowTip = lowTip;
    }

    @Basic
    @Column(name = "high_tip")
    public String getHighTip() {
        return highTip;
    }

    public void setHighTip(String highTip) {
        this.highTip = highTip;
    }

    @Basic
    @Column(name = "min_value")
    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @Basic
    @Column(name = "max_value")
    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    @Basic
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalEvents that = (MedicalEvents) o;
        return medicalEventsId == that.medicalEventsId &&
                Objects.equals(eventsName, that.eventsName) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(referenceLowerLimit, that.referenceLowerLimit) &&
                Objects.equals(referenceUpperLimit, that.referenceUpperLimit) &&
                Objects.equals(lowTip, that.lowTip) &&
                Objects.equals(highTip, that.highTip) &&
                Objects.equals(minValue, that.minValue) &&
                Objects.equals(maxValue, that.maxValue) &&
                Objects.equals(medicalId, that.medicalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalEventsId, eventsName, unit, referenceLowerLimit, referenceUpperLimit, lowTip, highTip, minValue, maxValue, medicalId);
    }
}
