package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Music extends CommonAPI {

    public Music(){
        PageFactory.initElements(driver, this);

    }

    public void musicPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("BackStreet Boys");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("11233");
        driver.findElement(By.id("gh-btn")).click();
    }
}

