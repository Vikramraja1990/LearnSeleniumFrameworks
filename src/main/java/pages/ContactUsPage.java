package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
    public static WebElement element = null;

    public static WebElement contactUsPageLabel(WebDriver driver) {
        System.out.println();
        element = driver.findElement(By.className("page-subheading"));
        return element;
    }

    public static WebElement subjectHeadingDropDown(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@id='id_contact']"));
        return element;
    }

    public static WebElement emailAddress(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='email']"));
        return element;
    }

}
