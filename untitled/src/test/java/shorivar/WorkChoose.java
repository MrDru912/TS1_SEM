package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WorkChoose {
    private final WebDriver driver;

    //    @FindBy(how = How.XPATH, using = "//*[@id='jobs-select-filters']/div[1]/button")
//    private WebElement button1;
//    @FindBy(how = How.TAG_NAME, using = "//button[text()='Berlin']")
//    private WebElement berlin;
//    @FindBy(how = How.XPATH, using = "//*[@id='jobs-select-filters']/div[2]/button")
//    private WebElement button2;//
    @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/div/main/section[1]/ul/li[1]/div/div[1]/a")
    private WebElement b;
    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;


    public WorkChoose(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/jobs/search");
    }

    public WorkInput getData(){
        WebElementAction.doClick(driver, accept);
        WebElementAction.doClick(driver, b);
        return new WorkInput(driver);
    }
}
