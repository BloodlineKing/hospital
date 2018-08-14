package com.dyhc.hospital.dao;

import com.dyhc.hospital.entity.CommonResults;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 常见结果接口
 * ycy
 */
@Mapper
@Repository
public interface CommonResultsMapper {

    /**
     * 查询所有常见结果信息
     *
     * @return
     */

    List<CommonResults> getAllCommonResultsInfo(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize) throws Exception;

    /**
     * 添加常见结果信息
     *
     * @return
     */
    int addCommonResultsInfo(CommonResults commonResults) throws Exception;

    /**
     * 删除常见结果信息
     *
     * @return
     */
    int delCommonResultsInfo(@Param("commonResultsId") int commonResultsId) throws Exception;

    /**
     * 根据id查询常见结果信息
     * @param commonResultsId
     * @return
     */
    List<CommonResults> getAllCommonResultsInfoByid(@Param("commonResultsId") int commonResultsId) throws  Exception;


    /**
     * 修改常见结果信息
     * @param commonResults
     * @return
     */
    int updCommonResultsInfo(CommonResults commonResults) throws  Exception;

    /**王娇
     * 根据id修改常见结果状态
     * @param commonResultsId
     * @return
     * @throws Exception
     */
    Integer updateCommonResultsisDelete(Integer commonResultsId) throws Exception;
}
