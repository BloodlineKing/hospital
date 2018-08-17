package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.dao.MedicalMapper;
import com.dyhc.hospital.entity.Medical;
import com.dyhc.hospital.entity.specialentity.MedicalPlus;
import com.dyhc.hospital.service.MedicalService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MedicalController {

    @Autowired
    private MedicalService medicalService;

    /**
     * 查询全部体检项
     * @return
     */
    @RequestMapping("getAllMedicalinfo")
    @ResponseBody
    public String getAllMedicalInfo(){
        List<MedicalPlus>list=medicalService.getMedicalInfoByDesk();
        return JSON.toJSONString(list);
    }

    /**
     * 添加体检项
     * @param medical
     * @return
     */
    @RequestMapping("addMedicalinfo")
    @ResponseBody
    public String addMedicalinfo(Medical medical){
        int a=medicalService.addMedicalInfo(medical);
        return JSON.toJSONString(a);
    }




    /**
     * 根据id查询项目信息
     * @param medicalId
     * @return
     */
    @RequestMapping("getMedicalinfoByid")
    @ResponseBody
    public Object getMedicalinfoByid(@Param("medicalId")String medicalId){
        List<MedicalPlus> list = medicalService.getAllMedicalInfoByid(medicalId);
        return JSON.toJSONString(list);
    }


    /**
     * 修改项目信息
     * @param
     * @return
     */
    @RequestMapping("updMedicalinfo")
    @ResponseBody
    public String updMedicalinfo(Medical medical){
        int a=medicalService.updMedicalInfo(medical);
        return JSON.toJSONString(a);
    }
}
