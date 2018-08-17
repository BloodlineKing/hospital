package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.GroupOrTestInfoMapper;
import com.dyhc.hospital.entity.GroupOrTestInfo;
import com.dyhc.hospital.service.GroupOrTestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GroupOrTestInfoService")
public class GroupOrTestInfoServiceImpl implements GroupOrTestInfoService {
    @Autowired
    private GroupOrTestInfoMapper groupOrTestInfoMapper;
    @Override
    public Integer addGroup(GroupOrTestInfo groupOrTestInfo) throws Exception {
        return groupOrTestInfoMapper.addGroup(groupOrTestInfo);
    }

    @Override
    public Integer updateGroup(GroupOrTestInfo groupOrTestInfo) throws Exception {
        return groupOrTestInfoMapper.updateGroup(groupOrTestInfo);
    }

    @Override
    public GroupOrTestInfo getById(Integer groupOrTestInfoId) throws Exception {
        return groupOrTestInfoMapper.getById(groupOrTestInfoId);
    }
}
