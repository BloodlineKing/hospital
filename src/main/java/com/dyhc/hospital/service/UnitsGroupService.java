package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.UnitsGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitsGroupService {
    /**
     * 查询所有单位分组信息
     *
     * @return
     */

    List<UnitsGroup> getAllUnitsGroupInfo() throws Exception;

    /**
     * 添加单位分组信息
     *
     * @return
     */
    int addUnitsGroupInfo(UnitsGroup unitsGroup) throws Exception;

    /**
     * 删除单位分组信息
     *
     * @return
     */
    int delUnitsGroupInfo(@Param("unitsGroupId") String  unitsGroupId) throws Exception;

    /**
     * 根据id查询单位分组信息
     * @param unitsGroupId
     * @return
     */
    List<UnitsGroup> getAllUnitsGroupInfoByid(@Param("unitsGroupId") String unitsGroupId) throws  Exception;


    /**
     * 修改单位分组信息
     * @param unitsGroup
     * @return
     */
    int updUnitsGroupInfo(UnitsGroup unitsGroup) throws  Exception;

    /**
     * 查询单位编号的最后一位 倒序查询
     * 王娇娇
     * @return
     */
    String getUnitsGroupMax(@Param("unitsId") String unitsId) throws Exception;


}
