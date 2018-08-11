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
     * 查询个人的预约记录 创建人 创建时间为空
     * @param nameCode  姓名简码
     * @param telephone  手机号
     * @return
     */
    public List<UserRegisterInfo> findUserRegisterInfos(@Param("nameCode") String nameCode, @Param("telephone")String telephone);

    /**
     *  李文荣
     *  根据用户编号查看存档信息 存在这个用户 就把用户信息显示出来,并且检查次数加1==>updArchivesCheckCount()方法
     * @param testNumber 用户编号
     * @return 用户登记信息
     */
    public UserRegisterInfo findUserRegisterInfoByTestNumber(@Param("testNumber") String testNumber);

    /**
     *  李文荣
     *  进行用户登录信息
     * @param userRegisterInfo
     * @return
     */
    public Integer registerUserInfo(UserRegisterInfo userRegisterInfo);


}
