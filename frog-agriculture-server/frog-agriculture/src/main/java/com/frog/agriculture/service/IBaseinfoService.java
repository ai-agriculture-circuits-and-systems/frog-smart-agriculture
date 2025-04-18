package com.frog.agriculture.service;

import java.util.List;
import com.frog.agriculture.domain.Baseinfo;

/**
 * 基地信息Service接口
 * 
 * @author nealtsiao
 * @date 2023-05-13
 */
public interface IBaseinfoService 
{
    /**
     * 查询基地信息
     * 
     * @param baseId 基地信息主键
     * @return 基地信息
     */
    public Baseinfo selectBaseinfoByBaseId(Long baseId);

    /**
     * 查询基地信息
     *
     * @return 基地信息
     */
    public Baseinfo selectBaseinfoLimitOne();

    /**
     * 查询基地信息列表
     * 
     * @param baseinfo 基地信息
     * @return 基地信息集合
     */
    public List<Baseinfo> selectBaseinfoList(Baseinfo baseinfo);

    /**
     * 新增基地信息
     * 
     * @param baseinfo 基地信息
     * @return 结果
     */
    public int insertBaseinfo(Baseinfo baseinfo);

    /**
     * 修改基地信息
     * 
     * @param baseinfo 基地信息
     * @return 结果
     */
    public int updateBaseinfo(Baseinfo baseinfo);

    /**
     * 批量删除基地信息
     * 
     * @param baseIds 需要删除的基地信息主键集合
     * @return 结果
     */
    public int deleteBaseinfoByBaseIds(Long[] baseIds);

    /**
     * 删除基地信息信息
     * 
     * @param baseId 基地信息主键
     * @return 结果
     */
    public int deleteBaseinfoByBaseId(Long baseId);
}
