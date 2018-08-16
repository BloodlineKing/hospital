package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.Package;
import com.dyhc.hospital.entity.PackageMedical;
import com.dyhc.hospital.entity.UnitsGroup;
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
    private UnitsGroupService unitsGroupService;
    @Autowired
    private PackageService packageService;
    @Autowired
    private PackageMedicalService  packageMedicalService;
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
    public String addGroup() {
        Integer save = 0;
        if(unitsGroup.getUnitsGroupId()!=null||!unitsGroup.getUnitsGroupId().equals("")){
            try{
                save=unitsGroupService.updUnitsGroupInfo(unitsGroup);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            try {
                save = unitsGroupService.addUnitsGroupInfo(unitsGroup);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return JSON.toJSONString(save);
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
    public String getById(@RequestParam("unitsGroupId") String unitsGroupIds ){
        System.out.println("=>"+unitsGroupIds);
        try{
            list=unitsGroupService.getAllUnitsGroupInfoByid(unitsGroupIds);
            System.out.println(list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(list);
    }
    @RequestMapping("/getPackage.do")
    @ResponseBody
    private String getPackage(){
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
    private  String getPackageMedical(@RequestParam("packageId") Integer packageId){
        List<PackageMedical> page=null;
        try {
            page=packageMedicalService.getAllInfo(packageId);
          }catch (Exception e){
              e.printStackTrace();
          }
          return  JSON.toJSONString(page);
    }


}



