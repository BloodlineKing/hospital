package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.PackageMedical;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackageMedicalService {
    /**
     * 王娇娇
     * @param packageMedicalId
     * @return
     * @throws Exception
     */
    List<PackageMedical> getAllInfo(@Param("packageId")Integer packageId)throws Exception;
}
