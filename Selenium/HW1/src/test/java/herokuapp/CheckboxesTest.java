package herokuapp;

import framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    private static final String NAV_CHECKBOXES_MENU = "//a[contains(text(),'%s')]";
    private static final String CHECKBOX_1 = "//form[@id='checkboxes']/input[1]";
    private static final String CHECKBOX_2 = "//form[@id='checkboxes']/input[2]";


    @Test
    public void CheckboxesStatusTest() {
        WebElement checkboxesMenu = driver.findElement(By.xpath(String.format(NAV_CHECKBOXES_MENU, "Checkboxes")));
        checkboxesMenu.click();

        WebElement checkbox_one = driver.findElement(By.xpath(CHECKBOX_1));
        if (!checkbox_one.isSelected()){
            System.out.println("Test Passed! Checkbox is 'unchecked'");
            checkbox_one.click();
            if (checkbox_one.isSelected()){
                System.out.println("Success! Now checkbox 'checked'.");
            } else {
                System.out.println("Test Failed! Checkbox is still 'unchecked'");
            }
        } else{
            System.out.println("Test Failed! Checkbox is already 'checked'");
        }

        WebElement checkbox_two = driver.findElement(By.xpath(CHECKBOX_2));
        if (checkbox_two.isSelected()){
            System.out.println("Test Passed! Checkbox is 'checked'");
            checkbox_two.click();
            if (!checkbox_two.isSelected()){
                System.out.println("Success! Now checkbox 'unchecked'.");
            } else {
                System.out.println("Test Failed! Checkbox is still 'checked'");
            }
        } else {
            System.out.println("Test Failed! Checkbox is already 'unchecked'");
        }
    }
}
