package com.dyhc.hospital.entity.conditional;


import com.dyhc.hospital.entity.Medical;

public class MedicalConditional extends Medical {

    //体检所属类型
    private String deskTypeName;
    //体检所属科室名称
    private String deskName;

    public int getTest_status() {
        return test_status;
    }

    public void setTest_status(int test_status) {
        this.test_status = test_status;
    }

    //检查状态
    private int test_status;

    public String getDeskTypeName() {
        return deskTypeName;
    }

    public void setDeskTypeName(String deskTypeName) {
        this.deskTypeName = deskTypeName;
    }

    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName;
    }
}
