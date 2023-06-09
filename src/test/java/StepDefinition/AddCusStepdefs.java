package StepDefinition;

import core.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.Elements;


public class AddCusStepdefs {

    public static WebDriver driver;

    Elements elements;


    @Given("user has base url")
    public void userHasBaseUrl() {
        Helper helper = new Helper();
        driver = helper.browser();
    }

    @When("click bank manager login button")
    public void clickBankManagerLoginButton() {
        elements = new Elements(driver);
        elements.clickBankManagerLoginButton();

    }

    @And("click add account button")
    public void clickAddAccountButton() throws InterruptedException {
        Thread.sleep(1000);
        elements.clickAddAccountButton();

    }

    @And("user enter {string} and {string} and {string}")
    public void userEnterFirstNameAndLastNameAndPostCode(String firstName, String lastName, String postCode) throws InterruptedException {

        Thread.sleep(1000);
        elements.userEnterFirstNameAndLastNameAndPostCode(firstName, lastName, postCode);

    }

    @And("click addCustomer button")
    public void clickAddCustomerButton() throws InterruptedException {
        Thread.sleep(1000);
        elements.clickAddCustomerButton();

    }

    @Then("click ok")
    public void clickOk() throws InterruptedException {
        Thread.sleep(1000);
        elements.clickOk();
    }
}
