package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DollsAndBears extends CommonAPI {

    public DollsAndBears(){
        PageFactory.initElements(driver, this);

    }

    public void dollsAndBearsPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("BarbieDall ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("237");
        driver.findElement(By.id("gh-btn")).click();
    }
}


