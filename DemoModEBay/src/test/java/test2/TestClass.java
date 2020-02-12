package test2;

import base.HomePage;
import common.CommonAPI;
import dropdownsearch.*;
//import opennewtab.NewTab;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClass extends CommonAPI {


    @Test
    public void clickDaliyDealTest1() throws InterruptedException {
        driver.findElement(By.className("gh-p")).click();
        Thread.sleep(2000);

    }

    @Test
    public void iphoneSearchTest2() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("gh-ac", "iPhone");
        clickOnElement("gh-btn");
        Thread.sleep(2000);
    }


    @Test
    public void motorSectonTest3() throws InterruptedException {
        driver.findElement(By.className("hl-cat-nav__js-tab")).click();
        Thread.sleep(2000);
    }

    @Test
    public void findallPartsTest4() throws InterruptedException {
        motorSectonTest3();
        clickOnElement("//a[contains(text(),'All Parts & Accessories')]");
        Thread.sleep(2000);
    }

    @Test
    public void selectCarAndTruckPartsTest5() throws InterruptedException {
        findallPartsTest4();
        clickOnElement("//div[@id='w2']//li[5]//a[1]");
        Thread.sleep(1000);

    }

    @Test
    public void findSignInBottonTest6() throws InterruptedException {
        clickOnElement("//a[contains(text(),'Sign in')]");
        Thread.sleep(2000);

    }

    @Test
    public void sellerPageTest7() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='gh-p'][contains(text(),'Sell')]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void sellerItemSearchTest8() throws InterruptedException {
        sellerPageTest7();
        typeOnElement("#smac_complete", "Books");
        clickOnElement("//button[@id='hero-keyword_searchBox-2[0]']");
        Thread.sleep(2000);

    }

    @Test
    public void brandoutletTest9() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
        Thread.sleep(1000);

    }

    @Test
    public void searchingmultplalitemsTest10() throws InterruptedException {

        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearField("gh-ac");
            typeOnElement("gh-ac", list.get(i));
            clickOnElement("gh-btn");
        }

    }

    public List<String> getItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("books");
        itemsList.add("iPhone");
        itemsList.add("Honey");
        itemsList.add("car");

        return itemsList;

    }

    @Test
    public void helpandContactCenterTest11() {
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        HomePage.getHelpAndContactCenter().click();
    }

    @Test
    public void moneyBackTest12() {
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        HomePage.getMoneyBack().click();

    }

    @Test
    public void TestAntiquesTest13() {
        Antiques antiques = PageFactory.initElements(driver, Antiques.class);
        antiques.AntiquePage();
    }

    @Test
    public void TestAntiquesTest14() {
        Art art = PageFactory.initElements(driver, Art.class);
        art.ArtPage();
    }

    @Test
    public void BabyTest15() {
        Baby baby = PageFactory.initElements(driver, Baby.class);
        baby.BabyPage();


    }

    @Test
    public void BooksTest17() {
        Books book = PageFactory.initElements(driver, Books.class);
        book.BooksPage();

    }

    @Test
    public void businessAndIndustrialTest18() {
        BussinessAndIndustrial bussinessAndIndustrial = PageFactory.initElements(driver, BussinessAndIndustrial.class);
        bussinessAndIndustrial.Business();
    }


    @Test
    public void CameraTest19() {
        CameraAndPhoto cameraAndPhoto = PageFactory.initElements(driver, CameraAndPhoto.class);
        cameraAndPhoto.CamsPage();
    }

    @Test
    public void cellPageTest20() {
        CellPhoneAndAcc cellPhoneAndAcc = PageFactory.initElements(driver, CellPhoneAndAcc.class);
        cellPhoneAndAcc.CellPage();

    }

    @Test
    public void clothAndShoesTest21() {
        ClothingPage clothingPage = PageFactory.initElements(driver, ClothingPage.class);
        clothingPage.ClothingPage();
    }

    @Test
    public void coinPageTest22() {
        CoinAndPaper coin = PageFactory.initElements(driver, CoinAndPaper.class);
        coin.coinPage();


    }

    @Test
    public void collectiblesTest23() {
        CollectiblesPage collect = PageFactory.initElements(driver, CollectiblesPage.class);
        collect.collectiblePage();
    }

    @Test
    public void computerTabletPageTest24() {
        ComputerTablet computerTablet = PageFactory.initElements(driver, ComputerTablet.class);
        computerTablet.computerTabletPage();
    }

    @Test
    public void consumerElectronicsTest25() {
        ElectronicsPage electronicsPage = PageFactory.initElements(driver, ElectronicsPage.class);
        electronicsPage.electronicsPage();
    }

    @Test
    public void craftsPageTest26() {
        Crafts crafts = PageFactory.initElements(driver, Crafts.class);
        crafts.electronicsPage();
    }

    @Test
    public void dollsPageTest27() {
        DollsAndBears dollsAndBears = PageFactory.initElements(driver, DollsAndBears.class);
        dollsAndBears.dollsAndBearsPage();

    }

    @Test
    public void moviePageTest28() {
        DvdandMovies dvdandMovies = PageFactory.initElements(driver, DvdandMovies.class);
        dvdandMovies.dvdMoviesPage();

    }

    @Test
    public void ebayMotorTest29() {
        Motors motors = PageFactory.initElements(driver, Motors.class);
        motors.motorPage();

    }

    @Test
    public void giftCardTest30() {
        GiftCardAndCoupon giftCardAndCoupon = PageFactory.initElements(driver, GiftCardAndCoupon.class);
        giftCardAndCoupon.GiftCardAndCoupon();

    }

    @Test
    public void healthBeautyTest31() {
        HealthandBeauty healthandBeauty = PageFactory.initElements(driver, HealthandBeauty.class);
        healthandBeauty.healthAndBeautyPage();

    }

    @Test
    public void homeGargenPageTest32() {
        HomeAndGargen homeAndGargen = PageFactory.initElements(driver, HomeAndGargen.class);
        homeAndGargen.homeAndGargen();
    }

    @Test
    public void jewelryAndWatches33() {
        JewelryAndWatches jewelryAndWatches = PageFactory.initElements(driver, JewelryAndWatches.class);
        jewelryAndWatches.jewelryAndWatches();
    }


    @Test
    public void musicPageTest34() {
        Music music = PageFactory.initElements(driver, Music.class);
        music.musicPage();
    }

