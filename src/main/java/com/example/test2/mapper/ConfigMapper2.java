package com.example.test2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test2.model.Config2;
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
public interface ConfigMapper2 extends BaseMapper<Config2> {

    @Select("select table_name,table_type from information_schema.`TABLES`;")
    List<Map<String, Object>> selectTest2();
}
