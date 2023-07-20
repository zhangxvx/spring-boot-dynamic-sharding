package com.example.test1.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.DataSourceConfig;
import com.example.test1.mapper.ConfigMapper1;
import com.example.test1.model.Config1;
import com.example.test1.service.ConfigService1;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhangxv
 * @since 2022-10-10
 */
@DS(DataSourceConfig.SHARDING_DATA_SOURCE_NAME)
@Service
public class ConfigServiceImp1 extends ServiceImpl<ConfigMapper1, Config1> implements ConfigService1 {

    @Override
    public List<Map<String, Object>> selectTest1() {
        return baseMapper.selectTest1();
    }
}
