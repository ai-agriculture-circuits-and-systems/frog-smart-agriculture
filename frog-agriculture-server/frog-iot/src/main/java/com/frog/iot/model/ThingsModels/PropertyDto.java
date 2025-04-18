package com.frog.iot.model.ThingsModels;

import com.alibaba.fastjson.JSONObject;

/**
 * 产品分类的Id和名称输出
 *
 * @author kerwincui
 * @date 2021-12-16
 */
public class PropertyDto
{
    /** 物模型唯一标识符 */
    private String id;
    /** 物模型名称 */
    private String name;
    /** 是否首页显示（0-否，1-是） */
    private Integer isTop;
    /** 是否实时监测（0-否，1-是） */
    private Integer isMonitor;
    /** 是否只读 */
    private Integer isReadonly;
    /** 排序 */
    private Integer order;
    /** 数据定义 */
    private JSONObject datatype;

    public Integer getIsReadonly() {
        return isReadonly;
    }

    public void setIsReadonly(Integer isReadonly) {
        this.isReadonly = isReadonly;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsMonitor() {
        return isMonitor;
    }

    public void setIsMonitor(Integer isMonitor) {
        this.isMonitor = isMonitor;
    }

    public JSONObject getDatatype() {
        return datatype;
    }

    public void setDatatype(JSONObject datatype) {
        this.datatype = datatype;
    }
}
