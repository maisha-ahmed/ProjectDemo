package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Stapms extends CommonAPI {

    public Stapms(){
        PageFactory.initElements(driver, this);

    }

    public void stampPage(){

        driver.findElement(By.id("gh-ac")).sendKeys(" USA Stamps ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("260");
        driver.findElement(By.id("gh-btn")).click();
    }
}

