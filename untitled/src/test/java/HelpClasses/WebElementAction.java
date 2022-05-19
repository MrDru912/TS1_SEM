package HelpClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAction {
    public static void doClick(WebDriver driver, WebElement e){
        Wait.wait30(e, driver);
        e.click();
    }
    public static void doKeys(WebDriver driver, WebElement e){
        Wait.wait30(e, driver);
        e.sendKeys("I use your website for my hm of testing, sorry");
    }
}
