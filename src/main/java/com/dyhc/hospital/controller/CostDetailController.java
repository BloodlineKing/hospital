package com.dyhc.hospital.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospital.entity.CostDetail;
import com.dyhc.hospital.service.CostDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CostDetailController {
    @Autowired
    private CostDetailService costDetailService;


    /**
     *  lwr
     *  用户交费记录
     * @param costDetail
     * @return
     */
    @RequestMapping("addCostDetailByPayment.do")
    @ResponseBody
    public String addCostDetailByPayment(CostDetail costDetail){
        Integer result = null;
        Integer a = 0;
        try {
            result = costDetailService.addCostDetailByPayment(costDetail);
            if(result>0){
                a = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(a);
    }
}
