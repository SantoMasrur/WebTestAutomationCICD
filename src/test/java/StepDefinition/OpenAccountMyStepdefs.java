package StepDefinition;

import core.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Elements;

import static StepDefinition.AddCusStepdefs.driver;


public class OpenAccountMyStepdefs {


    Elements elements;


    @Given("User in open account page")
    public void userInOpenAccountPage() {

        elements = new Elements(driver);
        elements.opnAccount();


    }

    @When("user select name from dropdown menu")
    public void userSelectNameFromDropdownMenu() throws InterruptedException {
        Thread.sleep(1000);
        elements.selectName();

        
    }

    @And("select currency from dropdown menu")
    public void selectCurrencyFromDropdownMenu() throws InterruptedException {
        Thread.sleep(1000);
        elements.selectCurrency();
    }

    @And("click process button")
    public void clickProcessButton() throws InterruptedException {
        Thread.sleep(1000);
        elements.selectButton();

    }


    @Then("user successfully navigate the popup")
    public void userSuccessfullyNavigateThePopup() {

        elements.popUp();
    }
}
