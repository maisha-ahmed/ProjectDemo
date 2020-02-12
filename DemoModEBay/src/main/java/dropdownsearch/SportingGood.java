package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SportingGood extends CommonAPI {

    public SportingGood(){
        PageFactory.initElements(driver, this);

    }

    public void sportingGood(){

        driver.findElement(By.id("gh-ac")).sendKeys("BaseBall Bat ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("888");
        driver.findElement(By.id("gh-btn")).click();
    }
}

