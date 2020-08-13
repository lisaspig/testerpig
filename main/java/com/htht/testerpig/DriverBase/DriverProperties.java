package com.htht.testerpig.DriverBase;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: driverProperties
 * @Author: admin
 * @Description: 获取Driver配置信息
 * @Date: 2020/7/21 9:28
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "webdriver")
@EnableConfigurationProperties
@Getter
@Setter
public class DriverProperties {
    private String drivername;
    private String driverpath;
    private String url;
    private String platform;
    private Boolean isremot;
    private Map<String, Object> capabilityType;
}
