package LogIn;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.Assert.assertTrue;

public class LogInPageTest extends BaseTest {
    private By logOutBtn = By.xpath("//*[@id=\'logout2\']");
    @Test
    public void testSignUp() throws InterruptedException {

        var logInPage = homePage.clickLogIn();
        Thread.sleep(2000);
        logInPage.setUsername("mara88");
        Thread.sleep(2000);
        logInPage.setPassword("1234");
        logInPage.LogInButton();
        Thread.sleep(2000);
        Assert.assertTrue(logInPage.getLogOutButton().isDisplayed());
}
}