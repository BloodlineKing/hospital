package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.Combination;
import com.dyhc.hospital.entity.Medical;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserTestInfoMapper {
    //王娇娇
    /**
     * 获取体检项
     * @param test_number
     * @return
     */
    List<Medical> getMadical(@Param("test_number") String test_number);
    /**
     * 获取套餐项
     * @param test_number
     * @return
     */
    List<Medical> getPackage(@Param("test_number")String test_number);
    /**
     * 获取组合项
     * @param test_number
     * @return
     */
    List<Medical> getCom(@Param("test_number")String test_number);
}
