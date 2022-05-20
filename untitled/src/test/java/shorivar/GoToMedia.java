package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoToMedia {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[1]/a")
    private WebElement wifi;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[2]/a")
    private WebElement in;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[3]/a")
    private WebElement tw;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[4]/a")
    private WebElement face;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[5]/a")
    private WebElement inst;

    public GoToMedia(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://press.wolt.com/en-WW");
    }

    public GoToMedia wifi(){
        WebElementAction.doClick(driver, wifi);
        return new GoToMedia(driver);
    }
    public GoToMedia in(){
        WebElementAction.doClick(driver, in);
        return new GoToMedia(driver);
    }
    public GoToMedia twitter(){
        WebElementAction.doClick(driver, tw);
        return new GoToMedia(driver);
    }
    public GoToMedia facebook(){
        WebElementAction.doClick(driver, face);
        return new GoToMedia(driver);
    }
    public GoToMedia inst(){
        WebElementAction.doClick(driver, inst);
        return new GoToMedia(driver);
    }

}
