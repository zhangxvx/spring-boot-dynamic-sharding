package com.example.test1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test1.model.Config1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhangxv
 * @since 2022-10-10
 */
@Mapper
public interface ConfigMapper1 extends BaseMapper<Config1> {

    @Select("select table_name,table_type from information_schema.`TABLES`;")
    List<Map<String, Object>> selectTest1();
}
