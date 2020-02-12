package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DvdandMovies extends CommonAPI {

    public DvdandMovies(){
        PageFactory.initElements(driver, this);

    }

    public void dvdMoviesPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("Iron Man ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("11232");
        driver.findElement(By.id("gh-btn")).click();
    }
}


