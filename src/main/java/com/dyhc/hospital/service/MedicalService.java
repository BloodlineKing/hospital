package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.Medical;
import com.dyhc.hospital.entity.specialentity.MedicalPlus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 体检项
 * author ycy
 */
public interface MedicalService {

    /**
     * 查询科室体检项目
     * @return
     */
    List<MedicalPlus> getMedicalInfoByDesk();

    /**
     * 添加科室体检项目
     * @param medical
     * @return
     */
    int addMedicalInfo(Medical medical);


    /**
     * 根据id查询科室体检项目信息
     * @param medicalId
     * @return
     */
    List<MedicalPlus> getAllMedicalInfoByid(@Param("medicalId") String medicalId);

    /**
     * 根据拼音简码查询体检信息
     */
    List<MedicalPlus> getMedicalList(@Param("namecode") String namecode);

    /**
     * 修改科室科室信息
     * @param medical
     * @return
     */
    int updMedicalInfo(Medical medical);
}
