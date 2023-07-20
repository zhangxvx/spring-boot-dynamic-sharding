package com.example.test1.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangxv
 * @since 2022-10-10
 */
@TableName("t_config")
public class Config1 {

    @TableId("name")
    private String name;

    @TableField("value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Config{" +
                "name=" + name +
                ", value=" + value +
                "}";
    }
}
