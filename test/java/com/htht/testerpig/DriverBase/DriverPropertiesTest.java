package com.htht.testerpig.DriverBase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: DriverPropertiesTest
 * @Author: admin
 * @Description: ${description}
 * @Date: 2020/7/21 13:06
 * @Version: 1.0
 */
@SpringBootTest(classes = {DriverProperties.class})
class DriverPropertiesTest {

    @Autowired
    DriverProperties driverProperties;
    @Test
    void getPort() {
        Assertions.assertEquals("10.1.1.107:5555",driverProperties.getUrl());
        Assertions.assertEquals(false,driverProperties.getIsremot());
        Assertions.assertEquals("webdrivers",driverProperties.getDriverpath());
    }
}