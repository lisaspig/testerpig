package com.htht.testerpig.TestCases;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: TestPigProperties
 * @Author: admin
 * @Description: 获取test配置信息
 * @Version: 1.0
 */

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "testerpig")
@Getter
@Setter
public class TestPigProperties {
    private String reportpath;
    private String imagepath;
}
