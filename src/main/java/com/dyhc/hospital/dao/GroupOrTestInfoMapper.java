package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.GroupOrTestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GroupOrTestInfoMapper {
    /**王娇
     * 将单位分组表增加
     * @param groupOrTestInfo
     * @return
     * @throws Exception
     */
    Integer addGroup(GroupOrTestInfo groupOrTestInfo)throws Exception;

    /**王娇
     * 将单位分组表修改
     * @param groupOrTestInfo
     * @return
     * @throws Exception
     */
    Integer updateGroup(GroupOrTestInfo groupOrTestInfo)throws Exception;

    /**
     * 根据id查询
     * @param unitsGroupId
     * @return
     * @throws Exception
     */
    Integer getByIdUnitsGroupId(String unitsGroupId)throws Exception;
}
