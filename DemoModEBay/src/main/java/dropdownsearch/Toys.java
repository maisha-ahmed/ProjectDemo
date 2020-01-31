package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Toys extends CommonAPI {

    public Toys(){
        PageFactory.initElements(driver, this);

    }

    public void toysPage(){

        driver.findElement(By.id("gh-ac")).sendKeys(" BatMan ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("220");
        driver.findElement(By.id("gh-btn")).click();
    }
}

