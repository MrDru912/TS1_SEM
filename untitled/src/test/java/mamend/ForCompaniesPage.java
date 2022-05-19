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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForCompaniesPage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[text()='Get in touch']")
    private WebElement button;

    public ForCompaniesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public getInTouchPage getInTOuch(){
        Wait.wait10(button,driver);
        Utils.jsClick(button,driver);
        return new getInTouchPage(driver);
    }
}
