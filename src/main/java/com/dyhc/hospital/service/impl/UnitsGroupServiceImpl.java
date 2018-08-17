package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.UnitsGroupMapper;
import com.dyhc.hospital.entity.UnitsGroup;
import com.dyhc.hospital.service.UnitsGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Override
    public String getUnitsGroupMax(String unitsId) throws Exception {
        //获取最大的id
        //000104
        String unitsGroupId = unitsGroupMapper.getUnitsGroupMax(unitsId);
        if(unitsGroupId==null){
            unitsGroupId=unitsId+"01";
        }else {
            //0001
            String unitsIds = unitsGroupId.substring(0, 4);
            //04
            String unitsGroupIdString = unitsGroupId.substring(4, 6);
            //4
            Integer unitsGroupIdInt = Integer.parseInt(unitsGroupIdString);
            // 5=4+1
            unitsGroupIdInt = unitsGroupIdInt + 1;
            unitsGroupId = unitsGroupIdInt.toString();
            //if(5.length<2)   "0"+5
            if (unitsGroupId.length() < 2) {
                unitsGroupId = "0" + unitsGroupId;
            }
            unitsGroupId = unitsIds + unitsGroupId;
        }
        return unitsGroupId;
    }
}
