package com.example.test1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test1.model.Config1;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhangxv
 * @since 2022-10-10
 */
public interface ConfigService1 extends IService<Config1> {

    List<Map<String, Object>> selectTest1();
}
