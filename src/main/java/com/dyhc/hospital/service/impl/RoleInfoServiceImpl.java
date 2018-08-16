package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.RoleInfoMapper;
import com.dyhc.hospital.entity.RoleInfo;
import com.dyhc.hospital.service.RoleInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    private Logger logger= LoggerFactory.getLogger(RoleInfoServiceImpl.class);

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public int addRoleInfo(RoleInfo roleInfo){
        return 0;
    }

    @Override
    public int updRoleInfo(RoleInfo roleInfo){
        return 0;
    }

    @Override
    public List<RoleInfo> getRoleInfoList() {
        return null;
    }

    /**
     * 根据id查询信息
     * @param roleInfoId
     * @return
     * @throws Exception
     */
    @Override
    public RoleInfo getRoleInfoById(Integer roleInfoId){
        RoleInfo roleInfo= null;
        try {
            roleInfo = roleInfoMapper.getRoleInfoById(roleInfoId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roleInfo;
    }

    /**
     * 根据名字查询信息
     * @param userName
     * @return
     */
    @Override
    public RoleInfo getRoleInfoByName(String userName) {
        RoleInfo roleInfo= null;
        try {
            roleInfo = roleInfoMapper.getRoleInfoByName(userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roleInfo;
    }




    /**
     * 登陆方法
     * @param userName
     * @param password
     * @return
     */
    @Override
    public List<RoleInfo> getLogin(String userName, String password,int roleTypeId) {
        List<RoleInfo> list=null;
        try {
            list = roleInfoMapper.getLogin(userName,password,roleTypeId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
