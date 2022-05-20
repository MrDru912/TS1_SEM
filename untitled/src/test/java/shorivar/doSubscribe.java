package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class doSubscribe {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div[1]/div[1]/div[1]/div/ul/li")
    private WebElement button;
    @FindBy(how = How.XPATH, using = "//input[@class='placeholder_input']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//select[@id='follower_frequency']")
    private WebElement freq;
    @FindBy(how = How.XPATH, using = "//input[@id='follower_has_consented']")
    private WebElement check;
    @FindBy(how = How.XPATH, using = "//*[@id='tab-1']/form/div[1]/div[3]/button")
    private WebElement subscribe;

    public doSubscribe(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://press.wolt.com/en-WW");
    }

    public doSubscribe BlankSubscribe(){
        //WebElementAction.doClick(driver, accept);
        //WebElementAction.doClick(driver, article);
        //Utils.jsClick(button, driver);
        WebElementAction.doClick(driver, button);
        WebElementAction.doKeys(driver, email, "hi@gmail.com");
        WebElementAction.doSelect(driver, freq, "Daily digest");
        Utils.jsClick(check, driver);
        //WebElementAction.doClick(driver, check);
        Utils.jsClick(subscribe, driver);
        // WebElementAction.doClick(driver, slide01);
        //WebElementAction.doClick(driver, request);
        //WebElementAction.doClick(driver, facebook);
        return new doSubscribe(driver);
    }
}
