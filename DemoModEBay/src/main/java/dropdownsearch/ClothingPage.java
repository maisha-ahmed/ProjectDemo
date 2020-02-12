package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClothingPage extends CommonAPI {

    public ClothingPage (){

        PageFactory.initElements(driver, this);
    }
    public void ClothingPage(){
        driver.findElement (By.id ("gh-ac")).sendKeys ("nike");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11450");
        driver.findElement (By.id ("gh-btn")).click ();


    }

}
