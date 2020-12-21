package testSuite;

import JunitBasics.ParameterizedJunitTest;
import base.CommonUtil;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.CreateAnAccountPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCreateAccountPage extends CommonUtil {
    @Test
    @Order(0)
    public void emailReg() {
        try {
            HomePage.signIn(driver).click();
            CreateAnAccountPage.emailRegister(driver).sendKeys("Vikram.r9@1990.com");
            CreateAnAccountPage.submitEmail(driver).click();
            radioButtonSelect(CreateAnAccountPage.genderButton(driver));
            CreateAnAccountPage.firstName(driver).sendKeys("Vikram");

            //Screenshot of first submission inputs
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,0)");
            takeScreenshot("createAccount1");

            CreateAnAccountPage.lastName(driver).sendKeys("Raja");
            CreateAnAccountPage.Password(driver).sendKeys("Animal-62");
            CreateAnAccountPage.firstNameAdd(driver).sendKeys("Vikram");
            CreateAnAccountPage.lastNameAdd(driver).sendKeys("Raja");
            CreateAnAccountPage.companyAdd(driver).sendKeys("HCL");
            CreateAnAccountPage.address(driver).sendKeys("Vivekanandar Street");
            CreateAnAccountPage.city(driver).sendKeys("Madurai");

//            //Screenshot of Midway submission inputs
//            jse.executeScript("window.scrollBy(0,0)");
            takeScreenshot("createAccount2");

            selectValueByVisibleTextInDropdown(CreateAnAccountPage.country(driver),"United States");
            selectValueByVisibleTextInDropdown(CreateAnAccountPage.state(driver),"Washington");
            CreateAnAccountPage.postCode(driver).sendKeys("20006");
            CreateAnAccountPage.other(driver).sendKeys("Not Applicable");
            CreateAnAccountPage.mobileNumber(driver).sendKeys("9003732718");

            //Screenshot of final submission inputs
            takeScreenshot("createAccount3");
            CreateAnAccountPage.submitAccount(driver).click();

            //Screenshot of post submission
            takeScreenshot("createAccount4");
        } catch (NullPointerException i) {
            System.out.println("There is some locators related exception. Please check all the locators");
        }
        String welcomeText = CreateAnAccountPage.welcomeText(driver).getText();
        String Expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
        assertEquals(welcomeText, Expected);
        CreateAnAccountPage.homeButton(driver).click();
        //Logout of current user
        HomePage.logOut(driver).click();
    }

    @Test
    public void reLogin() {
        try {
            HomePage.signIn(driver).click();
            CreateAnAccountPage.emailRegister(driver).sendKeys("Vikram.r8@1990.com");
            CreateAnAccountPage.submitEmail(driver).click();
            String emailError = CreateAnAccountPage.emailError(driver).getText();
            String Expected = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
            assertEquals(emailError, Expected);
            System.out.println("The Email already exists in Database. Please Enter new email");
        } catch (NoSuchElementException n) {
            System.out.println("The element could not be found");
        }
    }

}
