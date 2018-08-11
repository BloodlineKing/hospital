package com.dyhc.hospital;

import com.dyhc.hospital.dao.ArchivesMapper;
import com.dyhc.hospital.dao.UserRegisterInfoMapper;

import com.dyhc.hospital.dao.UserTestInfoMapper;
import com.dyhc.hospital.entity.Medical;
import com.dyhc.hospital.entity.Archives;
import com.dyhc.hospital.entity.UserRegisterInfo;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalApplicationTests {

    @Autowired
    public UserRegisterInfoMapper userRegisterInfoMapper;
    @Autowired
    public UserTestInfoMapper userTestInfoMapper;

    private ArchivesMapper archivesMapper;
    @Test
    public void contextLoads() {
        //archiveslwr();
           // medicle();
        //userRegisterlwr();
        //userlwr();
        registerUserInfos();

    }


    /**
     *  测试查询个人的预约记录
     */
    public void userlwr(){
        List<UserRegisterInfo> list = userRegisterInfoMapper.findUserRegisterInfos(null,"12345678912");
        System.out.print("长度是=========>"+list.size());
    }

    /**
     * 王娇娇
     */
    public void medicle(){
        List<Medical> list =userTestInfoMapper.getMadical("20180810002");
        List<Medical> list2 =userTestInfoMapper.getPackage("20180810002");
        List<Medical> list3 =userTestInfoMapper.getCom("20180810002");
        System.out.print("长度是=========>"+list.size());
        System.out.print("长度是=========>"+list2.size());
        System.out.print("长度是=========>"+list3.size());
    }


    /*
     * 判断用户是否有存档 如果存在 就调用userRegisterlwr()方法进行显示,如果没有就登记信息
     */
    public void archiveslwr(){
        Archives info = archivesMapper.ifArchives("20180810001");
        System.out.println("检查结果:"+info);
    }

    /**
     *  根据用户编号查看存档信息 存在这个用户 就把用户信息显示出来,并且检查次数加1==>updArchivesCheckCount()方法
     */
    public void userRegisterlwr(){
        UserRegisterInfo list = userRegisterInfoMapper.findUserRegisterInfoByTestNumber("20150302001");
        System.out.println("检查结果:"+list);
    }

    /**
     *  进行用户登录信息
     */
    public void registerUserInfos(){
        UserRegisterInfo userRegisterInfo = new UserRegisterInfo();
        userRegisterInfo.setAddress("12");
        userRegisterInfo.setAge(10);
        userRegisterInfo.setBelongtoUnits(1);
        userRegisterInfo.setBorn(new Date());
        userRegisterInfo.setCreateBy(1);
        userRegisterInfo.setIdCard("110");
        userRegisterInfo.setMaritalStatus(1);
        userRegisterInfo.setNameCode("lwr");
        userRegisterInfo.setPersonType("11");
        userRegisterInfo.setSex("女");
        userRegisterInfo.setStatus(1);
        userRegisterInfo.setTelephone("10");
        userRegisterInfo.setTestNumber("20180606");
        userRegisterInfo.setUserName("李文荣");
        userRegisterInfo.setWorkNumber("aa");

        Integer result = userRegisterInfoMapper.registerUserInfo(userRegisterInfo);
        System.out.println("长度是:"+result);
    }
}
