package io.loop.step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.LoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Java in class");
        Driver.getDriver().get(ConfigurationReader.getProperties("env"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
        assertTrue(3==4);

    }
    @When("user enters username for employee")
    public void user_enters_username_for_employe() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user should see the home page for employee")
    public void userShouldSeeTheHomePageForEmployee() {
    }

}
