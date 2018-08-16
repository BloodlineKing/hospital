package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.CombinationMedical;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CombinationMedicalMapper {
    /**
     *  李文荣
     *  显示组合项下边的所有体检项目
     * @return
     */
    public List<CombinationMedical> showCombinationList(@Param("medicalId") String medicalId) throws  Exception;
}
