package com.htht.testerpig.DriverBase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: DriverInitTest
 * @Author: admin
 * @Description: ${description}
 * @Date: 2020/8/7 12:30
 * @Version: 1.0
 */
@SpringBootTest(classes = {DriverInit.class, DriverProperties.class})
public class DriverInitTest {
    @Autowired
    DriverInit driverInit;

    @Test
    public void testInitDriver() {
        WebDriver driver = driverInit.creatDriver();
        driver.get("http://www.baidu.com");
        driver.close();
        driver.quit();
    }
}