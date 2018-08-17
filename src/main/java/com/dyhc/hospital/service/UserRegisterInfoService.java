package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.Medical;
import com.dyhc.hospital.entity.UserRegisterInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRegisterInfoService {

    /**
     * 刘杰
     * 护士登记预约的体检用户
     * @param userRegisterInfo
     * @return
     */
    Integer registerInfo(UserRegisterInfo userRegisterInfo);

    /**
     * 刘杰
     * 根据姓名和电话号查询用户信息
     * @param name
     * @param telephone
     * @return
     */
    UserRegisterInfo getUserInfoByNameAndTelephone(String name,String telephone);

    /**
     * 刘杰
     * 判断档案里是否存在某个用户
     * @param testNumber
     * @return
     */
    Integer isHaveBefore(String testNumber);

    /**
     *刘杰
     * 添加预约
     * @param userRegisterInfo
     * @return
     */
    Integer insertAppointment(UserRegisterInfo userRegisterInfo);

    /**
     *  刘杰
     * 将预约信息填充完整为登记
     * @return
     */
    Integer setAppointmentToRegister(UserRegisterInfo userRegisterInfo);

    /**
     * 刘杰
     * 获取最近一个体检编号
     * @return
     */
    String getTestNumber( String today);

    /**
     * 刘杰
     * 根据拼音简码获取信息
     * @param nameCode
     * @return
     */
    List<UserRegisterInfo> findUserInfoByNameCode(String nameCode);

    /**
     *  根据用户体检编号查询用户信息
     *  李文荣
     * @param testNumber
     * @return
     */
    UserRegisterInfo findTestNumberUserRegisterInfo(@Param("testNumber") String testNumber);

    /**
     * 李文荣
     *  根据体检编号查看用户体检项
     * @param testNumber
     * @return
     */
    List<Medical> showUserMedical(@Param("testNumber") String testNumber);




}
