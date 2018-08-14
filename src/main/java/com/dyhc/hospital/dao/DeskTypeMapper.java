package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.DeskType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeskTypeMapper {
    /**王娇娇
     *新增科室类型
     * @param deskType
     * @return
     * @throws Exception
     */
    int addDesk_type(DeskType deskType)throws Exception;
    /**王娇娇
     *根据id查询科室类型
     * @param deskType
     * @return
     * @throws Exception
     */
    DeskType   getById(@Param("id") Integer id)throws Exception;
    /**王娇娇
     *修改科室类型
     * @param deskType
     * @return
     * @throws Exception
     */
    int updDeskType(DeskType    deskType)throws Exception;
    /**王娇娇
     *查询科室类型
     * @param deskType
     * @return
     * @throws Exception
     */
    List<DeskType>getAll()throws Exception;
    /**王娇娇
     *删除科室类型
     * @param deskType
     * @return
     * @throws Exception
     */
    int delDeskType(@Param("id")Integer id)throws Exception; //删除科室类型
}
