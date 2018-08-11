package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.CostDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CostDetailMapper {
   Integer addCost(List<CostDetail> costDetails);
}
