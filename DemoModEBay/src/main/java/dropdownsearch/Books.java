package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Books extends CommonAPI {

    public Books() {

        PageFactory.initElements (driver, this);
    }

    public void BooksPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Bible");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("267");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}


