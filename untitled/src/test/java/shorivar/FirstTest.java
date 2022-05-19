package shorivar;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**Created by shorivar*/
public class FirstTest {

    @Test
    public void FirstTest(){
        ChromeDriver driver = Intro.doChrome("https://wolt.com/en/jobs");

        WebElement button =  driver.findElement(By.xpath("//*[@class=\"pub__btn__label\"]"));
        //  <span class="pub__btn__label">Podělte se o zkušenost</span>
        // <textarea id="sgE-90194077-3-231-element" name="sgE-90194077-3-231" class="sg-input sg-input-essay" cols="125" rows="5"></textarea>
        WebElementAction.doClick(driver, button);

    }
}