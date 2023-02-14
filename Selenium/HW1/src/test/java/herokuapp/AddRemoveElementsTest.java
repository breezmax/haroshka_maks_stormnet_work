package herokuapp;

import framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    private static final String NAV_ADD_REMOVE_MENU = "//a[contains(text(),'%s')]";
    private static final String ADD_ELEMENT_BUTTON = "//button[contains(text(), '%s')]";

    private static final String REMOVE_ELEMENT_BUTTON = "//div[@id='elements']/button[2]";


    @Test
    public void AddRemoveTest(){
        WebElement addRemoveMenu = driver.findElement(By.xpath(String.format(NAV_ADD_REMOVE_MENU, "Add/Remove Elements")));
        addRemoveMenu.click();

        WebElement addElementButton = driver.findElement(By.xpath(String.format(ADD_ELEMENT_BUTTON, "Add Element")));
        addElementButton.click();
        addElementButton.click();

        WebElement removeElementButton = driver.findElement(By.xpath(REMOVE_ELEMENT_BUTTON));
        removeElementButton.click();

        System.out.printf("Final count of elements: %s\n", driver.findElements(By.className("added-manually")).size());
    }
}
