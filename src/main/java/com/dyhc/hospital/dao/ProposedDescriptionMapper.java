package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.ProposedDescription;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 建议描述接口
 * ycy
 */
@Mapper
@Repository
public interface ProposedDescriptionMapper {

    /**
     * 查询所有建议描述信息
     *
     * @return
     */

    List<ProposedDescription> getAllProposedDescriptionInfo(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize) throws Exception;

    /**
     * 添加建议描述信息
     *
     * @return
     */
    int addProposedDescriptionInfo(ProposedDescription proposedDescription) throws Exception;

    /**
     * 删除建议描述信息
     *
     * @return
     */
    int delProposedDescriptionInfo(@Param("proposedDescriptionId") int proposedDescriptionId) throws Exception;

    /**
     * 根据id查询建议描述信息
     * @param proposedDescriptionId
     * @return
     */
    List<ProposedDescription> getAllProposedDescriptionInfoByid(@Param("proposedDescriptionId") int proposedDescriptionId) throws  Exception;


    /**
     * 修改查询建议信息
     * @param proposedDescription
     * @return
     */
    int updProposedDescriptionInfo(ProposedDescription proposedDescription) throws  Exception;

    /**王娇
     * 根据id修改建议描述信息状
     * @param proposedDescriptionId
     * @return
     * @throws Exception
     */
    Integer updateProposedDescriptionisDelete(Integer proposedDescriptionId) throws Exception;

}
