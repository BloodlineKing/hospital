package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.UnitsGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 单位分组接口
 * ycy
 */
@Mapper
@Repository
public interface UnitsGroupMapper {

    /**
     * 查询所有单位分组信息
     *
     * @return
     */

    List<UnitsGroup> getAllUnitsGroupInfo(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize) throws Exception;

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
}
