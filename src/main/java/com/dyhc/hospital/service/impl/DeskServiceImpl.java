package com.dyhc.hospital.service.impl;

import com.dyhc.hospital.dao.DeskMapper;
import com.dyhc.hospital.entity.Desk;
import com.dyhc.hospital.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskServiceImpl implements DeskService {
    @Autowired
    private DeskMapper deskMapper;
    @Override
    public List<Desk> getAllDeskInfo(){
        List<Desk>list=null;
        try {
            list= deskMapper.getAllDeskInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addDeskInfo(Desk desk) {
        int flag=0;
        try {
             flag=deskMapper.addDeskInfo(desk);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public int delDeskInfo(String deskId) {
        int flag=0;
        try {
            flag=deskMapper.delDeskInfo(deskId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Desk> getAllDeskInfoByid(String deskId)  {
        List<Desk>list=null;
        try {
            list= deskMapper.getAllDeskInfoByid(deskId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int updDeskInfo(Desk desk) {
        int flag=0;
        try {
            flag=deskMapper.updDeskInfo(desk);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
