package herokuapp;

import framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NotificationsTest extends BaseTest {

    private static final String NAV_HOVERS_MENU = "//a[contains(text(),'%s')]";
    private static final String CLICK_HERE = "//a[contains(text(),'Click here')]";
    private static final String NOTIFICATION_POPUP = "//div[@class='flash notice']";


    @Test
    public void HoversElementsTest(){

        WebElement notificationMessagesMenu = driver.findElement(By.xpath(String.format(NAV_HOVERS_MENU, "Notification Messages")));
        notificationMessagesMenu.click();

        WebElement clickHereButton = driver.findElement(By.xpath(CLICK_HERE));
        clickHereButton.click();

        WebElement notificationMessage = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(NOTIFICATION_POPUP))));

        if (notificationMessage.isDisplayed()){
            System.out.println("Success! Notification is displayed!");
        } else {
            System.out.println("Test Failed! Notification was not appeared");
        }

        if (notificationMessage.getText().contains("Action successful")){
            System.out.println("Success! Notification Text: " + notificationMessage.getText());
        } else {
            System.out.println("Test Failed! Notification Text: " + notificationMessage.getText());
        }
    }
}
