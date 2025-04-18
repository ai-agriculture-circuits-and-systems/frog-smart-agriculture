package com.frog.iot.domain;

/**
 * 设备分组对象 iot_device_group
 * 
 * @author kerwincui
 * @date 2021-12-16
 */
public class DeviceGroup
{
    private static final long serialVersionUID = 1L;

    /** 分组ID */
    private Long groupId;

    /** 设备ID */
    private Long deviceId;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }


}
