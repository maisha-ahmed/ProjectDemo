package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PotteryAndGlass extends CommonAPI {

    public PotteryAndGlass(){
        PageFactory.initElements(driver, this);

    }

    public void potteryAndGlass(){

        driver.findElement(By.id("gh-ac")).sendKeys(" Flower Vase ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("870");
        driver.findElement(By.id("gh-btn")).click();
    }
}

