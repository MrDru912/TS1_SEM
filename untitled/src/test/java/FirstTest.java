import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**Created by shorivar*/
public class FirstTest {

    @Test
    public void FirstTest(){
        ChromeDriver driver = Intro.doChrome("https://www.ikea.com/cz/cs/customer-service/zlepseme-spolecne-nakup-v-ikea-pub8bf501a0");

        WebElement button =  driver.findElement(By.xpath("//*[@class=\"pub__btn__label\"]"));
        //  <span class="pub__btn__label">Podělte se o zkušenost</span>
        // <textarea id="sgE-90194077-3-231-element" name="sgE-90194077-3-231" class="sg-input sg-input-essay" cols="125" rows="5"></textarea>
        WebElementAction.doClick(driver, button);
        WebElement textarea = driver.findElement(By.xpath("//textarea[@class=\"sg-input sg-input-essay\"]"));
        WebElementAction.doKeys(driver, button);
        WebElement button2 =  driver.findElement(By.xpath("//*[@id=\"sg_NextButton\"]"));
        WebElementAction.doClick(driver, button2);
        WebElement good =  driver.findElement(By.xpath("//*[@id=\"sgE-90194077-35-77-10397-image\"]"));
        WebElementAction.doClick(driver, good);
        WebElementAction.doClick(driver, button2);
        WebElement first =  driver.findElement(By.xpath("//*[@id=\"sgE-90194077-57-226-box\"]/div/ul/li[1]/label"));
        WebElementAction.doClick(driver, first);
        WebElement Ne =  driver.findElement(By.xpath("//*[@id=\"sgE-90194077-57-235-10859\"]"));
        WebElementAction.doClick(driver, Ne);
        WebElementAction.doClick(driver, button2);
    }
}