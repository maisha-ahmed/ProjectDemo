package base;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


   @FindBy(className = "gh-p")
   public static WebElement getDailyDeal;

   @FindBy(id = "gh-ac")
   public static WebElement searchBar;

   @FindBy(id = "gh-btn")
   public static WebElement searchBotton;

   @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
   public static WebElement motorSectionHover;

   @FindBy(className = "hl-cat-nav__js-tab")
   public static WebElement motorSection;

   @FindBy(xpath = "\"//a[@class='gh-p'][contains(text(),'Sell')]\"")
   public static WebElement sellerPage;

   @FindBy(linkText = "Help & Contact")
   public static WebElement helpAndContactCenter;


   @FindBy(linkText = "eBay Money Back Guarantee")
   public static WebElement moneyBack;



   public static WebElement getHelpAndContactCenter() {
      return helpAndContactCenter;

   }

   public static WebElement getMoneyBack() {

      return moneyBack;
   }

   public void clickkHelpCenter() {
      getHelpAndContactCenter().click();
   }


   }


