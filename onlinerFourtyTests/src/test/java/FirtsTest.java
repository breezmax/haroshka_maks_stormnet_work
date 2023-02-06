import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirtsTest {


    @Test
    public void firstTest(){
        System.setProperty("chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Onliner main page is opened");
        driver.get("https://www.onliner.by/");
        System.out.println("Onliner main page was closed");

        // find element by xPath
        WebElement footerItem = driver.findElement(By.xpath("//li[@class='footer-style__item']//a[contains(text(),'Контакты редакции')]"));
        System.out.println(footerItem.getText());
        footerItem.click();

        // find element by ID
        WebElement fastSearch = driver.findElement(By.id("fast-search"));
        WebElement byName = driver.findElement(By.name("query"));
        WebElement byCSSSelector = driver.findElement(By.cssSelector("#userbar"));
        WebElement byCSSSelectorClassName = driver.findElement(By.cssSelector(".b-top-logo"));

        driver.quit();
    }
}
