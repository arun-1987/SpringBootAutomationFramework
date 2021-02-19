package com.testautomation.framework;

import com.testautomation.framework.pages.SearchPage;
import com.testautomation.framework.testbase.TestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class GoogleSearchUFT extends TestBase {

    @Autowired
    SearchPage searchPage;

    @Test
    public void GoogleSearchUFT() throws InterruptedException {
        searchPage.openGoogle()
                .searchFor("UFT")
                .closeTest();

    }
}
