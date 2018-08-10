package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.service.RoleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleTypeController {

    @Autowired
    private RoleTypeService roleTypeService;

    @RequestMapping("listRoleType")
    @ResponseBody
    public String listRoleType(){
        return JSON.toJSONString(roleTypeService.listRoleType());
    }
}
