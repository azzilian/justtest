package org.example;

import config.BaseClass;
import data.DataProviderUsers;
import data.User;
import io.cucumber.java.AfterAll;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.PracticeForm;

public class PracticeFormTest extends BaseClass {
    static PracticeForm practiceForm;

    @BeforeClass
    public static void initialL() {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceForm = new PracticeForm(driver);
    }
    @Before
    public void beforeTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().refresh();
    }

    @Test
    public void fillFirstName_ok() {
        practiceForm.setFirstName("Vlad");
    }

    @Test
    public void fillFullForm_ok() {
        practiceForm.completeForm("Vlad","Shushpan","email@madilrpod.net","Male","334432");
    }
    @Test
    public void newUser_OK() {
        practiceForm.completeForm(new User());
    }
    @Test
    public void test4() {
        practiceForm.completeForm(DataProviderUsers.getValidUser());
    }

    @AfterAll
    public void afterAllTests() throws InterruptedException {

        driver.navigate().refresh();
    }
}
