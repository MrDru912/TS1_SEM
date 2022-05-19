package mamend;

import mamaeand.CompanyForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WoltStartPage {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[text()='For companies']")
    private WebElement goToForCompaniesLink;

    public WoltStartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://link.springer.com/signup-login");
    }

    public void goToForCompanies(CompanyForm cf){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(goToForCompaniesLink));
        goToForCompaniesLink.click();
    }
}
