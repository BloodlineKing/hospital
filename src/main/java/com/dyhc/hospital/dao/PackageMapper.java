package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.Package;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 体检套餐维护管理
 * ycy
 */
@Mapper
@Repository
public interface PackageMapper {

    /**
     * 查询所有套餐信息
     *
     * @return
     */

    List<Package> getAllPackageInfo(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize);

    /**
     * 添加套餐信息
     *
     * @return
     */
    int addPackageInfo(Package pack);

    /**
     * 删除套餐信息
     *
     * @return
     */
    int delPackageInfo(@Param("packageId") int packageId);

    /**
     * 根据id查询套餐信息
     * @param packageId
     * @return
     */
    List<Package> getAllPackageInfoByid(@Param("packageId") int packageId);


    /**
     * 修改套餐信息
     * @param pack
     * @return
     */
    int updPackageInfo(Package pack);
}
