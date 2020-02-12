package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JewelryAndWatches extends CommonAPI {

    public JewelryAndWatches(){
        PageFactory.initElements(driver, this);

    }

    public void jewelryAndWatches(){

        driver.findElement(By.id("gh-ac")).sendKeys(" Tag Heuer ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("281");
        driver.findElement(By.id("gh-btn")).click();
    }
}

