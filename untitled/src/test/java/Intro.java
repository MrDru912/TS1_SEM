import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
    public static ChromeDriver doChrome(String site){
        System.setProperty("webdriver.chrome.driver","/C:\\Users\\User\\Desktop\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
        driver.get(site);
        return driver;
    }
}
