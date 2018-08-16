package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.Units;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 请不要删除 删了打死你
 */
public interface UnitsService {
    /**
     * 查询所有单位信息
     *
     * @return
     */

    List<Units> getAllUnitsInfo() throws Exception;

    /**
     * 添加单位信息
     *
     * @return
     */
    int addUnitsInfo(Units units) throws Exception;

    /**
     * 删除单位信息
     *
     * @return
     */
    //int delUnitsInfo(@Param("unitsId") int unitsId, @Param("isdelete")int isdelete) throws Exception;

    /**
     * 根据id单位信息
     * @param unitsId
     * @return
     */
    Units getAllUnitsInfoByid(@Param("unitsId") int unitsId) throws  Exception;


    /**
     * 修改单位信息
     * @param units
     * @return
     */
    int updUnitsInfo(Units units) throws  Exception;


}
