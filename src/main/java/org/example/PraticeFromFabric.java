package org.example;

import static org.junit.Assert.*;

import config.BaseClass;
import data.User;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObject.PracticeFromPageFactory;

public class PraticeFromFabric extends BaseClass {
    static PracticeFromPageFactory formFactory;
    User testUser;
    User defaultUser = new User();

    @BeforeClass
    public static void beforeTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        formFactory = PageFactory.initElements(driver, PracticeFromPageFactory.class);
    }
    @Test
    public void test1() {
        testUser = new User();
        testUser.setName("Nicola");
        formFactory.completeForm(testUser);
        assertNotEquals(defaultUser.getName(),testUser.getName());
    }
}
