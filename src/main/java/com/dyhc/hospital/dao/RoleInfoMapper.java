package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.RoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleInfoMapper {
    /**王娇
     * 新增角色
     * @param roleInfo
     * @return
     */
    int addRoleInfo(RoleInfo roleInfo)throws Exception;

    /**
     * 修改角色信息
     * @param roleInfo
     * @return
     */
    int updRoleInfo(RoleInfo roleInfo)throws Exception;

    /**
     * 获取所有角色信息
     * @return
     */
    List<RoleInfo> getRoleInfoList()throws Exception;

    /**
     * 根据角色编号查询该角色
     * @param roleInfoId
     * @return
     */
    RoleInfo getRoleInfoById(@Param("roleInfoId") Integer roleInfoId)throws Exception;

    /**
     * 根据名字查询信息
     * @param userName
     * @return
     */
    RoleInfo getRoleInfoByName(@Param("userName") String  userName) throws Exception;
    /**
     * 登陆方法
     * @param userName
     * @param password
     * @author ycy
     * @return
     */
    List<RoleInfo> getLogin(@Param("userName") String userName,@Param("password") String password,@Param("roleTypeId") int roleTypeId)throws Exception;

}
