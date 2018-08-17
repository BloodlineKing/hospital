package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.UnitsMapper;
import com.dyhc.hospital.entity.Units;
import com.dyhc.hospital.service.UnitsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 实现类  lwr
 */
@Service
public class UnitsServiceImpl implements UnitsService {

    @Resource
    private UnitsMapper unitsMapper;

    @Override
    public List<Units> getAllUnitsInfo() throws Exception {
        return unitsMapper.getAllUnitsInfo();
    }

    /**
     * 查询最大的单位编号 进行添加数据
     * @param units
     * @return
     * @throws Exception
     */
    @Override
    public int addUnitsInfo(Units units) throws Exception {
        int result=0;
        //获取最大的id
        String unitsId = unitsMapper.getUnitsNameByDesc().getUnitsId();
        Integer unitsIdInt=Integer.parseInt(unitsId);
        unitsIdInt = unitsIdInt + 1;
        unitsId = unitsIdInt.toString();
        do {
            if (unitsId.length()<4)
                unitsId= "0" + unitsId;
        }while (unitsId.length()<4);
        System.out.println("=======>"+unitsId);
        units.setUnitsId(unitsId);
        result = unitsMapper.addUnitsInfo(units);
        return result;
    }

    /**
     * 删除  修改id
     * @param unitsId
     * @return
     * @throws Exception
     */
    /*@Override
    public int delUnitsInfo(int unitsId, int isdelete) throws Exception {
        return unitsMapper.delUnitsInfo(unitsId,isdelete);
    }*/

    @Override
    public Units getAllUnitsInfoByid(int unitsId) throws Exception {
        return unitsMapper.getAllUnitsInfoByid(unitsId);
    }

    @Override
    public int updUnitsInfo(Units units) throws Exception {
        return unitsMapper.updUnitsInfo(units);
    }
}
