package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.RoleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleInfoService {
    /**王娇
     * 新增角色
     * @param roleInfo
     * @return
     */
    int addRoleInfo(RoleInfo roleInfo);

    /**
     * 修改角色信息
     * @param roleInfo
     * @return
     */
    int updRoleInfo(RoleInfo roleInfo);

    /**
     * 获取所有角色信息
     * @return
     */
    List<RoleInfo> getRoleInfoList();

    /**
     * 根据角色编号查询该角色
     * @param roleInfoId
     * @return
     */
    RoleInfo getRoleInfoById( Integer roleInfoId);

    /**
     * 根据名字查询信息
     * @param userName
     * @author ycy
     * @return
     */
    RoleInfo getRoleInfoByName(String  userName);

    /**
     * 登陆方法
     * @param userName
     * @param password
     * @author ycy
     * @return
     */
    List<RoleInfo> getLogin( String userName,String password,int roleTypeId);

}
