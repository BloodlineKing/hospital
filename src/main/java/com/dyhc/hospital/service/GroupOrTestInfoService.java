package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.GroupOrTestInfo;

public interface GroupOrTestInfoService {
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
     * @param groupOrTestInfoId
     * @return
     * @throws Exception
     */
    GroupOrTestInfo getById(Integer groupOrTestInfoId)throws Exception;
}
