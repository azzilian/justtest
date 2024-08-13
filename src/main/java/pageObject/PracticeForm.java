package pageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeForm {
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By emailAdress = By.id("userEmail");
    By genderWrapper = By.id("genderWrapper");
    By userNumber = By.id("userNumber");
    WebDriver driver;

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void completForm(String name, String lastName, String email, String gender, String tel) {
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(this.lastName).sendKeys(lastName);
        driver.findElement(this.emailAdress).sendKeys(email);
        changeGender(gender);
        driver.findElement(userNumber).sendKeys(tel);
    }

    private void changeGender(String gender) {
        List<WebElement> genderListElements = driver.findElements(By.tagName("label"));
        for (WebElement l: genderListElements) {
            if (l.getText().equals(gender)) {
                l.click();
            }
        }
    }


}
