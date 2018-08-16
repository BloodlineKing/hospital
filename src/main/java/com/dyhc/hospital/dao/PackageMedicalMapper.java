package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.CombinationMedical;
import com.dyhc.hospital.entity.PackageMedical;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PackageMedicalMapper {
    /**
     * 李文荣
     * 显示套餐表下边的组合项的下边的体检项以及基本体检项
     * @param packageId 套餐id
     * @return
     * @throws Exception
     */
    List<PackageMedical>  getPackageInfoByPackageId(@Param("packageId") int packageId )throws Exception;

    /**
     * 王娇娇
     * 根据id查询下拉框所选的套餐里的组合项和体检项
     * @param packageId
     * @return
     */
    List<PackageMedical>  getAllInfo(@Param("packageId")Integer packageId)throws Exception;
}
