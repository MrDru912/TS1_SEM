package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementAction {
    public static void doClick(WebDriver driver, WebElement e){
        WaitClass.wait30(e, driver);
        e.click();
    }
    public static void doKeys(WebDriver driver, WebElement e, String name){
        WaitClass.wait30(e, driver);
        e.sendKeys(name);
    }
    public static void doSelect(WebDriver driver, WebElement e, String name){
        WaitClass.wait30(e, driver);
        Select s = new Select(e);
        s.selectByVisibleText(name);;
    }
}