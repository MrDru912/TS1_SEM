package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class WorkInput{
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    private WebElement firstName;
    @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
    private WebElement lastName;
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//select[@id='location']")
    private WebElement location;
    @FindBy(how = How.XPATH, using = "//input[@id='phoneNumber']")
    private WebElement number;
    @FindBy(how = How.XPATH, using = "//textarea[@id='coverLetter']")
    private WebElement coverLetter;
    @FindBy(how = How.XPATH, using = "//div[@class='toggle-track']")
    private WebElement toggleTrack;
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement submit;

    public WorkInput(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/jobs/posting/b119fc43-966a-4c7c-9c34-9629e6a96426");
    }

    public WorkInput getData(String first, String last, String emailData, String loc, String num, String letter){
        WebElementAction.doKeys(driver, firstName, first);
        WebElementAction.doKeys(driver, lastName, last);
        WebElementAction.doKeys(driver, email, emailData);
        WebElementAction.doSelect(driver, location, loc);
        WebElementAction.doKeys(driver, number, num);
        WebElementAction.doKeys(driver, coverLetter, letter);
        Utils.jsClick(toggleTrack, driver);
        Utils.jsClick(submit, driver);
        return  new WorkInput(driver);
    }

}
