package testsignup;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//import reporting.TestLogger;
import signup.NYMagSignUp;

public class SignUpTest extends NYMagSignUp
{
    @Test
    public void testThatYouCannotSignUpWithAnInvalidEmail()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp signUp = PageFactory.initElements(driver, NYMagSignUp.class);
        signUp.typeEmailName("pnt.com");
        signUp.clickOnSubmit();
    }
    @Test
    public void testThatYouCanSignUpWithValidEmail()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp signUp = PageFactory.initElements(driver, NYMagSignUp.class);
        signUp.typeEmailName("tom@pnt.com");
        signUp.clickOnSubmit();
    }
    @Test
    public void testThatSubscribeBtnWorks()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp subscribeBtn = PageFactory.initElements(driver, NYMagSignUp.class);
        subscribeBtn.clickOnSubscribeBtn();
    }
    @Test
    public void testThatUserCannotSignInWithInvalidCredentials()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeEmailName("mpnt.com");
        signIn.typeUserPassword("abcd1234");
        signIn.clickOnSignInBtn();
    }
    @Test
    public void testThatUserCanSignInWithValidCredentials()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeEmailName("m@pnt.com");
        signIn.typeUserPassword("Abcd1234!");
        signIn.clickOnSignInBtn();
    }
    @Test
    public void testThatUserCannotSignInWithoutEmail()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeUserPassword("Abcd1234!");
        signIn.clickOnSignInBtn();
    }
    @Test
    public void testThatUserCannotSignInWithoutPassword()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeEmailName("m@pnt.com");
        signIn.clickOnSignInBtn();
    }
}
