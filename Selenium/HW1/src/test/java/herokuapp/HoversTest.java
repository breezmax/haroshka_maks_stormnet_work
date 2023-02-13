package herokuapp;

import framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    private static final String NAV_HOVERS_MENU = "//a[contains(text(),'%s')]";
    private static final String AVATAR1 = "//div[@class='example']/div[1]";
    private static final String AVATAR2 = "//div[@class='example']/div[2]";
    private static final String AVATAR3 = "//div[@class='example']/div[3]";
    private static final String USER_NAME_ONE = "//div[@class='example']/div[1]/div/h5";
    private static final String PROFILE_LINK_ONE = "//div[@class='example']/div[1]/div/a[contains(text(),'View profile')]";
    private static final String USER_NAME_TWO = "//div[@class='example']/div[2]/div/h5";
    private static final String PROFILE_LINK_TWO = "//div[@class='example']/div[2]/div/a[contains(text(),'View profile')]";
    private static final String USER_NAME_THREE = "//div[@class='example']/div[3]/div/h5";
    private static final String PROFILE_LINK_THREE = "//div[@class='example']/div[3]/div/a[contains(text(),'View profile')]";
    private static final String ERROR_TEXT = "//body/h1[contains(text(),'Not Found')]";


    @Test
    public void HoversElementsTest(){

        WebElement hoversMenu = driver.findElement(By.xpath(String.format(NAV_HOVERS_MENU, "Hovers")));
        hoversMenu.click();

        Actions action = new Actions(driver);

        WebElement avatarOne = driver.findElement(By.xpath(AVATAR1));
        action.moveToElement(avatarOne).build().perform();

        WebElement userNameOne = driver.findElement(By.xpath(USER_NAME_ONE));
        System.out.println("User Name of the first User: " + userNameOne.getText());

        WebElement profileLinkOne = driver.findElement(By.xpath(PROFILE_LINK_ONE));
        profileLinkOne.click();

        WebElement errorOne = driver.findElement(By.xpath(ERROR_TEXT));
        if (errorOne.isDisplayed()){
            System.out.println("Test Failed! Error 404!");
        } else {
            System.out.println("Success!");
        }

        driver.navigate().back();


        WebElement avatarTwo = driver.findElement(By.xpath(AVATAR2));
        action.moveToElement(avatarTwo).build().perform();

        WebElement userNameTwo = driver.findElement(By.xpath(USER_NAME_TWO));
        System.out.println("User Name of the Second User: " + userNameTwo.getText());

        WebElement profileLinkTwo = driver.findElement(By.xpath(PROFILE_LINK_TWO));
        profileLinkTwo.click();

        WebElement errorTwo = driver.findElement(By.xpath(ERROR_TEXT));
        if (errorTwo.isDisplayed()){
            System.out.println("Test Failed! Error 404!");
        } else {
            System.out.println("Success!");
        }

        driver.navigate().back();


        WebElement avatarThree = driver.findElement(By.xpath(AVATAR3));
        action.moveToElement(avatarThree).build().perform();

        WebElement userNameThree = driver.findElement(By.xpath(USER_NAME_THREE));
        System.out.println("User Name of the Third User: " + userNameThree.getText());

        WebElement profileLinkThree = driver.findElement(By.xpath(PROFILE_LINK_THREE));
        profileLinkThree.click();

        WebElement errorThree = driver.findElement(By.xpath(ERROR_TEXT));
        if (errorThree.isDisplayed()){
            System.out.println("Test Failed! Error 404!");
        } else {
            System.out.println("Success!");
        }
    }
}
