package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Motors extends CommonAPI {

    public Motors(){
        PageFactory.initElements(driver, this);

    }

    public void motorPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("BMW M3 ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("6000");
        driver.findElement(By.id("gh-btn")).click();
    }
}


