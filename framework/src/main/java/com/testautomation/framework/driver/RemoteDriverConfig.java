package com.testautomation.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

import java.net.URL;

@Configuration
@Lazy
@Profile("remote")
public class RemoteDriverConfig {
    @Value("${selenium.grid.url}")
    private URL url;

    @Bean
    @ConditionalOnProperty(name = "browser.value", havingValue = "RemoteChrome")
    public WebDriver getRemoteChromeDriver() {
        return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
    }

    @Bean
    @ConditionalOnProperty(name = "browser.value", havingValue = "RemoteFireFox")
    public WebDriver getRemoteFireFoxDriver() {
        return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
    }

}
