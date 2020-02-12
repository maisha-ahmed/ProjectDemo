package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GiftCardAndCoupon extends CommonAPI {

    public GiftCardAndCoupon(){
        PageFactory.initElements(driver, this);

    }

    public void GiftCardAndCoupon(){

        driver.findElement(By.id("gh-ac")).sendKeys("Macys Gift Card ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("172008");
        driver.findElement(By.id("gh-btn")).click();
    }
}


