package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.GroupOrTestInfo;
import com.dyhc.hospital.entity.Package;
import com.dyhc.hospital.entity.PackageMedical;
import com.dyhc.hospital.entity.UnitsGroup;
import com.dyhc.hospital.service.GroupOrTestInfoService;
import com.dyhc.hospital.service.PackageMedicalService;
import com.dyhc.hospital.service.PackageService;
import com.dyhc.hospital.service.UnitsGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UnitsGroupController {
    @Autowired
    private UnitsGroupService unitsGroupService;//单位分组
    @Autowired
    private PackageService packageService;//套餐
    @Autowired
    private GroupOrTestInfoService groupOrTestInfoService;//分组表与套餐表
    @Autowired
    private PackageMedicalService  packageMedicalService;//套餐与体检项表
    private UnitsGroup unitsGroup;

    public List<UnitsGroup> getList() {
        return list;
    }

    public void setList(List<UnitsGroup> list) {
        this.list = list;
    }

    private List<UnitsGroup> list;

    public UnitsGroup getUnitsGroup() {
        return unitsGroup;
    }

    public void setUnitsGroup(UnitsGroup unitsGroup) {
        this.unitsGroup = unitsGroup;
    }


   @RequestMapping("/getAll.do")
   @ResponseBody
    public String getAll() {
        try {
            list = unitsGroupService.getAllUnitsGroupInfo();
            System.out.println(list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(list);
    }
    @RequestMapping("/addGroup.do")
    @ResponseBody
    public String addGroup(UnitsGroup unitsGroup,@RequestParam("package")Integer packageId) {
          String json="";
         Integer  save=0;
        Integer groupInfo=0;
            System.out.println(packageId);
            try{
                list=unitsGroupService.getAllUnitsGroupInfoByid(unitsGroup.getUnitsGroupId());
                if(list.get(0)==null) {
                    //添加单位分组
                    unitsGroup.setCreateBy(1);
                    unitsGroup.setIsdelete(0);
                    //实例化单位分组和体检关系
                    GroupOrTestInfo groupOrTestInfo = new GroupOrTestInfo();
                    //设置单位分组编号
                    groupOrTestInfo.setUnitsGroupId(unitsGroup.getUnitsGroupId());
                    //设置套餐编号
                    groupOrTestInfo.setPackageId(packageId);
                    groupInfo= groupOrTestInfoService.addGroup(groupOrTestInfo);
                }else{
                    //修改单位分组
                    unitsGroup.setModifyBy(1);
                    save= unitsGroupService.updUnitsGroupInfo(unitsGroup);
                    //实例化单位分组和体检关系
                    GroupOrTestInfo groupOrTestInfo = new GroupOrTestInfo();
                    //设置单位分组编号
                    groupOrTestInfo.setUnitsGroupId(unitsGroup.getUnitsGroupId());
                    //设置套餐编号
                    groupOrTestInfo.setPackageId(packageId);
                    groupInfo= groupOrTestInfoService.updateGroup(groupOrTestInfo);
                }
                if(save>0&&groupInfo>0){
                    json="{\"status\":\"ok\"}";
                }else{
                    json="{\"status\":\"no\"}";
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        return json;
    }
    @RequestMapping("/delGroup.do")
    @ResponseBody
    public String delGroup(@RequestParam("unitsGroupId") String unitsGroupIds) {
        Integer del = 0;
        try {
            del = unitsGroupService.delUnitsGroupInfo(unitsGroupIds);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(del);

    }
    @RequestMapping("/getById.do")
    @ResponseBody
    public String getById(@RequestParam("unitsGroupId") String unitsGroupIds){
        System.out.println("=>"+unitsGroupIds);
        try{
            list=unitsGroupService.getAllUnitsGroupInfoByid(unitsGroupIds);
            Integer PackageId=groupOrTestInfoService.getByIdUnitsGroupId(unitsGroupIds);
            list.get(0).setPackageId(PackageId);
            System.out.println(list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(list);
    }
    @RequestMapping("/getPackage.do")
    @ResponseBody
    public String getPackage(){
        List<Package> listP=null;
        try{
            listP=packageService.getAllPackageInfos();
           System.out.println(listP.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(listP);
    }
    @RequestMapping("/getPackageMedical.do")
    @ResponseBody
    public  String getPackageMedical(@RequestParam("packageId") Integer packageId){
        List<PackageMedical> page=null;
        try {
            page=packageMedicalService.getAllInfo(packageId);
          }catch (Exception e){
              e.printStackTrace();
          }
          return  JSON.toJSONString(page);
    }
    @RequestMapping("/getMax.do")
    @ResponseBody
    public  String getMax(@RequestParam("unitsId")String unitsId){
         String result=null;
         try {
            result=unitsGroupService.getUnitsGroupMax(unitsId);
         }catch (Exception e){
            e.printStackTrace();
         }
         return  result;
    }


}



