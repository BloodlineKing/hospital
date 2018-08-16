package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.UnitsGroupMapper;
import com.dyhc.hospital.entity.UnitsGroup;
import com.dyhc.hospital.service.UnitsGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UnitsGroupService")
public class UnitsGroupServiceImpl implements UnitsGroupService {
    @Autowired
    private UnitsGroupMapper unitsGroupMapper;
    @Override
    public List<UnitsGroup> getAllUnitsGroupInfo() throws Exception {
        return unitsGroupMapper.getAllUnitsGroupInfo();
    }

    @Override
    public int addUnitsGroupInfo(UnitsGroup unitsGroup) throws Exception {
        return unitsGroupMapper.addUnitsGroupInfo(unitsGroup);
    }

    @Override
    public int delUnitsGroupInfo(String unitsGroupId) throws Exception {
        return unitsGroupMapper.delUnitsGroupInfo(unitsGroupId);
    }

    @Override
    public List<UnitsGroup> getAllUnitsGroupInfoByid(String unitsGroupId) throws Exception {
        return unitsGroupMapper.getAllUnitsGroupInfoByid(unitsGroupId);
    }

    @Override
    public int updUnitsGroupInfo(UnitsGroup unitsGroup) throws Exception {
        return unitsGroupMapper.updUnitsGroupInfo(unitsGroup);
    }
}
