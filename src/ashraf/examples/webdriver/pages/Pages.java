package ashraf.examples.webdriver.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class Pages {

    private final WebDriverProvider driverProvider;
    private Home home;
    private Resume runStory;

    public Pages(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public Home home(){
        if ( home == null ){
            home = new Home(driverProvider);
        }
        return home;
    }
    
    public Resume resume() {
        if ( runStory == null ){
            runStory = new Resume(driverProvider);
        }
        return runStory;
    }

    
}
