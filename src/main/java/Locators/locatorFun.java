package Locators;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class locatorFun extends PageObject {
    LoginLocators loginLocators = new LoginLocators();

    @Step("home___fhgfh bvgh")
    public void LoginPage() {
        String Backend_Section = $(By.xpath(loginLocators.LoginPage)).getText();
        Assert.assertEquals(Backend_Section, "Backend_Section");
    }

    @Step("Username")

    public void Username(String Username, String Password) {
        $(By.xpath(loginLocators.username)).clear();
        $(By.xpath(loginLocators.password)).clear();
        $(By.xpath(loginLocators.username)).sendKeys((Username));
        $(By.xpath(loginLocators.password)).sendKeys((Password));
    }

    @Step("Login")

    public void Login() {
        $(By.xpath(loginLocators.login)).click();
    }

    @Step("Home Page")

    public void HomePage() throws InterruptedException {
        Thread.sleep(5000);
        String Home = $(By.xpath(loginLocators.homePage)).getText();
        Assert.assertEquals(Home, "Calendar");
    }

    @Step("Login")
    public void ErrorLogin() {
        String Error = $(By.xpath(loginLocators.errorMessage)).getText();
        Assert.assertEquals(Error, "Login failed, please enter the correct credentials and try again.");
    }

    @Step("Customer")

    public void Customer() {
        $(By.xpath(loginLocators.Customer)).click();
    }

    @Step("Add")
    public void Add() {
        $(By.xpath(loginLocators.Add_Btn)).click();
        }

    @Step("All_field")
        public void All_field(){
        $(By.xpath(loginLocators.First_name)).sendKeys("Pavan");
            $(By.xpath(loginLocators.Last_name)).sendKeys("Kopparapu");
            $(By.xpath(loginLocators.Email)).sendKeys("pavan88978@gmail.com");
            $(By.xpath(loginLocators.Phone)).sendKeys("8897814073");
            $(By.xpath(loginLocators.Address)).sendKeys("LPSAVANI");
            $(By.xpath(loginLocators.City)).sendKeys("Surat");
            $(By.xpath(loginLocators.Zip_code)).sendKeys("395010");
            $(By.xpath(loginLocators.Language)).click();
            $(By.xpath(loginLocators.Language_Select)).click();
            $(By.xpath(loginLocators.TimeZone)).click();
        $(By.xpath(loginLocators.SelectTime)).click();
            $(By.xpath(loginLocators.Note)).sendKeys("Pavan");
        }

    @Step("Save_Btn")
        public void Save_Btn() throws InterruptedException {
        Thread.sleep(5000);
            $(By.xpath(loginLocators.Save_btn)).click();
        }
    }
