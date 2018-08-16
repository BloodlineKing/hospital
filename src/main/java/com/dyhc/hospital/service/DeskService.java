package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.Desk;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeskService {
    /**
     * 查询所有科室信息
     *
     * @return
     */

    List<Desk> getAllDeskInfo();

    /**
     * 添加科室信息
     *
     * @return
     */
    int addDeskInfo(Desk desk);

    /**
     * 删除科室信息
     *
     * @return
     */
    int delDeskInfo(@Param("deskId") String deskId);

    /**
     * 根据id查询科室信息
     * @param deskId
     * @return
     */
    List<Desk> getAllDeskInfoByid(@Param("deskId") String deskId) ;


    /**
     * 修改科室信息
     * @param desk
     * @return
     */
    int updDeskInfo(Desk desk);

}
