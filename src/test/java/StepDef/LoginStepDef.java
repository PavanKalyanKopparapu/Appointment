package StepDef;

import Locators.locatorFun;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class LoginStepDef extends PageObject {
    @Steps
    locatorFun locatorFun;

    @When("user is on registration page")
    public void userIsOnRegistrationPage() {
        open();
        System.out.println("uiiii"+getDriver().getCurrentUrl());
    }

    @Then("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        locatorFun.Username(username,password);
    }

    @Then("User click the login button")
    public void userClickTheLoginButton() {
        locatorFun.Login();
    }

    @And("User should successfully login")
    public void userShouldSuccessfullyLogin() throws InterruptedException {
        locatorFun.HomePage();
    }

    @When("User on Click on Customer Logo")
    public void userOnClickOnCustomerLogo() {
        locatorFun.Customer();
    }

    @Then("Click on Add Btn")
    public void clickOnAddBtn() {
        locatorFun.Add();
    }

    @Then("Fill All require field")
    public void fillAllRequireField() {
        locatorFun.All_field();
    }

    @And("Click on Save Btn")
    public void clickOnSaveBtn() throws InterruptedException {
        locatorFun.Save_Btn();
    }
}
