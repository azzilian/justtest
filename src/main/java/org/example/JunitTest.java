package org.example;

import config.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitTest extends BaseClass {


    public static final String SITE_TITLE = "DEMOQA";
    public static final String FULL_NAME = "FullName";
    public static final String USER_EMAIL_ID = "userEmail";
    public static final String CORRECT_EMAIL_TEXT = "correctEmail";
    public static final String PERMANENT_ADDRESS_ID = "permanentAddress";
    public static final String CURRENT_ADDRESS_TEXT = "currentAddress";
    By inputFields = By.tagName("input");
    WebElement inputElement = driver.findElement(inputFields);

    @Test
    public void GetTittle() {
        if (SITE_TITLE.equals(driver.getTitle())) {
            System.out.println("ok " + driver.getTitle());
        } else {
            System.out.println("error " + driver.getTitle());
        }
    }

    @Test
    public void FullNameFill() {
        inputElement.sendKeys(FULL_NAME);
        System.out.println(FULL_NAME + inputElement.getText());
    }

    @Test
    public void EmailFill() {
        driver.findElement(By.id(USER_EMAIL_ID)).sendKeys(CORRECT_EMAIL_TEXT);
        System.out.println("Email " + driver.findElement(By.id("userEmail")).getText());

    }

    @Test
    public void PermanentAddressFill() {
        driver.findElement(By.id(PERMANENT_ADDRESS_ID)).sendKeys("Perma");

    }

    @Test
    public void CurrentAddressFill() {
        driver.findElement(By.id(CURRENT_ADDRESS_TEXT)).sendKeys("Current");
    }
}

