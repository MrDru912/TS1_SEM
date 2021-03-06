package mamend;

import HelpClasses.Utils;
import HelpClasses.Wait;
import mamaeand.CompanyForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Util;

import java.time.Duration;

public class WoltStartPage {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[text()='For companies']")
    private WebElement goToForCompaniesLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Wolt Drive']")
    private WebElement woltDriveLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Engineering blog']")
    private WebElement engeineeringBlogLink;

    public WoltStartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/");
    }

    public ForCompaniesPage goToForCompanies(){
        Wait.wait10(goToForCompaniesLink,driver);
        Utils.jsClick(goToForCompaniesLink,driver);
        return new ForCompaniesPage(driver);
    }

    public WoltDrivePage goToWoltDrive(){
        Wait.wait10(woltDriveLink,driver);
        Utils.jsClick(woltDriveLink,driver);
        return new WoltDrivePage(driver);
    }

    public ChooseCityPage chooseCountry(String country){
        WebElement countryButton = driver.findElement(By.xpath("//span[text()='"+country+"']"));
        Utils.jsClick(countryButton,driver);
        return new ChooseCityPage(driver);
    }

    public EngineeringBlogPage goToEngBlog(){
        Wait.wait30(engeineeringBlogLink,driver);
        Utils.jsClick(engeineeringBlogLink,driver);
        return new EngineeringBlogPage(driver);
    }

}
