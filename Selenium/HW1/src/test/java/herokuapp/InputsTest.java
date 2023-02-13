package herokuapp;

import framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    private static final String NAV_INPUTS_MENU = "//a[contains(text(),'%s')]";
    private static final String KEYS_FIELD = "//input[@type='number']";


    @Test
    public void InputKeysTest() {
        WebElement inputsMenu = driver.findElement(By.xpath(String.format(NAV_INPUTS_MENU, "Inputs")));
        inputsMenu.click();

        WebElement keysField = driver.findElement(By.xpath(KEYS_FIELD));
        keysField.click();

        Actions keys = new Actions(driver);
        keys.sendKeys(keysField, "6")
                .sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();

        if (Integer.parseInt(keysField.getAttribute("value")) == 7) {
            System.out.println("Test Passed! The numbers can be entered in the field");
        } else {
            System.out.println("Test Failed! The numbers can NOT be entered in the field");
        }

        keys.sendKeys(keysField, "abcdefghijklmnopqrstuvwxyz").perform();

        //не понял как вытянуть строку с символами... Значение приходили либо пустое, либо была ошибка парсинга :(
    }
}
