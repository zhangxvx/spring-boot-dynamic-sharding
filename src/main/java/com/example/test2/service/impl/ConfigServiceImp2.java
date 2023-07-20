package com.example.test2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test2.mapper.ConfigMapper2;
import com.example.test2.model.Config2;
import com.example.test2.service.ConfigService2;
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
@Service
public class ConfigServiceImp2 extends ServiceImpl<ConfigMapper2, Config2> implements ConfigService2 {

    @Override
    public List<Map<String, Object>> selectTest2() {
        return baseMapper.selectTest2();
    }
}
