package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.UserRegisterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRegisterInfoMapper {
    /**
     * 李文荣
     * 查询个人的预约记录
     * @param nameCode  姓名简码
     * @param telephone  手机号
     * @return
     */
    public List<UserRegisterInfo> findUserRegisterInfos(@Param("nameCode") String nameCode, @Param("telephone")String telephone);
}
