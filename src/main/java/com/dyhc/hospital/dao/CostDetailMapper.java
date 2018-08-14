package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.CostDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CostDetailMapper {

   /**王娇娇
    * 费用明细
    * 缴费 状态为0
    * 扣费 状态为1
    * 退费 状态为2
    * @param costDetail
    * @return
    */
   int addCostDetail(CostDetail costDetail )throws Exception;
}
