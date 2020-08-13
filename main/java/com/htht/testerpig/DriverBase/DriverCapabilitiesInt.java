package com.htht.testerpig.DriverBase;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: WebDriverInt
 * @Author: admin
 * @Description: ${description}
 * @Date: 2020/8/6 11:17
 * @Version: 1.0
 */
public interface DriverCapabilitiesInt {

    public DesiredCapabilities getCapabilities(DriverProperties driverProperties);

}
