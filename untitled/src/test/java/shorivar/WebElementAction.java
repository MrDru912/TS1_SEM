package shorivar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementAction {
    public static void doClick(WebDriver driver, WebElement e){
        WaitClass.wait30(e, driver);
        e.click();
    }
    public static void doFastClick(WebDriver driver, WebElement e){
        WaitClass.wait10(e, driver);
        e.click();
    }
    public static void doKeys(WebDriver driver, WebElement e, String name){
        WaitClass.wait10(e, driver);
        e.sendKeys(name);
    }
    public static void doSelect(WebDriver driver, WebElement e, String name){
        //WaitClass.wait10(e, driver);
       new Select(e).selectByVisibleText(name);
        //new Select(driver.findElement(By.name("lead[job_title]"))).selectByVisibleText("Other");
    }
}
