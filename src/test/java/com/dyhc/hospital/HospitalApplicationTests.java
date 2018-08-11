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
            medicle();

    }


    /**
     *  测试查询个人的预约记录
     */
    public void userlwr(){
        List<UserRegisterInfo> list = userRegisterInfoMapper.findUserRegisterInfos("lh","17635692127");
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
     * 判断用户是否有存档 如果存在 就调用这些信息进行显示,如果没有就登记信息
     */
    public void archiveslwr(){
        Archives info = archivesMapper.ifArchives("20180810001");
        System.out.println("检查结果:"+info);
    }
}
