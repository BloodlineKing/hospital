package com.dyhc.hospital.service;

import com.dyhc.hospital.entity.Package;

import java.util.List;

public interface PackageService {

    /**王娇娇分组要用
     * 查询全部套餐
     * @return
     */
    List<Package> getAllPackageInfos()throws  Exception;
}
