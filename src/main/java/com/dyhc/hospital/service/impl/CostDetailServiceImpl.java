package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.CostDetailMapper;
import com.dyhc.hospital.entity.CostDetail;
import com.dyhc.hospital.service.CostDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CostDetailServiceImpl implements CostDetailService {

    @Autowired
    private CostDetailMapper costDetailMapper;
    private Logger logger= LoggerFactory.getLogger(UserRegisterInfoServiceImpl.class);


    @Override
    public Integer addCostDetailByPayment(CostDetail costDetail)  {
        Integer result = 0;
        try {
            result = costDetailMapper.addCostDetailByPayment(costDetail);
        }catch (Exception e){
            logger.error("交费失败");
            e.printStackTrace();
        }
        return result;
    }
}
