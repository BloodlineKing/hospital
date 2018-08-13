package com.dyhc.hospital.dao;


import com.dyhc.hospital.entity.Medical;
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
     * @param pageIndex
     * @param pageSize
     * @param deskId
     * @return
     */
    List<Medical> getMedicalInfoByDesk(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize, @Param("deskId") int deskId) throws  Exception;

    /**
     * 添加科室体检项目
     * @param medical
     * @return
     */
    int addMedicalInfo(Medical medical) throws  Exception;


    /**
     * 删除科室体检项目
     * @param medicalId
     * @return
     */
    int delMedicalInfo(@Param("medicalId") int medicalId) throws  Exception;

    /**
     * 根据id查询科室体检项目信息
     * @param medicalId
     * @return
     */
    List<Medical> getAllMedicalInfoByid(@Param("medicalId") int medicalId) throws  Exception;


    /**
     * 修改科室科室信息
     * @param medical
     * @return
     */
    int updMedicalInfo(Medical medical) throws  Exception;
}
