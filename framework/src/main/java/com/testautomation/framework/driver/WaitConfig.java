package com.testautomation.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class WaitConfig {

    @Bean
    public WebDriverWait waitFor(WebDriver driver){
        return new WebDriverWait(driver,30);
    }
}
