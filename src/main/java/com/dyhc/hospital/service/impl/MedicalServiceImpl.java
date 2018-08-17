package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.MedicalMapper;
import com.dyhc.hospital.entity.Medical;
import com.dyhc.hospital.entity.specialentity.MedicalPlus;
import com.dyhc.hospital.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 体检项目
 * author ycy
 */
@Service
public class MedicalServiceImpl implements MedicalService {
    @Autowired
    private MedicalMapper medicalMapper;

    /**
     *查询体检项目
     * @return
     */
    @Override
    public List<MedicalPlus> getMedicalInfoByDesk() {
        List<MedicalPlus> list=null;
        try {
            list=medicalMapper.getMedicalInfoByDesk();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 添加体检项
     * @param medical
     * @return
     */
    @Override
    public int addMedicalInfo(Medical medical) {
        int a=0;
        try {
            String medicalid = medicalMapper.getMedicalNameByDesc().getMedicalId();
            Integer medicalidInt=Integer.parseInt(medicalid);
            medicalidInt = medicalidInt + 1;
            medicalid = ("0"+medicalidInt).toString();
            do {
                if (medicalid.length()<4)
                    medicalid= "0" + medicalid;
            }while (medicalid.length()<4);
            System.out.println("=======>"+medicalid);
            medical.setMedicalId(medicalid);
            a=medicalMapper.addMedicalInfo(medical);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    /**
     * 根据id查询体检项
     * @param medicalId
     * @return
     */
    @Override
    public List<MedicalPlus> getAllMedicalInfoByid(String medicalId) {
        List<MedicalPlus> list=null;
        try {
            list=medicalMapper.getAllMedicalInfoByid(medicalId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据拼音编码查询信息
     * @param namecode
     * @return
     */
    @Override
    public List<MedicalPlus> getMedicalList(String namecode) {
        List<MedicalPlus> list=null;
        try {
            list=medicalMapper.getMedicalList(namecode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 修改体检项信息
     * @param medical
     * @return
     */
    @Override
    public int updMedicalInfo(Medical medical) {
        int a=0;
        try {
            a=medicalMapper.updMedicalInfo(medical);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