//    @Test
//    public void newTabTest34() {
//        NewTab newTab = PageFactory.initElements(driver, NewTab.class);
//        newTab.newWindow();
//    }

    @Test
    public void musicInstrumentTest35() {
        MusicInstrument musicInstrument = PageFactory.initElements(driver, MusicInstrument.class);
        musicInstrument.musicInstrumentPage();
    }

    @Test
    public void petSuppliesPageTest36() {
        PetSupplies petSupplies = PageFactory.initElements(driver, PetSupplies.class);
        petSupplies.petSuppliesPage();

    }

    @Test
    public void realEstatePageTest37() {
        RealEstate realEstate = PageFactory.initElements(driver, RealEstate.class);
        realEstate.realEstate();
    }

    @Test
    public void specialtyServicePageTest38() {
        SpecilityService specilityService = PageFactory.initElements(driver, SpecilityService.class);
        specilityService.specialtyService();

    }

    @Test(enabled = false)
    public void sportingGoodPageTest39() {
        SportingGood sportingGood = PageFactory.initElements(driver, SportingGood.class);
        sportingGood.sportingGood();

    }

    @Test
    public void FansmemberPageTest40() {
        SportingFanShop fanShop = PageFactory.initElements(driver, SportingFanShop.class);
        fanShop.sportingFanShop();
    }

    @Test
    public void stampSearchPageTest41() {
        Stapms stapms = PageFactory.initElements(driver, Stapms.class);
        stapms.stampPage();

    }

    @Test
    public void ticketExperienceTest42() {
        TicketAndExperience ticket = PageFactory.initElements(driver, TicketAndExperience.class);
        ticket.ticketExperience();

    }

    @Test
    public void toysPageTest43() {
        Toys toy = PageFactory.initElements(driver, Toys.class);
        toy.toysPage();

    }

    @Test
    public void travelsPage44() {
        Travels travels = PageFactory.initElements(driver, Travels.class);
        travels.travelsPage();
    }

}