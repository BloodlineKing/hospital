package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.Archives;
import com.dyhc.hospital.entity.CombinationMedical;
import com.dyhc.hospital.entity.PackageMedical;
import com.dyhc.hospital.entity.UserRegisterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArchivesMapper {
    /** 李文荣
     *  判断用户是否有存档 如果存在 就调用registerUserInfo()方法进行显示,如果没有就登记信息
     * @return
     */
    Archives ifArchives(@Param("testNumber") String testNumber )throws  Exception;


    /**
     *  李文荣
     * 检查次数加1
     * @return
     */
    public Integer updArchivesCheckCount(@Param("testNumber") String testNumber )throws  Exception;



    /**王娇娇
     * 进行存档
     * @param testnumber
     * @return
     */
    Integer   addArchives(String testnumber)throws  Exception;

    /**王娇娇
     * /查询所有档案
     * @return
     */
    List<Archives> getArchivesList()throws Exception;


}
