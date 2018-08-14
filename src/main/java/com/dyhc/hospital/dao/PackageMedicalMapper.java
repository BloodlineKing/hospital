package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.PackageMedical;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PackageMedicalMapper {
    /**王娇娇
     * //显示套餐表下边的组合项的下边的体检项以及基本体检项
     * @param packageId
     * @return
     */
    List<PackageMedical> getPackageInfoByPackageId(@Param("packageId") int packageId )throws Exception;
}
