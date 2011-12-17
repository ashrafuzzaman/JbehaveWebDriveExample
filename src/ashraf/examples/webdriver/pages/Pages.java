package ashraf.examples.webdriver.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class Pages {

    private final WebDriverProvider driverProvider;
    private HomePage home;
    private ResumePage runStory;

    public Pages(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public HomePage homePage(){
        if ( home == null ){
            home = new HomePage(driverProvider);
        }
        return home;
    }
    
    public ResumePage resumePage() {
        if ( runStory == null ){
            runStory = new ResumePage(driverProvider);
        }
        return runStory;
    }

    
}
