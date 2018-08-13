package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.Desk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 科室接口
 * ycy
 */
@Mapper
@Repository
public interface DeskMapper {

    /**
     * 查询所有科室信息
     *
     * @return
     */

    List<Desk> getAllDeskInfo(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize) throws Exception;

    /**
     * 添加科室信息
     *
     * @return
     */
    int addDeskInfo(Desk desk) throws Exception;

    /**
     * 删除科室信息
     *
     * @return
     */
    int delDeskInfo(@Param("deskId") int deskId) throws Exception;

    /**
     * 根据id查询科室信息
     * @param deskId
     * @return
     */
    List<Desk> getAllDeskInfoByid(@Param("deskId") int deskId) throws  Exception;


    /**
     * 修改科室信息
     * @param desk
     * @return
     */
    int updDeskInfo(Desk desk) throws  Exception;




}
