package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;
    private By username = By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input");
    private By password = By.xpath("//*[@id=\"sign-password\"]");
    private By SingUpBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username1) {
        driver.findElement(username).sendKeys(username1);
    }

    public void setPassword(String password1) {
        driver.findElement(password).sendKeys(password1);
    }

    public void SingUpButton() {
        driver.findElement(SingUpBtn).click();
    }

    public String alertGetText() {
        Alert alert = driver.switchTo().alert();
      return alert.getText();

    }
}


