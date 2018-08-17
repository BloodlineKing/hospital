package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.UserRegisterInfo;
import com.dyhc.hospital.service.UserRegisterInfoService;
import com.dyhc.hospital.util.LayUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class UserRegisterInfoController {

    @Autowired
    private UserRegisterInfoService userRegisterInfoService;

    /**
     * 刘杰
     * 验证是否有档案，如果有则将信息返回页面，没有返回页面添加预约信息
     * @return
     */
    @RequestMapping("isHaveBefore")
    @ResponseBody
    public String appointment(@RequestParam("name")String name,@RequestParam("telephone")String telephone){
        //根据姓名和电话号获取用户信息
        UserRegisterInfo user=userRegisterInfoService.getUserInfoByNameAndTelephone(name,telephone);
        //如果有信息，说明这个用户有档案，将用户信息返回页面进行展示
        if (user!=null){
//            //修改体检次数加1(登记后)
//            userRegisterInfoService.isHaveBefore(user.getTestNumber());
            return JSON.toJSONString(user);
        }
        //如果没有信息，则直接跳回页面进行预约记录
        return JSON.toJSONString("");
    }

    /**
     * 刘杰
     * 添加预约信息
     * @param userRegisterInfo
     * @return
     */
    @RequestMapping("addAppointment")
    @ResponseBody
    public String addAppointment(UserRegisterInfo userRegisterInfo){
        //接收到页面传入的体检编号，如果有值则是登记，没有则是预约
        String testNumberIn=userRegisterInfo.getTestNumber();
        //预约
        if (testNumberIn==null||testNumberIn==""){
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String dateNowStr = sdf.format(d);
            //获取到最近的一次体检编号。例201808100002
            String number=userRegisterInfoService.getTestNumber(dateNowStr);
            String testNumber="";
            if (number!=null){
                //获取到0002
                number=number.substring(8,number.length());
                //转成2
                Integer numbers=Integer.parseInt(number);
                //加1成3
                numbers+=1;
                String a=numbers.toString();
                //长度4-1
                Integer length=number.length()-a.length();
                String b="";
                //循环3次，添加3个0
                for (int k=1;k<=length;k++){
                    b+="0";
                }
                testNumber=dateNowStr+b+a;
            }else{
                testNumber=dateNowStr+"0001";
            }
            userRegisterInfo.setTestNumber(testNumber);
            Integer result=userRegisterInfoService.insertAppointment(userRegisterInfo);
            if (result==1){
                return JSON.toJSONString("ok");
            }else{
                return JSON.toJSONString("error");
            }
        }else{
            //登记
            Integer result=userRegisterInfoService.setAppointmentToRegister(userRegisterInfo);
            if (result==1){
                return JSON.toJSONString("ok");
            }else{
                return JSON.toJSONString("error");
            }
        }
    }


    /**
     * 刘杰
     * 根据拼音简码获取所有的用户信息
     * @param namecode
     * @return
     */
    @RequestMapping("getUserInfoByNameCode")
    @ResponseBody
    public String getUserInfoByNameCode(@RequestParam("namecode")String namecode){
        LayUI<UserRegisterInfo> layui=new LayUI<>();
        layui.setCode(0);
        layui.setCount(100);
        List<UserRegisterInfo> userRegisterInfoList=userRegisterInfoService.findUserInfoByNameCode(namecode);
        layui.setData(userRegisterInfoList);
        return JSON.toJSONString(layui);
    }

    /**
     * 刘杰
     * 根据拼音简码和电话号获取唯一用户信息
     * @param namecode
     * @param telephone
     * @return
     */
    public String getUserInfo(@RequestParam("namecode")String namecode,@RequestParam("telephone")String telephone){
        UserRegisterInfo userRegisterInfo=userRegisterInfoService.getUserInfoByNameAndTelephone(namecode, telephone);
        return JSON.toJSONString(userRegisterInfo);
    }
}
