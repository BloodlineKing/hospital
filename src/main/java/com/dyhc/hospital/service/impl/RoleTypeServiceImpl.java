package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.RoleTypeMapper;
import com.dyhc.hospital.entity.RoleType;
import com.dyhc.hospital.service.RoleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleTypeServiceImpl implements RoleTypeService {

    @Autowired
    private RoleTypeMapper roleTypeMapper;

    @Override
    public List<RoleType> listRoleType() {
        return roleTypeMapper.listRoleType();
    }
}
