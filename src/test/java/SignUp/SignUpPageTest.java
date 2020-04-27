package SignUp;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SignUpPageTest extends BaseTest {

    @Test
    public void testSignUp() throws InterruptedException {

        var signUpPage = homePage.clickSingIn();
        Thread.sleep(2000);
        signUpPage.setUsername("mara88");
        Thread.sleep(2000);
        signUpPage.setPassword("1234");
        signUpPage.SingUpButton();
        Thread.sleep(2000);
        assertEquals(signUpPage.alertGetText(), "Sign up successful.");


    }
}
