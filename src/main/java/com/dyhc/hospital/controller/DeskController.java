package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.Desk;
import com.dyhc.hospital.service.DeskService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.krb5.internal.crypto.Des;

import java.util.List;

@Controller
public class DeskController {

    @Autowired
    private DeskService deskService;


    /**
     * 查询全部
     * @return
     */
    @RequestMapping("getAllDeskinfo")
    @ResponseBody
    public String getAllDeskinfo() {
        List<Desk> list = deskService.getAllDeskInfo();
        return JSON.toJSONString(list);
    }

    /**
     * 添加
     * @param desk
     * @return
     */
    @RequestMapping("addDeskinfo")
    @ResponseBody
    public String addDeskinfo(Desk desk){
        int a=deskService.addDeskInfo(desk);
//        String msg="";
//        if(a>0){
//        msg="添加成功";
//        }else{
//            msg="添加失败";
//        }
        return JSON.toJSONString(a);
    }


    /**
     * 删除
     * @param deskId
     * @return
     */
    @RequestMapping("delDeskinfo")
    @ResponseBody
    public String delDeskinfo(@Param("deskId")String deskId){
        int a=deskService.delDeskInfo(deskId);
        return JSON.toJSONString(a);
    }


    /**
     * 根据id查询信息
     * @param deskId
     * @return
     */
    @RequestMapping("getDeskinfoByid")
    @ResponseBody
    public Desk getDeskInfoByid(@Param("deskId")String deskId){
        List<Desk> list = deskService.getAllDeskInfoByid(deskId);
        return list.get(0);
    }

    /**
     * 根据id查询信息
     * @param deskId
     * @return
     */
    @RequestMapping("getinfoByid")
    @ResponseBody
    public Desk getDeskByid(@Param("deskId")String deskId){
        List<Desk> list = deskService.getAllDeskInfoByid(deskId);
        return list.get(0);
    }


    /**
     * 修改
     * @param desk
     * @return
     */
    @RequestMapping("updDeskinfo")
    @ResponseBody
    public String updDeskinfo( Desk desk){
        int a=deskService.updDeskInfo(desk);
        return JSON.toJSONString(a);
    }
}
