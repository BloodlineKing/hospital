package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.UserRegisterInfo;

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
     * 获取最近一个体检编号
     * @return
     */
    String getTestNumber( String today);


}
