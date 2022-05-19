package mamend;

import HelpClasses.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class getInTouchPage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Contact us']")
    private WebElement button;

    public getInTouchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public CompanyFormPage contactUs(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(button));
        Utils.jsClick(button,driver);
        return new CompanyFormPage(driver);
    }

}
