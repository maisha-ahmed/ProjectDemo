package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CollectiblesPage extends CommonAPI {

    public CollectiblesPage(){

        PageFactory.initElements(driver, this);
    }

    public void collectiblePage(){
        driver.findElement(By.id("gh-ac")).sendKeys("StarTracks");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("1");
        driver.findElement(By.id("gh-btn")).click();
    }

}
