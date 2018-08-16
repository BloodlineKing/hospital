package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.UserRegisterInfoMapper;
import com.dyhc.hospital.entity.UserRegisterInfo;
import com.dyhc.hospital.service.UserRegisterInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRegisterInfoServiceImpl implements UserRegisterInfoService {

    @Autowired
    private UserRegisterInfoMapper userRegisterInfoMapper;

    private Logger logger= LoggerFactory.getLogger(UserRegisterInfoServiceImpl.class);

    @Override
    public List<UserRegisterInfo> findUserInfoByNameCode(String nameCode) {
        List<UserRegisterInfo> listUserRegisterInfos=null;
        try {
            listUserRegisterInfos=userRegisterInfoMapper.findUserInfoByNameCode(nameCode);
        }catch (Exception e){
            logger.error("根据拼音简码获取用户信息失败");
            e.printStackTrace();
        }
        return listUserRegisterInfos;
    }

    @Override
    public String getTestNumber(String today) {
        String number=null;
        try {
            number=userRegisterInfoMapper.getTestNumber(today);
        }catch (Exception e){
            logger.error("获取体检编号错误");
            e.printStackTrace();
        }
        return number;
    }

    @Override
    public UserRegisterInfo getUserInfoByNameAndTelephone(String name, String telephone) {
        UserRegisterInfo userRegisterInfo=null;
        try {
            userRegisterInfo=userRegisterInfoMapper.getUserInfoByNameAndTelephone(name, telephone);
        }catch (Exception e){
            logger.error("根据姓名和电话号获取信息失败");
            e.printStackTrace();
        }
        return userRegisterInfo;
    }

    @Override
    public Integer isHaveBefore(String testNumber) {
        Integer result=null;
        try {
            result=userRegisterInfoMapper.isHaveBefore(testNumber);
        }catch (Exception e){
            logger.error("根据体检编号修改档案中用户体检次数异常");
        }
        return result;
    }

    @Override
    public Integer insertAppointment(UserRegisterInfo userRegisterInfo) {
        Integer result=null;
        try {
            result=userRegisterInfoMapper.insertAppointment(userRegisterInfo);
        }catch (Exception e){
            logger.error("根据体检编号修改档案中用户体检次数异常");
        }
        return result;
    }

    @Override
    public Integer setAppointmentToRegister(UserRegisterInfo userRegisterInfo) {
        Integer result=null;
        try {
            result=userRegisterInfoMapper.setAppointmentToRegister(userRegisterInfo);
        }catch (Exception e){
            logger.error("根据体检编号修改档案中用户体检次数异常");
        }
        return result;
    }

    @Override
    public Integer registerInfo(UserRegisterInfo userRegisterInfo) {
        Integer result=null;
        try {
            result=userRegisterInfoMapper.registerUserInfo(userRegisterInfo);
        }catch (Exception e){
            logger.error("添加预约或登记异常");
        }
        return result;
    }
}
