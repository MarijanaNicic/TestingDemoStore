package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(String idText) {
        driver.findElement(By.id(idText)).click();
    }
    public SignUpPage clickSingIn() {
        clickLink("signin2");
        return new SignUpPage(driver);
    }


}