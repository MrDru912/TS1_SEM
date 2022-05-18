import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Intro {
    public static ChromeDriver doChrome(String site){
        System.setProperty("webdriver.chrome.driver","/C:\\Users\\User\\Desktop\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
        driver.get(site);
        return driver;
    }
}
