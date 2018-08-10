package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.RoleType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleTypeMapper {

    /**
     * 获取所有角色类型
     * @return
     */
    List<RoleType> listRoleType();
}
