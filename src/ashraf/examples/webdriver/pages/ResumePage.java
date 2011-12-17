package ashraf.examples.webdriver.pages;

import static junit.framework.Assert.assertTrue;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

/*
 * Contains page specific
 *   HTML structure
 *   Assertions
 *   Navigation
 */
public class ResumePage extends AbstractPage {

    public ResumePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
    
    public void open(){
        findElement(By.linkText("Resume")).click();
    }
    
    public void assertShown() {
        String output = findElement(By.cssSelector("#menu .selected a")).getText();
        assertTrue("Resume menu should be selected", output.contains("Resume"));
    }

}
