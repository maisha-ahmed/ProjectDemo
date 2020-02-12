package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HealthandBeauty extends CommonAPI {

    public HealthandBeauty(){
        PageFactory.initElements(driver, this);

    }

    public void healthAndBeautyPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("Neutrogena");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("26395");
        driver.findElement(By.id("gh-btn")).click();
    }
}

