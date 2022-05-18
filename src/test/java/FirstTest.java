import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**Created by shorivar*/
public class FirstTest {

    @Test
    public void FirstTest(){
        ChromeDriver driver = Intro.doChrome("https://www.ikea.com/cz/cs/customer-service/zlepseme-spolecne-nakup-v-ikea-pub8bf501a0");

        WebElement button =  driver.findElement(By.xpath("//*[@id=\"d5219c80-5df2-11ea-9ffe-83780ddb6b86\"]/pub-hide-empty-link/div/a/span/span"));
        Wait.wait30(button, driver);
        button.click();
        WebElement textarea = driver.findElement(By.xpath("//*[@id=\"sgE-90194077-3-231-element\"]"));
      //  Wait.wait30(textarea, driver);
        textarea.sendKeys("I use your website for my hm of testing, sorry");
        WebElement button2 =  driver.findElement(By.xpath("//*[@id=\"sg_NextButton\"]"));
        Wait.wait30(button2, driver);
        button2.click();
        WebElement good =  driver.findElement(By.xpath("//*[@id=\"sgE-90194077-35-77-10397-image\"]"));
        Wait.wait30(good, driver);
        good.click();
        WebElement button3 =  driver.findElement(By.xpath("//*[@id=\"sg_NextButton\"]"));
        Wait.wait30(button3, driver);
        button3.click();
        WebElement first =  driver.findElement(By.xpath("//*[@id=\"sgE-90194077-57-226-box\"]/div/ul/li[1]/label"));
        Wait.wait30(first, driver);
        first.click();
        WebElement Ne =  driver.findElement(By.xpath("//*[@id=\"sgE-90194077-57-235-10859\"]"));
        Wait.wait30(Ne, driver);
        Ne.click();
        WebElement button4 =  driver.findElement(By.xpath("//*[@id=\"sg_NextButton\"]"));
        Wait.wait30(button4, driver);
        button4.click();
    }
}
