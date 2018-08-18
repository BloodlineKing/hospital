package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.CostDetail;

public interface CostDetailService {
    /**
     *  李文荣
     *  添加收费明细记录
     * @return
     */
    Integer addCostDetailByPayment(CostDetail costDetail)throws Exception;
}
