package dropdownsearch;


import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Baby extends CommonAPI {


        public Baby() {

            PageFactory.initElements (driver, this);
        }

        public void BabyPage() {
            driver.findElement (By.id ("gh-ac")).sendKeys ("diapers");
            Select s = new Select (driver.findElement (By.id ("gh-cat")));
            s.selectByValue ("2984");
            driver.findElement (By.id ("gh-btn")).click ();

        }
    }

