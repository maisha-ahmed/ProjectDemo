package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ElectronicsPage extends CommonAPI {

    public ElectronicsPage(){
        PageFactory.initElements(driver, this);

    }

    public void electronicsPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("Samsung Tv");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("293");
        driver.findElement(By.id("gh-btn")).click();
    }
}

