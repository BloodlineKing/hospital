package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.PackageMapper;
import com.dyhc.hospital.entity.Package;
import com.dyhc.hospital.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PackageService")
public class PackageServiceImpl implements PackageService {
    @Autowired
    private PackageMapper packageMapper;
    @Override
    public List<Package> getAllPackageInfos()throws Exception {
        return packageMapper.getAllPackageInfos();
    }
}
