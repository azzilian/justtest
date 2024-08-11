package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public static void startTests() {
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROME);
        driver.get("https://demoqa.com/text-box");
    }

    @AfterClass
    public static void endTestmethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
