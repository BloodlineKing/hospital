package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.RoleInfo;
import org.apache.ibatis.annotations.Mapper;
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
    RoleInfo getRoleInfoById(Integer roleInfoId);


}
