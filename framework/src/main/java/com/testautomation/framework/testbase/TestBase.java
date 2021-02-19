package com.testautomation.framework.testbase;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;

@SpringBootTest
public class TestBase extends AbstractTestNGSpringContextTests {

    @Autowired
    public WebDriver driver;

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

}
