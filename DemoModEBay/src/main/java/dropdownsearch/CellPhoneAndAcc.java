package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CellPhoneAndAcc extends CommonAPI {

    public CellPhoneAndAcc() {

        PageFactory.initElements (driver, this);
    }

    public void CellPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("iPhone");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("15032");
        driver.findElement (By.id ("gh-btn")).click ();

    }

}

