package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SpecilityService extends CommonAPI {

    public SpecilityService(){
        PageFactory.initElements(driver, this);

    }

    public void specialtyService(){

        driver.findElement(By.id("gh-ac")).sendKeys("BMW M3 ");
        Select s = new Select(driver.findElement(By.id("Repair")));
        s.selectByValue("316");
        driver.findElement(By.id("gh-btn")).click();
    }
}

