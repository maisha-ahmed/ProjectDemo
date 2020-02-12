package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CameraAndPhoto extends CommonAPI {

    public CameraAndPhoto() {

        PageFactory.initElements(driver, this);
    }

    public void CamsPage() {
        driver.findElement(By.id("gh-ac")).sendKeys("Canon");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("625");
        driver.findElement(By.id("gh-btn")).click();

    }
}
