package com.htht.testerpig.DriverBase;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: RemotDriver
 * @Author: admin
 * @Description: 通过读取属性配置文件，分别对谷歌、火狐、Edge的Driver属性配置
 * @Date: 2020/8/6 8:27
 * @Version: 1.0
 */
public enum RemotDriverEnm implements DriverCapabilitiesInt {

    CHROME {
        @Override
        public DesiredCapabilities getCapabilities(DriverProperties driverProperties) {
            DesiredCapabilities capabilities;
            capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.ANY);
            for (Map.Entry<String, Object> entry : driverProperties.getCapabilityType().entrySet()) {
                capabilities.setCapability("CapabilityType." + entry.getKey(), entry.getValue());
            }
            return capabilities;
        }
    },
    FIREFOX {
        @Override
        public DesiredCapabilities getCapabilities(DriverProperties driverProperties) {
            DesiredCapabilities capabilities;
            capabilities = DesiredCapabilities.firefox();
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.ANY);
            for (Map.Entry<String, Object> entry : driverProperties.getCapabilityType().entrySet()) {
                capabilities.setCapability("CapabilityType." + entry.getKey(), entry.getValue());
            }
            return capabilities;
        }
    },
    EDGE {
        @Override
        public DesiredCapabilities getCapabilities(DriverProperties driverProperties) {
            DesiredCapabilities capabilities;
            capabilities = DesiredCapabilities.edge();
            capabilities.setBrowserName("edge");
            capabilities.setPlatform(Platform.ANY);
            for (Map.Entry<String, Object> entry : driverProperties.getCapabilityType().entrySet()) {
                capabilities.setCapability( "CapabilityType." + entry.getKey(), entry.getValue());
            }
            return capabilities;
        }
    }
}
