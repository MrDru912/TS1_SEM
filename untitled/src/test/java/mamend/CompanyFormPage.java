package mamend;

import HelpClasses.Utils;
import HelpClasses.Wait;
import mamaeand.CompanyForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompanyFormPage {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
    private WebElement name;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='example@example.com']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='+123456789']")
    private WebElement phone;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Example Inc.']")
    private WebElement company;
    @FindBy(how = How.XPATH, using = "//select[@name='corporate_employees_count']")
    private WebElement companySize;
    @FindBy(how = How.XPATH, using = "//select[@name='country']")
    private WebElement country;

    @FindBy(how = How.XPATH, using = "//div[text()='Send']")
    private WebElement send;



    public CompanyFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void fillCompanyForm(CompanyForm cf){
        Wait.wait10(name,driver);
        Wait.wait10(email,driver);
        Wait.wait10(phone,driver);
        Wait.wait10(country,driver);
        Wait.wait10(companySize,driver);
        Wait.wait10(company,driver);
        name.sendKeys(cf.getName());
        email.sendKeys(cf.getEmail());
        phone.sendKeys(cf.getPhoneNumber());
        company.sendKeys(cf.getCompany());
        Select selectCompanySize = new Select(companySize);
        selectCompanySize.selectByVisibleText(cf.getCompanySize());
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText(cf.getCountry());
        Utils.jsClick(send,driver);
    }

}
