package com.testautomation.framework.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class SearchPage extends BasePage {

    @Value("${url}")
    private String appurl;


    public SearchPage openGoogle(){
        this.driver.get(appurl);
        return this;
    }

    public SearchPage searchFor(String value) throws InterruptedException {
        this.driver.findElement(By.xpath("//input[@name='q']")).sendKeys(value);
        Thread.sleep(2000);
        List<WebElement> submits =
                this.wait.until(ExpectedConditions.visibilityOfAllElements
                        ( driver.findElements(By.xpath("//input[@name='btnK']"))));
        submits.stream().filter(WebElement::isDisplayed)
                .findFirst().ifPresent(WebElement::click);
        return this;
    }

    public SearchPage closeTest(){
        this.driver.quit();
        return this;
    }
}
