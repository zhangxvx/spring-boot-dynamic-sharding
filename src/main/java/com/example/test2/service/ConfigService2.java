package com.example.test2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test2.model.Config2;

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
public interface ConfigService2 extends IService<Config2> {

    List<Map<String, Object>> selectTest2();
}
