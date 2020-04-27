package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    public WebDriver driver;
    private By username = By.xpath("//*[@id=\'loginusername\']");
    private By password = By.xpath("//*[@id=\'loginpassword\']");
    private By logInBtn = By.xpath("//*[@id=\'logInModal\']/div/div/div[3]/button[2]");
    private By logOutBtn = By.xpath("//*[@id=\'logout2\']");


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsername(String username1) {
        driver.findElement(username).sendKeys(username1);
    }

    public void setPassword(String password1) {
        driver.findElement(password).sendKeys(password1);
    }

    public void LogInButton() {
        driver.findElement(logInBtn).click();
    }

    public WebElement getLogOutButton() {
        return this.driver.findElement(logOutBtn);
    }
}
