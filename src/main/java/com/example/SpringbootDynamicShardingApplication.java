package com.example;

import cn.hutool.json.JSONUtil;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import com.example.test1.model.Config1;
import com.example.test1.service.ConfigService1;
import com.example.test2.model.Config2;
import com.example.test2.service.ConfigService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootApplication
public class SpringbootDynamicShardingApplication implements CommandLineRunner {

    @Resource
    private DataSource dataSource;
    @Resource
    private DynamicDataSourceProvider dynamicDataSourceProvider;
    @Resource
    private ConfigService1 configService1;
    @Resource
    private ConfigService2 configService2;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDynamicShardingApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("dataSource:{}", dataSource.getClass().getName());
        Map<String, DataSource> dataSourceMap = dynamicDataSourceProvider.loadDataSources();
        log.warn("{}", dataSourceMap);
        for (Map.Entry<String, DataSource> entry : dataSourceMap.entrySet()) {
            String k = entry.getKey();
            DataSource v = entry.getValue();
            log.error("{}:{}", k, v.getClass().getName());
        }

        List<Config1> list1 = configService1.list();
        log.warn("list1:{}", list1);

        List<Config2> list2 = configService2.list();
        log.warn("list2:{}", list2);

        // List<Map<String, Object>> map1 = configService1.selectTest1();
        List<Map<String, Object>> map2 = configService2.selectTest2();

        // log.warn("map1:{}", JSONUtil.toJsonStr(map1));
        log.warn("map2:{}", JSONUtil.toJsonStr(map2));
    }
}
