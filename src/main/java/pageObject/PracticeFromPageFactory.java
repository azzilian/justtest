package pageObject;

import data.User;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFromPageFactory {

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement emailAdress;
    @FindBy(id = "userNumber")
    WebElement userNumber;
    @FindBy(xpath = "//div[contains(@class,\"custom-control\") ]/label[contains(@for,\"gender-radio\")]")
    List<WebElement>  listGenders;

    public void completeForm(User ur) {
        firstName.sendKeys(ur.getName());
        lastName.sendKeys(ur.getLastName());
        emailAdress.sendKeys(ur.getEmail());
        userNumber.sendKeys(ur.getTelephone());
        selectGender(ur.getGender());
    }

    private void selectGender(String gender) {
        for (WebElement l:listGenders) {
            if (l.getText().equals(gender)) {
                l.click();
            }
        }
    }
}
