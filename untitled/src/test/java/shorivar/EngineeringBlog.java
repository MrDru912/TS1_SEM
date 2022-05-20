package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EngineeringBlog {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wt-cli-accept-all-btn\"]")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "/html/body/main/section/div[2]/div/a[1]")
    private WebElement blog0;
    @FindBy(how = How.XPATH, using = "/html/body/main/section/div[3]/div/a[1]")
    private WebElement blog1;
    @FindBy(how = How.XPATH, using = "/html/body/main/section/div[4]/div/a[1]")
    private WebElement blog2;
    @FindBy(how = How.XPATH, using = "//select[@id='follower_frequency']")
    private WebElement freq;
    @FindBy(how = How.XPATH, using = "//input[@id='follower_has_consented']")
    private WebElement check;
    @FindBy(how = How.XPATH, using = "//*[@id='tab-1']/form/div[1]/div[3]/button")
    private WebElement subscribe;

    public EngineeringBlog(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://blog.wolt.com/engineering/");
    }

    public EngineeringBlog doBlog(){
        WebElementAction.doClick(driver, accept);
        //WebElementAction.doClick(driver, article);
        //Utils.jsClick(button, driver);
        WebElementAction.doClick(driver, blog0);
        WebElementAction.doClick(driver, blog1);
        WebElementAction.doClick(driver, blog1);

//        WebElementAction.doKeys(driver, email, "hi@gmail.com");
//        WebElementAction.doSelect(driver, freq, "Daily digest");
//        Utils.jsClick(check, driver);
//        //WebElementAction.doClick(driver, check);
//        Utils.jsClick(subscribe, driver);
        // WebElementAction.doClick(driver, slide01);
        //WebElementAction.doClick(driver, request);
        //WebElementAction.doClick(driver, facebook);
        return new EngineeringBlog(driver);
    }
}
