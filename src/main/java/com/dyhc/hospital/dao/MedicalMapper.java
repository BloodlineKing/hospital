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

    /**王娇娇
     * 获取用户的体检项
     * @param test_number
     * @return
     */
    List<Medical> getMadical(@Param("test_number") String test_number);
    /**王娇娇
     * 获取用户的套餐项
     * @param test_number
     * @return
     */
    List<Medical> getPackage(@Param("test_number")String test_number);
    /**王娇娇
     * 获取用户组合项
     * @param test_number
     * @return
     */
    List<Medical> getCom(@Param("test_number")String test_number);
}
