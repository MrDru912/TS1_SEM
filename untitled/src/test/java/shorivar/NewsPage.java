package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class NewsPage{
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@id='lead_first_name']")
    private WebElement firstName;
    @FindBy(how = How.XPATH, using = "//input[@id='lead_last_name']")
    private WebElement lastName;
    @FindBy(how = How.XPATH, using = "//input[@id='lead_email']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//*[@id='lead_organisation']")
    private WebElement publication;
    @FindBy(how = How.NAME, using = "lead[job_title]")
    private WebElement job;
    @FindBy(how = How.NAME, using = "lead[country]")
    private WebElement country;
    @FindBy(how = How.XPATH, using = "//input[@id='lead_city']")
    private WebElement city;
    @FindBy(how = How.XPATH, using = "//input[@id='lead_phone']")
    private WebElement number;
    @FindBy(how = How.XPATH, using = "//*[@id='lead_has_consented']")
    private WebElement check;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/main/section[2]/div/form/div/div[2]/div[2]/div[10]/button")
    private WebElement submit;

    public NewsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://press.wolt.com/en-WW/press-list/join/");
    }

    public NewsPage getData(String first, String last, String emailData, String pub, String j, String c, String ci, String num){
        WebElementAction.doKeys(driver, firstName, first);
        WebElementAction.doKeys(driver, lastName, last);
        WebElementAction.doKeys(driver, email, emailData);
        WebElementAction.doKeys(driver, publication, pub);
        WebElementAction.doSelect(driver, job, j);
        WebElementAction.doSelect(driver, country, c);
        WebElementAction.doKeys(driver, city, ci);
        WebElementAction.doKeys(driver, number, num);
        Utils.jsClick(check, driver);
        Utils.jsClick(submit, driver);
        return  new NewsPage(driver);
    }

}
