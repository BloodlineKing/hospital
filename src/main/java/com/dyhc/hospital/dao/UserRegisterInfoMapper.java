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
    public List<UserRegisterInfo> findUserRegisterInfos(@Param("nameCode") String nameCode, @Param("telephone")String telephone) throws Exception;


    /**
     * 刘杰
     * 根据姓名拼音简码获取所有姓名以及电话号
     * @param nameCode
     * @return
     */
    List<UserRegisterInfo> findUserInfoByNameCode(@Param("nameCode")String nameCode) throws Exception;


    /**
     *  李文荣
     *  根据用户编号查看存档信息 存在这个用户 就把用户信息显示出来,并且检查次数加1==>updArchivesCheckCount()方法
     * @param testNumber 用户编号
     * @return 用户登记信息
     */
    public UserRegisterInfo findUserRegisterInfoByTestNumber(@Param("testNumber") String testNumber) throws Exception;

    /**
     *  李文荣
     *  进行用户登录信息
     * @param userRegisterInfo
     * @return
     */
    public Integer registerUserInfo(UserRegisterInfo userRegisterInfo) throws Exception;


    /**
     * 刘杰
     * 根据姓名和电话号查询用户信息
     * @param name
     * @param telephone
     * @return
     */
    UserRegisterInfo getUserInfoByNameAndTelephone(@Param("name")String name,@Param("telephone")String telephone) throws Exception;

    /**
     * 刘杰
     * 判断档案里是否存在某个用户
     * @param testNumber
     * @return
     */
    Integer isHaveBefore(@Param("testNumber")String testNumber) throws Exception;

    /**
     *刘杰
     * 添加预约
     * @param userRegisterInfo
     * @return
     */
    Integer insertAppointment(UserRegisterInfo userRegisterInfo) throws Exception;

    /**
     *  刘杰
     * 将预约信息填充完整为登记
     * @return
     */
    Integer setAppointmentToRegister(UserRegisterInfo userRegisterInfo)throws  Exception;

    /**
     * 获取最近一个体检编号
     * @return
     */
    String getTestNumber(@Param("today") String today) throws Exception;

}
