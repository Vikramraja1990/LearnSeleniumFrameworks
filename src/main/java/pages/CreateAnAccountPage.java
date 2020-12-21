package pages;

import base.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class CreateAnAccountPage
{
    public static WebElement element;



    public static WebElement emailRegister(WebDriver driver)
    {
        element = driver.findElement(By.name("email_create"));
        return element;
    }
    public static WebElement submitEmail(WebDriver driver)
    {
        element = driver.findElement(By.id("SubmitCreate"));
        return element;
    }


        /*//Enter Register button without entering any input
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated((By.id("submitAccount"))));
        driver.findElement(By.id("submitAccount")).click();

        //wait until the element first name is found
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated((By.id("customer_firstname"))));*/

       /* //identify the error messages displayed and print the context
        List<WebElement> messages = driver.findElements(By.xpath("//div[@class='alert alert-danger']/ol/li"));
        System.out.println("The No. of errors displayed are:" + messages.size());
        for (WebElement errors : messages)
        {
            System.out.println("The error messages is:\n\t" + errors.getText());
        }*/

    //fill up the registration form

    public static WebElement firstName(WebDriver driver)
    {
        //driver.findElement(By.id("id_gender1")).click();
        element = driver.findElement(By.id("customer_firstname"));
        return element;
    }
    public static WebElement lastName(WebDriver driver)
    {
        element = driver.findElement(By.id("customer_lastname"));
        return element;
    }

    public static WebElement Password(WebDriver driver)
    {
        element = driver.findElement(By.id("passwd"));
        return element;
    }

    public static WebElement firstNameAdd(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='firstname']"));
        return element;
    }

    public static WebElement lastNameAdd(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='lastname']"));
        return element;
    }

    public static WebElement companyAdd(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='company']"));
        return element;
    }

    public static WebElement address(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='address1']"));
        return element;
    }

    public static WebElement city(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='city']"));
        return element;
    }

    /*public static WebElement country(WebDriver driver)
    {
        Select countrySelect = new Select(driver.findElement(By.name("id_country")));
        countrySelect.selectByVisibleText("United States");
        return element;
    }

    public static WebElement state(WebDriver driver)
    {
        Select stateSelect = new Select(driver.findElement(By.name("id_state")));
        stateSelect.selectByVisibleText("Washington");
        return element;
    }*/

    public static WebElement postCode(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='postcode']"));
        return element;
    }

    public static WebElement other(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"other\"]"));
        return element;
    }

    public static WebElement mobileNumber(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='account_creation']//following::p/input[@id='phone_mobile']"));
        return element;
    }

    public static WebElement welcomeText(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//p[@class='info-account' and text()='Welcome to your account. Here you can manage all of your personal information and orders.']"));
        return element;
    }


    public static WebElement submitAccount(WebDriver driver)
    {
        element = driver.findElement(By.id("submitAccount"));
        return element;
    }

    public static WebElement homeButton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//i[@class='icon-chevron-left']"));
        return element;
    }

    public static WebElement emailError(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='alert alert-danger' and @id='create_account_error']//ol//li"));
        return element;
    }

    public static WebElement genderButton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id='id_gender1']"));
        return element;
    }

    public static WebElement country(WebDriver driver)
    {
        element = driver.findElement(By.name("id_country"));
        return element;
    }

    public static WebElement state(WebDriver driver)
    {
        element = driver.findElement(By.name("id_state"));
        return element;
    }
}
