package com.htht.testerpig.DriverBase;

import lombok.NonNull;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * @ProjectName: testerpig
 * @Package: com.htht.testerpig.DriverBase
 * @ClassName: CreatDriver
 * @Author: admin
 * @Description: ${description}
 * @Version: 1.0
 */
@Component
@Scope("prototype")
@EnableConfigurationProperties({DriverProperties.class})
@Configuration
public class DriverInit {

    /**
     * @return 返回远程driverd
     */
    @Autowired
    DriverProperties driverProperties;

    DriverCapabilitiesInt driverCapabilitiesInt;
    public final static Logger LOG = LoggerFactory.getLogger(Logger.class);
    @PostConstruct
    public void init(){
        driverCapabilitiesInt= RemotDriverEnm.valueOf(driverProperties.getDrivername());
        if(driverProperties!=null){
            LOG.info("driverCapabilitiesInt get success");
        }else{
            LOG.error(String.valueOf(new RuntimeException()));
        }
    }

    public WebDriver creatDriver() {

        DesiredCapabilities capabilities =driverCapabilitiesInt.getCapabilities(driverProperties);
        WebDriver webDriver;
        String remoturl = driverProperties.getUrl();
        try {
            URL url = new URL(remoturl);
            webDriver = new EventFiringWebDriver(new RemoteWebDriver(url, capabilities)).register(new LogEvenListener());
            webDriver.manage().window().maximize();
            LOG.info("webDriver creat success");
        } catch (MalformedURLException e) {
            webDriver = null;
            LOG.error(e.getMessage());
        }
        return webDriver;
    }
}
