package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.RoleInfo;
import com.dyhc.hospital.service.RoleInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleInfoController {

    @Autowired
    private RoleInfoService roleInfoService;

    /**
     * 根据id查询
     * @param userName
     * @return
     */
    @RequestMapping("getRoleInfoByName")
    @ResponseBody
    public String getRoleInfoByName(@Param("userName") String userName) {
        int flag = 0;
        RoleInfo roleInfo = roleInfoService.getRoleInfoByName(userName);
        if (roleInfo != null) {
            flag = 1;
        }
        String json = JSON.toJSONString(flag);
        return json;
    }


    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping("getLogin")
    @ResponseBody
    public RoleInfo getLogin(@Param("userName") String userName,@Param("password") String password ,@Param("roleTypeId") Integer roleTypeId){
        List<RoleInfo> list = roleInfoService.getLogin(userName,password,roleTypeId);
        return list.get(0);
    }

}
