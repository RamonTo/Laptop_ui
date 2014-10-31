package net.kiyvstar.steps;



import net.kiyvstar.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static junit.framework.TestCase.assertTrue;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void go_to_news_page() {
        dictionaryPage.open_news_page();
    }

    @Step
    public void verify_that_link_is_present(String definition) {
        assertTrue(dictionaryPage.searchLinkIsVisible(definition));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

}