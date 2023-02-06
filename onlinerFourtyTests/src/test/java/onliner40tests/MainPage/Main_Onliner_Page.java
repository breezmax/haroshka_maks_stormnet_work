package onliner40tests.MainPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main_Onliner_Page {

    private static final String MAIN_PAGE_LINK = "https://www.onliner.by/";
    private static final String CATALOG_COMP_DRAM = "https://catalog.onliner.by/dram";
    private static final String BUY_SALE_CAR = "https://ab.onliner.by/";
    private static final String HOUSES_FLATS = "https://r.onliner.by/pk/";
    private static final String BARAHOLKA = "https://baraholka.onliner.by/";
    private static final String FORUM = "https://forum.onliner.by/";

    WebDriver driver;

    @BeforeAll
    static void downloadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void closeBrowser(){
        driver.quit();
    }


    //Tests on Onliner Main Page
    @Test
    void checkMainLogoOnlinerTest(){
        driver.get(MAIN_PAGE_LINK);
        driver.findElement(By.xpath("//img[@class='onliner_logo']"));
    }

    @Test
    void checkMainElementMobileOnNavigationPanelTest(){
        driver.get(MAIN_PAGE_LINK);
        By mobileXPATH = By.xpath("//span[@class='project-navigation__sign' and text()='Мобильные телефоны']");
        driver.findElement(mobileXPATH);
        WebElement mobileElement = driver.findElement(mobileXPATH);
        System.out.println(mobileElement.getText());
    }

    @Test
    void checkMainLinkToCatalogTest(){
        driver.get(MAIN_PAGE_LINK);
        By catalogLinkXPATH = By.xpath("//header[@class='b-main-page-blocks-header-2 cfix']/h2/a[contains(text(),'Каталог')]");
        WebElement catalogElement = driver.findElement(catalogLinkXPATH);
        System.out.println(catalogElement.getText());
        driver.findElement(catalogLinkXPATH).click();
    }

    @Test
    void checkMainSocialButtonTest(){
        driver.get(MAIN_PAGE_LINK);
        By socialButtonXPATH = By.xpath(String.format("//div/a[@class='b-main-page-tabs__item'][contains(text(),'%s')]", "Наши соцсети"));
        WebElement socialButton = driver.findElement(socialButtonXPATH);
        System.out.println(socialButton.getText());
        socialButton.click();
    }

    @Test
    void checkMainAllAboutFinanceNewsTest(){
        driver.get(MAIN_PAGE_LINK);
        By AllAboutFinanceNewsXPATH = By.xpath("//a[@class='footer-3-button'][contains(text(),'Все новости о финансах')]");
        WebElement financeNews = driver.findElement(AllAboutFinanceNewsXPATH);
        System.out.println(financeNews.getText());
        driver.findElement(AllAboutFinanceNewsXPATH).click();
    }

    @Test
    void checkMainFooterReturnRulesTest(){
        driver.get(MAIN_PAGE_LINK);
        By returnRulesXPATH = By.xpath(String.format("//a[@class='footer-style__link footer-style__link_primary'][contains(text(),'%s')]", "Правила возврата"));
        WebElement returnRules = driver.findElement(returnRulesXPATH);
        System.out.println(returnRules.getText());
        returnRules.click();
    }

    @Test
    void checkMainFooterTwitterButtonTest(){
        driver.get(MAIN_PAGE_LINK);
        By twitterButtonXPATH = By.xpath("//a[@class='footer-style__social-button footer-style__social-button_tw']");
        WebElement twitterButton = driver.findElement(twitterButtonXPATH);
        twitterButton.click();
    }

    @Test
    void checkSearchPanelTest(){
        driver.get(MAIN_PAGE_LINK);
        By searchPanelXPATH = By.xpath("//input[@class='fast-search__input']");
        WebElement searchPanel = driver.findElement(searchPanelXPATH);
        searchPanel.click();
    }

    @Test
    void checkFindCarTest(){
        driver.get(MAIN_PAGE_LINK);
        By findCarButtonXPATH = By.xpath("//a[@class='btn-green-2 btn']");
        WebElement findCarButton = driver.findElement(findCarButtonXPATH);
        findCarButton.click();
    }

    @Test
    void checkAllForumSectionLinkTest(){
        driver.get(MAIN_PAGE_LINK);
        By forumSectionXPATH = By.xpath("//a[@class='footer-3-links all-news-link']");
        WebElement forumSectionLink = driver.findElement(forumSectionXPATH);
        forumSectionLink.click();
    }

    @Test
    void checkAutoNewHiddenTest(){
        driver.get(MAIN_PAGE_LINK);
        By moveToAutobaraholkaCategoryXPATH = By.xpath(String.format("//span[@class='b-main-navigation__text' and text()='%s']", "Автобарахолка"));
        By newAutoHiddenLinkXPATH = By.xpath(String.format("//span[@class='b-main-navigation__dropdown-advert-sign' and text()='%s']", "Новые авто"));

        WebElement moveToAutobaraholkaCategory = driver.findElement(moveToAutobaraholkaCategoryXPATH);
        WebElement newAutoHiddenLink = driver.findElement(newAutoHiddenLinkXPATH);

        Actions scrollToBaraholka = new Actions(driver);
        scrollToBaraholka.moveToElement(moveToAutobaraholkaCategory).perform();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        newAutoHiddenLink.click();


    }

    @Test
    void checkSocialVKTopTest(){
        driver.get(MAIN_PAGE_LINK);
        By socialVKTopXPATH = By.xpath("//div[@class='auth-bar__item auth-bar__item--vk-alter']");
        WebElement socialVKTopButton = driver.findElement(socialVKTopXPATH);
        socialVKTopButton.click();
    }

    @Test
    void checkFindMasterBubbleTest(){
        driver.get(MAIN_PAGE_LINK);
        By findMasterBubbleXPATH = By.xpath("//div[@class='b-main-navigation__bubble b-main-navigation__bubble_another']");
        WebElement findMasterBubble = driver.findElement(findMasterBubbleXPATH);
        findMasterBubble.click();
    }




    //Tests on "Catalog/Computers/DRAM" page
    @Test
    void checkCatlgSuperPriceLabelTest(){
        driver.get(CATALOG_COMP_DRAM);
        By superPriceLabelXPATH = By.xpath("//div[@class='schema-filter__bonus-title']");
        WebElement superPriceLabel = driver.findElement(superPriceLabelXPATH);
        System.out.println(superPriceLabel.getText());
    }

    @Test
    void checkCatlgSuperPriceCheckboxTest(){
        driver.get(CATALOG_COMP_DRAM);
        By superPriceCheckboxXPATH = By.xpath("//label[@class='schema-filter__bonus-item schema-filter__bonus-item_additional']/div/div[@class='i-checkbox__faux']");
        WebElement superPriceCheckbox = driver.findElement(superPriceCheckboxXPATH);
        superPriceCheckbox.click();
    }

    @Test
    void checkCatlgMyCityYesTest(){
        driver.get(CATALOG_COMP_DRAM);
        By myCityYesXPATH = By.xpath(String.format("//div[@class='popover-style__content']/div[2]/span[contains(text(),'%s')]", "Да, верно"));
        WebElement myCityButtonYes = driver.findElement(myCityYesXPATH);
        myCityButtonYes.click();
    }

    @Test
    void checkCatlgMyCityNoTest(){
        driver.get(CATALOG_COMP_DRAM);
        By myCityNoXPATH = By.xpath(String.format("//div[@class='popover-style__content']/div[2]/span[contains(text(),'%s')]", "Нет, другой"));
        WebElement myCityNoButton = driver.findElement(myCityNoXPATH);
        myCityNoButton.click();
    }

    @Test
    void checkCatlgPrivateOrderingTest(){
        driver.get(CATALOG_COMP_DRAM);
        By privOrderingXPATH = By.xpath(String.format("//span[@class='schema-filter-control__switcher-inner' and text()='%s']", "Объявления"));
        WebElement privOrderingButton = driver.findElement(privOrderingXPATH);
        System.out.println(privOrderingButton.getText());
        privOrderingButton.click();
    }

    @Test
    void checkCatlgSortDropdownTest(){
        driver.get(CATALOG_COMP_DRAM);
        By sortDropdownXPATH = By.xpath("//a[@class='schema-order__link']");
        WebElement sortDropdownButton = driver.findElement(sortDropdownXPATH);
        sortDropdownButton.click();
    }

    @Test
    void checkCatlgPaginationTest(){
        driver.get(CATALOG_COMP_DRAM);
        By paginationXPATH = By.xpath("//a[@class='schema-pagination__main']");
        WebElement paginationButton = driver.findElement(paginationXPATH);
        System.out.println(paginationButton.getText());
        paginationButton.click();
    }



    //Tests on "Auto" page
    @Test
    void checkAutoFeedbackAutoTest(){
        driver.get(BUY_SALE_CAR);
        By feedbackAutoXPATH = By.xpath(String.format("//span[@class='project-navigation__sign' and text()='%s']", "Отзывы об авто"));
        WebElement feedback = driver.findElement(feedbackAutoXPATH);
        feedback.click();
    }

    @Test
    void checkAutoLeaveYourArticleTest(){
        driver.get(BUY_SALE_CAR);
        By leaveArticleXPATH = By.xpath(String.format("//div[@class='project-navigation__button'][contains(text(),'%s')]", "Разместить объявление"));
        WebElement leaveArticleButton = driver.findElement(leaveArticleXPATH);
        leaveArticleButton.click();
    }

    @Test
    void checkAutoNewsArrowToTheRightTest(){
        driver.get(BUY_SALE_CAR);
        By newsArrowRightXPATH = By.xpath("//div[@aria-label='Next slide']");
        WebElement newsArrowRightButton = driver.findElement(newsArrowRightXPATH);
        newsArrowRightButton.click();
        newsArrowRightButton.click();
        newsArrowRightButton.click();
    }

    @Test
    void checkAutoGasCheckboxTest(){
        driver.get(BUY_SALE_CAR);
        By gasCheckboxXPATH = By.xpath(String.format("//div[@class='vehicle-form__checkbox-sign'][contains(text(),'%s')]", "Бензин"));
        By scrollToElectroXPATH = By.xpath(String.format("//div[@class='vehicle-form__label-title'][contains(text(),'%s')]", "Объем двигателя, л"));
        WebElement gasCheckbox = driver.findElement(gasCheckboxXPATH);
        WebElement scrollToElectro = driver.findElement(scrollToElectroXPATH);
        Actions actionScroll = new Actions(driver);
        actionScroll.moveToElement(scrollToElectro).perform();
        gasCheckbox.click();
    }

    @Test
    void checkAutoAdditionalParamsTest(){
        driver.get(BUY_SALE_CAR);
        By additionlParamsXPATH = By.xpath("//div[@class='vehicle-form__collapse-text vehicle-form__collapse-text_on']");
        By scrollToElementXPATH = By.xpath("//div[@class='vehicle-form__offers-list']/a[8]");
        WebElement additionalParamsButton = driver.findElement(additionlParamsXPATH);
        WebElement scrollTo = driver.findElement(scrollToElementXPATH);
        Actions scroll = new Actions(driver);
        scroll.moveToElement(scrollTo).perform();
        additionalParamsButton.click();
    }



    // Tests on "Houses and Flat"
    @Test
    void checkMapFullScreenTest(){
        driver.get(HOUSES_FLATS);
        By mapFullScreenXPATH = By.xpath("//div[@class='arenda-map__control arenda-map__control_fullscreen']");
        WebElement mapFullScreenButton = driver.findElement(mapFullScreenXPATH);
        mapFullScreenButton.click();
    }

    @Test
    void checkMapZoomInTest(){
        driver.get(HOUSES_FLATS);
        By mapZoomInXPATH = By.xpath("//a[@class='leaflet-control-zoom-in']");
        WebElement mapZoomInButton = driver.findElement(mapZoomInXPATH);
        mapZoomInButton.click();
    }

    @Test
    void checkMapZoomOutTest(){
        driver.get(HOUSES_FLATS);
        By mapZoomOutXPATH = By.xpath("//a[@class='leaflet-control-zoom-out']");
        WebElement mapZoomOutButton = driver.findElement(mapZoomOutXPATH);
        mapZoomOutButton.click();
    }

    @Test
    void checkNotFirstLastFloorOptionTest(){
        driver.get(HOUSES_FLATS);
        By firstLastFloorButtonXPATH = By.xpath("//span[@class='filter__item-inner filter__item-inner_left']");
        WebElement firstLastFloorButton = driver.findElement(firstLastFloorButtonXPATH);
        firstLastFloorButton.click();
    }

    @Test
    void checkSearchOnMoveTest(){
        driver.get(HOUSES_FLATS);
        By floatCheckboxXPATH = By.xpath("//div[@class='status']/label[@class='status__btn status__btn_alter status__btn_checkbox']");
        By scrollToSomeElementXPATH = By.xpath("//div[@class='classifieds-list']/div[21]/span[@class='classified__figure']");
        WebElement floatCheckbox = driver.findElement(floatCheckboxXPATH);
        WebElement scrollToSomeElement = driver.findElement(scrollToSomeElementXPATH);
        Actions scroll = new Actions(driver);
        scroll.moveToElement(scrollToSomeElement).perform();
        floatCheckbox.click();
    }

    @Test
    void checkDynamicPriceArrowTest(){
        driver.get(HOUSES_FLATS);
        By clickPriceArrowID = By.id("search-filter-price-slider");
        WebElement priceLine = driver.findElement(clickPriceArrowID);
        priceLine.click();
    }

    @Test
    void checkActualOrdersDropdownTest(){
        driver.get(HOUSES_FLATS);
        By actualOrdersDropdownXPATH = By.xpath(String.format("//div[@class='dropdown__value' and text()='%s']", "Актуальные"));
        WebElement actualOrderDropdown = driver.findElement(actualOrdersDropdownXPATH);
        actualOrderDropdown.click();
    }


    //Барахолка
    @Test
    void checkNewUserOrderButtonTest(){
        driver.get(BARAHOLKA);
        By newUserOrderButtonCLASSNAME = By.className("b-btn-fleamarket__1");
        WebElement newUserOrderButton = driver.findElement(newUserOrderButtonCLASSNAME);
        newUserOrderButton.click();
    }

    @Test
    void checkShowPriceBaraholkaTest(){
        driver.get(BARAHOLKA);
        By showPriceXPATH = By.xpath(String.format("//div[@class='ba-newtopic-important ba-newtopic-preimp']/a[text()='%s']", "Посмотреть цены"));
        WebElement showPriceButton = driver.findElement(showPriceXPATH);
        showPriceButton.click();
    }

    @Test
    void checkSearchButtonTest(){
        driver.get(BARAHOLKA);
        By searchButtonCLASSNAME = By.className("btn");
        WebElement searchButton = driver.findElement(searchButtonCLASSNAME);
        searchButton.click();
    }

    //Forum
    @Test
    void checkNewTFOursBaraholkaAreaTest(){
        driver.get(FORUM);
        By moveToBaraholkaSectionXPATH = By.xpath(String.format("//div[@class='b-hdtopic']/h2[text()='%s']", "Барахолка"));
        By hiddenTFOursLabelXPATH = By.xpath(String.format("//div[@id='367']/small/a[contains(text(),'%s')]", "24 часа"));

        WebElement scrollToBaraholkaArea = driver.findElement(moveToBaraholkaSectionXPATH);
        WebElement hiddenTFOursLink = driver.findElement(hiddenTFOursLabelXPATH);

        Actions scrollBaraholka = new Actions(driver);
        scrollBaraholka.moveToElement(scrollToBaraholkaArea).perform();
        hiddenTFOursLink.click();

    }

    @Test
    void checkSportConversationTest(){
        driver.get(FORUM);
        By sportConversationXPATH = By.xpath(String.format("//a[@class='forumtitle' and text()='%s']", "Спорт"));
        WebElement sportConversationLink = driver.findElement(sportConversationXPATH);
        sportConversationLink.click();
    }

    @Test
    void checkBuyFlatLinkTest(){
        driver.get(FORUM);
        By buyFlatLinkXPATH = By.xpath(String.format("//a[contains(text(),'%s')]", "Куплю квартиру"));
        WebElement buyFlatLink = driver.findElement(buyFlatLinkXPATH);
        buyFlatLink.click();
    }

    @Test
    void checkExpandFasionSection(){
        driver.get(FORUM);
        By expandButtonXPATH = By.xpath("//a[@id='fid322']/i[@class='b-ico i-pls-mns i-pls']");
        WebElement expandButton = driver.findElement(expandButtonXPATH);
        expandButton.click();
    }

    @Test
    void checkWeatherIconTest(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(FORUM);
        By weatherIconXPATH = By.xpath("//a[@class='b-top-navigation-informers__link']/span[@class='_u js-weather']");
        WebElement weatherIcon = driver.findElement(weatherIconXPATH);
        weatherIcon.click();
    }
}