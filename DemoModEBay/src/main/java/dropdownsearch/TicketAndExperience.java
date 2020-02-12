package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TicketAndExperience extends CommonAPI {

    public TicketAndExperience(){
        PageFactory.initElements(driver, this);

    }

    public void ticketExperience(){

        driver.findElement(By.id("gh-ac")).sendKeys(" NBA Tickets ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("1305");
        driver.findElement(By.id("gh-btn")).click();
    }
}

