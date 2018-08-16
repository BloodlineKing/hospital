package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.PackageMapper;
import com.dyhc.hospital.dao.PackageMedicalMapper;
import com.dyhc.hospital.entity.PackageMedical;
import com.dyhc.hospital.service.PackageMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PackageMedicalService")
public class PackageMedicalServiceImpl implements PackageMedicalService {
    @Autowired
    private PackageMedicalMapper packageMedicalMapper;
    @Override
    public List<PackageMedical> getAllInfo(Integer packageId) throws Exception {
        return packageMedicalMapper.getAllInfo(packageId);
    }
}
