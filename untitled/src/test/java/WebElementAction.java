import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAction {
    public static void doClick(ChromeDriver driver, WebElement e){
        Wait.wait30(e, driver);
        e.click();
    }
    public static void doKeys(ChromeDriver driver, WebElement e){
        Wait.wait30(e, driver);
        e.sendKeys("I use your website for my hm of testing, sorry");
    }
}
