package com.testautomation.framework;


import com.testautomation.framework.pages.SearchPage;
import com.testautomation.framework.testbase.TestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBase {

    @Autowired
    SearchPage searchPage;

    @Test
    public void GoogleSearchSelenium() throws InterruptedException {
        searchPage.openGoogle()
                .searchFor("Selenium")
                .closeTest();
    }

    @Test
    public void GoogleSearchUFT() throws InterruptedException {
        searchPage.openGoogle()
                .searchFor("UFT")
                .closeTest();

    }

    @Test
    public void GoogleSearchUFT1() throws InterruptedException {
        searchPage.openGoogle()
                .searchFor("UFT")
                .closeTest();

    }

    @Test
    public void GoogleSearchUFT2() throws InterruptedException {
        searchPage.openGoogle()
                .searchFor("UFT")
                .closeTest();

    }
}
