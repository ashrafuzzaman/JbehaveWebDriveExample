package ashraf.examples.webdriver.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverProvider;

public class Home extends AbstractPage {

    public Home(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open() {
        get("http://www.ashrafuzzaman.com/");
        manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
