package mamend;

import HelpClasses.TestCase;
import HelpClasses.Utils;
import mamaeand.GetInTouchForm;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExploreCountriesTest extends TestCase {
    @ParameterizedTest
    @CsvSource({
            "Croatia,Split","Cyprus,Nicosia","Finland,Kotka","Israel,Tel Aviv"
    })
    public void exploreCountriesTest(String country, String city){
        new WoltStartPage(getDriver()).chooseCountry(country).chooseCity(city);
    }

    @Test
    public void help(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\andre\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wolt.com/en/jobs/posting/b119fc43-966a-4c7c-9c34-9629e6a96426");
        WebElement e = driver.findElement(By.xpath("//div[@class='toggle-track-yes']"));
        Utils.jsClick(e,driver);
    }
}
