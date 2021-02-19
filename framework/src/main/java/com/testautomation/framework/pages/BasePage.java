package com.testautomation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


public abstract class BasePage {

    @Lazy
    @Autowired
    public WebDriver driver;

    @Autowired
    public WebDriverWait wait;


}
