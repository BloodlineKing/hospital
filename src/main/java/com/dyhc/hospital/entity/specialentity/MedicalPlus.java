package com.dyhc.hospital.entity.specialentity;

import com.dyhc.hospital.entity.Medical;

public class MedicalPlus extends Medical {

    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName;
    }

    private String deskName;

    public String getDesk_id() {
        return desk_id;
    }

    public void setDesk_id(String desk_id) {
        this.desk_id = desk_id;
    }

    private String desk_id;


}
