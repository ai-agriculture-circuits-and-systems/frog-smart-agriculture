package com.frog.iot.model.ThingsModels;

import com.alibaba.fastjson.JSONObject;

/**
 * 产品分类的Id和名称输出
 *
 * @author kerwincui
 * @date 2021-12-16
 */
public class EventDto
{
    /** 物模型唯一标识符 */
    private String id;
    /** 物模型名称 */
    private String name;
    /** 数据定义 */
    private JSONObject datatype;

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

    public JSONObject getDatatype() {
        return datatype;
    }

    public void setDatatype(JSONObject datatype) {
        this.datatype = datatype;
    }
}
