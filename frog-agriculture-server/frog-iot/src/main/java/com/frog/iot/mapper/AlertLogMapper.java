package com.frog.iot.mapper;

import com.frog.iot.domain.AlertLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 设备告警Mapper接口
 * 
 * @author kerwincui
 * @date 2022-01-13
 */
@Repository
public interface AlertLogMapper 
{
    /**
     * 查询设备告警
     * 
     * @param alertLogId 设备告警主键
     * @return 设备告警
     */
    public AlertLog selectAlertLogByAlertLogId(Long alertLogId);

    /**
     * 查询设备告警列表
     * 
     * @param alertLog 设备告警
     * @return 设备告警集合
     */
    public List<AlertLog> selectAlertLogList(AlertLog alertLog);

    /**
     * 查询设备告警列表总数
     *
     * @param alertLog 设备告警
     * @return 设备告警集合
     */
    public Long selectAlertLogListCount(AlertLog alertLog);

    /**
     * 新增设备告警
     * 
     * @param alertLog 设备告警
     * @return 结果
     */
    public int insertAlertLog(AlertLog alertLog);

    /**
     * 新增设备告警
     *
     * @param alertLogList 设备告警集合
     * @return 结果
     */
    public int insertAlertLogBatch(List<AlertLog> alertLogList);

    /**
     * 修改设备告警
     * 
     * @param alertLog 设备告警
     * @return 结果
     */
    public int updateAlertLog(AlertLog alertLog);

    /**
     * 删除设备告警
     * 
     * @param alertLogId 设备告警主键
     * @return 结果
     */
    public int deleteAlertLogByAlertLogId(Long alertLogId);

    /**
     * 根据设备编号删除设备告警
     *
     * @param serialNumber 设备告警主键
     * @return 结果
     */
    public int deleteAlertLogBySerialNumber(String serialNumber);

    /**
     * 批量删除设备告警
     * 
     * @param alertLogIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAlertLogByAlertLogIds(Long[] alertLogIds);
}
