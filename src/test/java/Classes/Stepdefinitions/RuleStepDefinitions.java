package Classes.Stepdefinitions;

import Classes.Pageobjects.PageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RuleStepDefinitions{

    public final Hooks hooks;
    public final PageObjects page;

    public RuleStepDefinitions(Hooks hooks) {
        this.hooks = hooks;
        this.page = new PageObjects(hooks);
    }

    @When("User enter email to instagram")
    public void userEnterEmailToInstagram() throws InterruptedException {
        Thread.sleep(2000);
        page.EntervalueinInstagram();
    }

    @Then("I should see {string} a result")
    public void iShouldSeeAResult(String arg0) {
        page.ValidatePageTitle(arg0);
    }
}
