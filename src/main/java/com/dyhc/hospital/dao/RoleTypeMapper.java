package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.RoleType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleTypeMapper {

    /**王娇娇
     * 获取所有角色类型
     * @return
     */
    List<RoleType> listRoleType();
    /**
     * 新增角色类型
     * @return
     */
    int addRoleType(RoleType roleType)throws Exception;
    /**
     * 根据id查询角色类型
     * @return
     */
    RoleType   getById(@Param("id") Integer id)throws Exception;
    /**
     * 修改角色类型
     * @return
     */
    int updRoleType(RoleType roleType)throws Exception;
    /**
     * 删除所有角色类型
     * @return
     */
    int delRoleType(@Param("id")Integer id)throws Exception;
}
