package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.Units;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 *单位接口
 * ycy
 */
@Mapper
@Repository
public interface UnitsMapper {

    /**
     * 查询所有单位信息
     *
     * @return
     */

    List<Units> getAllUnitsInfo(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize) throws Exception;

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
    int delUnitsInfo(@Param("unitsId") int unitsId) throws Exception;

    /**
     * 根据id单位信息
     * @param unitsId
     * @return
     */
    List<Units> getAllUnitsInfoByid(@Param("unitsId") int unitsId) throws  Exception;


    /**
     * 修改单位信息
     * @param units
     * @return
     */
    int updUnitsInfo(Units units) throws  Exception;
}
