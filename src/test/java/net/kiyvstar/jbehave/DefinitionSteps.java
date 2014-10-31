package net.kiyvstar.jbehave;

import net.kiyvstar.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @BeforeScenario()
    public void settingsUp(){

    }

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the KS home page")
    public void givenTheUserIsOnTheKSHomePage(){
        endUser.is_the_home_page();
    }

    @When("the user go to news page")
    public void whenTheUserGoToNewsPage(){
        endUser.go_to_news_page();
    }

    @Then("the user should see the link '$link'")
    public void thenTheUserSouldSeeTheLink(String link){
        endUser.verify_that_link_is_present(link);

    }
}
