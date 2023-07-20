package Classes.Stepdefinitions;

import Classes.Pageobjects.PageObjects;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepDefinition {
//    public PageObjects page = new PageObjects();
    public final Hooks hooks;
    public final PageObjects page;

    public StepDefinition(Hooks hooks) {
        this.hooks = hooks;
        this.page = new PageObjects(hooks);
    }

    @Given("I have a step")
    public void iHaveAStep() {
        page.driver.navigate().to("https://www.google.com/");
    }

    @When("I perform an action")
    public void iPerformAnAction() throws InterruptedException {
        Thread.sleep(2000);
        page.EntervalueinGoogle();
    }

    @Then("I should see a result")
    public void iShouldSeeAResult() {
        // Step implementation
    }

    @Given("I have a step {string}")
    public void iHaveAStep(String arg0) {
        page.driver.navigate().to(arg0);
    }

    @When("User enter email to facebook")
    public void userEnterEmailToFacebook() throws InterruptedException {
        Thread.sleep(2000);
        page.EnterValueInEmail();
    }


    @Then("I close the driver")
    public void iCloseTheDriver() {
        page.driver.close();
    }
}
