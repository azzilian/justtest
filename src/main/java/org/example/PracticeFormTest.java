package org.example;

import config.BaseClass;
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
//    @Before
//    public void beforeTest() {
//        driver.navigate().refresh();
//    }

    @Test
    public void fillFirstName_ok() {
        practiceForm.setFirstName("Vlad");
    }

    @Test
    public void fillFullForm_ok() {
        practiceForm.completForm("Vlad","Shushpan","email@madilrpod.net","Male","334432");
    }

}
