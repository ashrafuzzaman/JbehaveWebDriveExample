package ashraf.examples.webdriver.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import ashraf.examples.webdriver.pages.Pages;

public class BasicWebSteps {

    private final Pages pages;

    public BasicWebSteps(Pages pages) {
        this.pages = pages;
    }

    @Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();        
    }

    @When("user opens Resume page")
    public void userClicksOnRunStory(){        
        pages.resume().open();
    }
    
    @Then("Resume page is shown")
    public void runStoryPageIsShown(){
        pages.resume().isShown();
    }

}
