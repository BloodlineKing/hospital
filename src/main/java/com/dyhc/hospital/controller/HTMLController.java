package com.dyhc.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {

    @RequestMapping("Advicedescription.html")
    public String toAdvicedescription(){
        return "Advicedescription";
    }

    @RequestMapping("combinationInfo.html")
    public String toCombinationInfo(){
        return "combinationInfo";
    }

    @RequestMapping("commonresults.html")
    public String toCommonresults(){
        return "commonresults";
    }

    @RequestMapping("departmentInfo.html")
    public String toDepartmentInfo(){
        return "departmentInfo.html";
    }

    @RequestMapping("index.html")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("jobs.html")
    public String toJobs(){
        return "jobs";
    }

    @RequestMapping("jobsgroup.html")
    public String toJobsgroup(){
        return "jobsgroup";
    }

    @RequestMapping("login.html")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("managedepart.html")
    public String toManagedepart(){
        return "managedepart";
    }

    @RequestMapping("managerindex.html")
    public String toManagerindex(){
        return "managerindex";
    }

    @RequestMapping("managerlogin.html")
    public String toManagerlogin(){
        return "managerlogin";
    }

    @RequestMapping("message.html")
    public String toMessage(){
        return "message";
    }

    @RequestMapping("nursePre.html")
    public String toNursePre(){
        return "nursePre";
    }

    @RequestMapping("nursePrint.html")
    public String toNursePrint(){
        return "nursePrint";
    }

    @RequestMapping("nurseRegistration.html")
    public String toNurseRegistration(){
        return "nurseRegistration";
    }

    @RequestMapping("package.html")
    public String toPackage(){
        return "package";
    }

    @RequestMapping("packageInfo.html")
    public String toPackageInfo(){
        return "packageInfo";
    }

    @RequestMapping("PhysicalinfoManager.html")
    public String toPhysicalinfoManager(){
        return "PhysicalinfoManager";
    }

    @RequestMapping("Physicalreport.html")
    public String toPhysicalreport(){
        return "Physicalreport";
    }

    @RequestMapping("PhysicalresultSummer.html")
    public String toPhysicalresultSummer(){
        return "PhysicalresultSummer";
    }

    @RequestMapping("sectionmanager.html")
    public String toSectionmanager(){
        return "sectionmanager";
    }

    @RequestMapping("set.html")
    public String toSet(){
        return "set";
    }

    @RequestMapping("Tollgatecharge.html")
    public String toTollgatecharge(){
        return "Tollgatecharge";
    }

    @RequestMapping("Tollgaterefund.html")
    public String toTollgaterefund(){
        return "Tollgaterefund";
    }

    @RequestMapping("totalcheck.html")
    public String toTotalcheck(){
        return "totalcheck";
    }
}
