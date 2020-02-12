package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BussinessAndIndustrial extends CommonAPI {

    public BussinessAndIndustrial() {

        PageFactory.initElements(driver, this);
    }

    public void Business() {
        driver.findElement(By.id("gh-ac")).sendKeys("office");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("12576");
        driver.findElement(By.id("gh-btn")).click();

    }



}

