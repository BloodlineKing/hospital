package com.dyhc.hospital.dao;


import com.dyhc.hospital.entity.Medical;
import com.dyhc.hospital.entity.specialentity.MedicalPlus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 科室体检项接口
 * ycy
 */
@Mapper
@Repository
public interface MedicalMapper {

    /**
     * 查询科室体检项目
     * @return
     */
    List<MedicalPlus> getMedicalInfoByDesk() throws  Exception;

    /**
     * 添加科室体检项目
     * @param medical
     * @return
     */
    int addMedicalInfo(Medical medical) throws  Exception;


    /**
     * 根据id查询科室体检项目信息
     * @param medicalId
     * @return
     */
    List<MedicalPlus> getAllMedicalInfoByid(@Param("medicalId") String medicalId) throws  Exception;

    /**
     * 根据拼音简码查询体检信息
     */
    List<MedicalPlus> getMedicalList(@Param("namecode") String namecode)throws  Exception;

    /**
     * 修改科室科室信息
     * @param medical
     * @return
     */
    int updMedicalInfo(Medical medical) throws  Exception;


    /**
     * 查询项目最后一位倒序
     * @return
     * @throws Exception
     */
    Medical getMedicalNameByDesc() throws Exception;
}
