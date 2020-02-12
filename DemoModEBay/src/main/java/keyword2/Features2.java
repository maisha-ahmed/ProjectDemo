package keyword2;

import base.HomePage;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features2 extends CommonAPI
{
    HomePage element = PageFactory.initElements(driver, HomePage.class);

    public void dailyDeal()
    {
        driver.findElement(By.className("gh-p")).click();
    }
//    public void theCut()
//    {
//        element.clickOnTheCutTab();
//    }
//    public void vulture()
//    {
//        element.clickOnVultureTab();
//    }
//    public void grubStreet()
//    {
//        element.clickOnGrubStreetTab();
//    }
//    public void strategist()
//    {
//        element.clickOnStrategistTab();
//    }
    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException {
        switch (featureName) {
            case "dailyDeal":
                dailyDeal();
                break;
//            case "theCut":
//                theCut();
//                break;
//            case "vulture":
//                vulture();
//                break;
//            case "grubStreet":
//                grubStreet();
//                break;
//            case "strategist":
//                strategist();
//                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        FeaturesToBeClicked featuresToBeClicked = new FeaturesToBeClicked();
        String [] testSteps = featuresToBeClicked.getDataFromExcelFile();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
