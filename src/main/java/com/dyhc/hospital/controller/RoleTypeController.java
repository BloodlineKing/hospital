package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.service.RoleTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleTypeController {

    @Autowired
    private RoleTypeService roleTypeService;

    private Logger logger= LoggerFactory.getLogger(RoleTypeController.class);

    /**
     * 刘杰
     * @return
     */
    @RequestMapping("listRoleType")
    @ResponseBody
    public String listRoleType(){
        logger.error("查询所有角色类型");
        return JSON.toJSONString(roleTypeService.listRoleType());
    }
}
