package com.dyhc.hospital;

import com.dyhc.hospital.dao.ArchivesMapper;
import com.dyhc.hospital.dao.UserRegisterInfoMapper;
import com.dyhc.hospital.entity.Archives;
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
    @Autowired
    private ArchivesMapper archivesMapper;
    @Test
    public void contextLoads() {
        //archiveslwr();
    }


    /**
     *  测试查询个人的预约记录
     */
    public void userlwr(){
        List<UserRegisterInfo> list = userRegisterInfoMapper.findUserRegisterInfos("lh","17635692127");
        System.out.print("长度是=========>"+list.size());
    }

    /**
     * 判断用户是否有存档 如果存在 就调用这些信息进行显示,如果没有就登记信息
     */
    public void archiveslwr(){
        Archives info = archivesMapper.ifArchives("20180810001");
        System.out.println("检查结果:"+info);
    }

}
