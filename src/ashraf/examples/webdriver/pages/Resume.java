package ashraf.examples.webdriver.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Resume extends AbstractPage {

    public Resume(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
    
    public void open(){
        findElement(By.linkText("Resume")).click();
    }
    
    public void isShown() {
        waitFor(2);
        String output = findElement(By.cssSelector("#menu .selected a")).getText();
        assertTrue("Resume menu should be selected", output.contains("Resume"));
    }

    private void waitFor(int timeoutInSecs) {
        try {
            TimeUnit.SECONDS.sleep(timeoutInSecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
