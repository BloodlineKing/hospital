package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.Archives;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ArchivesMapper {
    /** 李文荣
     *  判断用户是否有存档 如果存在 就调用这些信息进行显示,如果没有就登记信息
     * @return
     */
    Archives ifArchives(@Param("testNumber") String testNumber );
}
