package com.htht.testerpig.TestNGFuc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: TestNgProperties
 * @Author: admin
 * @Description: testNG配置信息
 * @Date: 2020/7/21 15:39
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "testng")
@Getter
@Setter
public class TestNgProperties {
    private int retrycont;
    private int asserttimeout;
}
