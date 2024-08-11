package org.example;

import com.google.common.annotations.VisibleForTesting;
import config.BaseClass;
import config.Browsers;
import config.DriverConfig;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JunitTest extends BaseClass {
    By inputFields = By.tagName("input");
    WebElement inputElement = driver.findElement(inputFields);



    @Test
    public void test1() {
        if ("DEMOQA".equals(driver.getTitle())) {
            System.out.println("ok " + driver.getTitle());
        } else {
            System.out.println("error " + driver.getTitle());
        }
    }

    @Test
    public void test2() {
        inputElement.sendKeys("FullName");
        System.out.println(inputElement.getText());


    }

}
