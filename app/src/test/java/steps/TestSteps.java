package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import pages.TestPage;

public class TestSteps {
    TestPage testPage = new TestPage();
    @Given("the access to google")
    public void accessGoogle() {
        TestCase.assertTrue("Error to realize the access to google", testPage.accessGoogle());
    }

    @When("I type {string} in input")
    public void typeInput(String type) {
        TestCase.assertTrue("Error to realize the type in input", testPage.typeInput(type));
    }

    @Then("I will be redirected to the Search page")
    public void redirectedSearchPage() {
        TestCase.assertTrue("Error to realize the validation of search page", testPage.redirectedSearchPage());
    }
}
