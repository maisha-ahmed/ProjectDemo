package signup;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import reporting.TestLogger;

public class NYMagSignUp extends CommonAPI
{
    @FindBy(how = How.NAME, using = "email")
    public static WebElement enterEmailWebElement;

    @FindBy(how = How.CLASS_NAME, using = "submit")
    public static WebElement clickOnSubmitBtnWebElement;

    @FindBy(how = How.CSS, using = ".subscribe-link.global-nav-track")
    public static WebElement clickOnSubscribeBtn;

    @FindBy(how = How.CSS, using = ".user-button.sign-in-button")
    public static WebElement clickOnUserSignInBtn;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement enterPassword;

    @FindBy(how = How.CSS, using = ".auth0-label-submit")
    public static WebElement clickOnSignInBtnWebElement;

    public WebElement getEnterEmailWebElement()
    {
   //     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return enterEmailWebElement;
    }
    public WebElement getClickOnSubmitBtnWebElement()
    {
     //   TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return clickOnSubmitBtnWebElement;
    }
    public WebElement getClickOnSubscribeBtn()
    {
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return clickOnSubscribeBtn;
    }
    public WebElement getClickOnUserSignInBtn()
    {
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return clickOnUserSignInBtn;
    }
    public WebElement getEnterPassword()
    {
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return enterPassword;
    }
    public WebElement getClickOnSignInBtnWebElement()
    {
   //     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return clickOnSignInBtnWebElement;
    }

    public void typeEmailName(String value)
    {
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEnterEmailWebElement().sendKeys(value);
    }
    public void clickOnSubmit()
    {
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSubmitBtnWebElement().click();
    }
    public void clickOnSubscribeBtn()
    {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSubscribeBtn().click();
    }
    public void clickOnUserSignInBtn()
    {
  //      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnUserSignInBtn().click();
    }
    public void typeUserPassword(String value)
    {
    //    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEnterPassword().sendKeys(value);
    }
    public void clickOnSignInBtn()
    {
   //     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSignInBtnWebElement().click();
    }
}
