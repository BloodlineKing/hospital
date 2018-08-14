package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.CostDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CostDetailMapper {

   /**王娇娇
    * 缴费 状态为0
    * @param costDetail
    * @return
    */
   int addCostDetailByPayment(CostDetail costDetail )throws Exception;
   /**王娇娇
    * 扣费 状态为1
    * @param costDetail
    * @return
    */
   int addCostDetailByDeductions(CostDetail costDetail)throws Exception;
   /**王娇娇
    * 退费 状态为2
    * @param costDetail
    * @return
    */
   int addCostDetailByRefund(CostDetail costDetail)throws Exception;
}
