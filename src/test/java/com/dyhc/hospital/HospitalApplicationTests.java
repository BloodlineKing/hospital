package com.dyhc.hospital;

import com.dyhc.hospital.dao.UserRegisterInfoMapper;
import com.dyhc.hospital.entity.UserRegisterInfo;
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
    @Test
    public void contextLoads() {

    }


    /**
     *  测试查询个人的预约记录
     */
    public void userlwr(){
        List<UserRegisterInfo> list = userRegisterInfoMapper.findUserRegisterInfos("lh","17635692127");
        System.out.print("长度是=========>"+list.size());
    }

}
