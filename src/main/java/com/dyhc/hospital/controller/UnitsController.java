package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.Units;
import com.dyhc.hospital.service.UnitsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 *  李文荣 aaa
 */
@Controller
public class UnitsController {
    @Resource
    private UnitsService unitsService;

    /**
     * 显示单位所有信息
     * @return
     */
    @RequestMapping("/showUnitsInfo.do")
    @ResponseBody
    public String showUnitsInfo() throws Exception {
        List<Units> list = unitsService.getAllUnitsInfo();
        String info = JSON.toJSONString(list);
        return info;
    }


    /**
     * 根据单位id 查询单位信息
     * @param unitsId
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAllUnitsInfoByid.do")
    @ResponseBody
    public String getAllUnitsInfoByid(@RequestParam("unitsId") int unitsId) throws Exception {
        Units list = unitsService.getAllUnitsInfoByid(unitsId);
        String info = JSON.toJSONString(list);
        return info;
    }


    /**
     * 修改单位信息
     * @param units
     * @return
     */
    @RequestMapping("updUnitsInfo.do")
    @ResponseBody
    public String updUnitsInfo(Units units) throws Exception {
        System.out.println("============>"+units.getUnitsName());
        System.out.println("============>"+units.getUnitsId());
        int result = unitsService.updUnitsInfo(units);
        System.out.println("=========>"+result);
        int info = 0;
        if(result > 0){
            info = 1 ;
        }
        return JSON.toJSONString(info);
    }


    /**
     * 添加单位信息
     * @param units
     * @return
     */
    @RequestMapping("addUnitsInfo.do")
    @ResponseBody
    public String addUnitsInfo(Units units) throws Exception {
        int result = unitsService.addUnitsInfo(units);
        int info = 0;
        if(result > 0){
            info = 1 ;
        }
        return JSON.toJSONString(info);
    }
}
