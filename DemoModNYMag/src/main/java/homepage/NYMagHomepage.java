package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class NYMagHomepage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".tab-trigger.intelligencer")
    public static WebElement intelligencerWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.wwwthecut")
    public static WebElement theCutWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.vulture")
    public static WebElement vultureWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.grubstreet")
    public static WebElement grubStreetWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.strategist")
    public static WebElement strategistWebElement;

    @FindBy(how = How.CSS, using = ".nav-dropdown-button-trigger")
    public static WebElement burgerIcon;

    public WebElement getIntelligencerWebElement()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return intelligencerWebElement;
    }

    public WebElement getTheCutWebElement()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return theCutWebElement;
    }

    public WebElement getVultureWebElement()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return vultureWebElement;
    }

    public WebElement getGrubStreetWebElement()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return grubStreetWebElement;
    }

    public WebElement getStrategistWebElement()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return strategistWebElement;
    }
    public WebElement getBurgerIcon()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return burgerIcon;
    }
    public void clickOnIntelligencerTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getIntelligencerWebElement().click();
    }
    public void clickOnTheCutTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTheCutWebElement().click();
    }
    public void clickOnGrubStreetTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getGrubStreetWebElement().click();
    }
    public void clickOnVultureTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getVultureWebElement().click();
    }
    public void clickOnStrategistTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStrategistWebElement().click();
    }
    public void clickOnBurgerIcon()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBurgerIcon().click();
    }

    public void hoverOnIntelligencerTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".tab-trigger.intelligencer");
    }
    public void hoverOnTheCutTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".tab-trigger.wwwthecut");
    }
    public void hoverOnVultureTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".tab-trigger.vulture");
    }
    public void hoverOnGrubStreetTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".tab-trigger.grubstreet");
    }
    public void hoverOnStrategistTab()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".tab-trigger.strategist");
    }
    public void hoverOnBurgerIcon()
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".nav-dropdown-button-trigger");
    }



}
