package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.Elements;

import static StepDefinition.AddCusStepdefs.driver;

public class DeleteStepdefs {

    Elements elements;
//    WebDriver driver;


    @Given("user in customers page")
    public void userInCustomersPage() {
        elements = new Elements(driver);
        elements.selectCustomerPage();
    }

    @When("user search names")
    public void userSearchNames() throws InterruptedException {
        Thread.sleep(1000);
        elements.searchCus();



    }

    @And("delete the account")
    public void deleteTheAccount() throws InterruptedException {
        Thread.sleep(1000);
        elements.deleteCus();
    }

    @Then("successfully account will be deleted")
    public void successfullyAccountWillBeDeleted() throws InterruptedException {
        Thread.sleep(1000);
        elements.homeButton();
    }
}
