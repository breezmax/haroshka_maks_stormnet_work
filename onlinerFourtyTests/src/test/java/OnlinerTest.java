import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlinerTest {

    private static final String NAV_MENU_ITEM = "//span[@class='b-main-navigation__text' and text()='%s']";

    private static final By NAV_MENU_ITEM_XPATH = By.xpath(String.format("//span[@class='b-main-navigation__text' and text()='%s']", "Форум"));
    private static final By FOOTER_ITEM_XPATH = By.xpath(String.format("//a[@class='footer-style__link footer-style__link_primary' and contains(text(), '%s')]]", "Публичные договоры"));


    @Test
    public void firstTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        //используем xPath
        driver.findElement(By.xpath(String.format("//span[@class='b-main-navigation__text' and text()='%s']", "Новости"))).click();

        //Но делается все это через переменные, для избежания дублирования кода
        driver.findElement(By.xpath(String.format(NAV_MENU_ITEM, "Новости"))).click();

        //Можно через переменную
        driver.findElement(NAV_MENU_ITEM_XPATH).click();
        driver.findElement(FOOTER_ITEM_XPATH).click();

        driver.quit();

    }
}
