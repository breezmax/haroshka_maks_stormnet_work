package herokuapp;

import framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropdownTest extends BaseTest {

    private static final String NAV_DROPDOWN_MENU = "//a[contains(text(),'%s')]";
    private static final String DROPDOWN = "//select[@id='dropdown']";
    private static final String DROPDOWN_ELEMENTS = "//select[@id='dropdown']/option";
    private static final String DROPDOWN_VALUE = "//option[contains(text(),'%s')]";


    @Test
    public void CheckboxesStatusTest(){

        List<String> originList = new ArrayList<>();
        Collections.addAll(originList, "Please select an option", "Option 1", "Option 2");

        WebElement dropdownMenu = driver.findElement(By.xpath(String.format(NAV_DROPDOWN_MENU, "Dropdown")));
        dropdownMenu.click();

        WebElement dropdownOnPage = driver.findElement(By.xpath(DROPDOWN));
        dropdownOnPage.click();

        List<WebElement> dropdownList = (ArrayList<WebElement>) driver.findElements(By.xpath(DROPDOWN_ELEMENTS));
        List<String> dropdownOptionLabels = new ArrayList<>();

        for (WebElement listItem : dropdownList) {
            dropdownOptionLabels.add(listItem.getText());
        }

        if (originList.equals(dropdownOptionLabels)){
            System.out.println("Test Passed! All dropdown values are correct");
        } else {
            System.out.println("Test Failed! Dropdown has wrong values.");
        }

        WebElement option_one = driver.findElement(By.xpath(String.format(DROPDOWN_VALUE, "Option 1")));
        option_one.click();

        if (option_one.isSelected()){
            System.out.printf("Test Passed! '%s' is selected.", option_one.getText());
        } else {
            System.out.println("Test Failed! Wrong option was selected");
        }

        dropdownOnPage.click();

        WebElement option_two = driver.findElement(By.xpath(String.format(DROPDOWN_VALUE, "Option 2")));
        option_two.click();

        if (option_two.isSelected()){
            System.out.printf("\nTest Passed! '%s' is selected.\n", option_two.getText());
        } else {
            System.out.println("\nTest Failed! Wrong option was selected\n");
        }
    }
}
