package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Travels extends CommonAPI {

    public Travels(){
        PageFactory.initElements(driver, this);

    }

    public void travelsPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("Bags ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("3252");
        driver.findElement(By.id("gh-btn")).click();
    }
}
