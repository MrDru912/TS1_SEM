package mamend;

import HelpClasses.Utils;
import HelpClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WoltDrivePage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[text()='Get started']")
    private WebElement getStartedButton;



    public WoltDrivePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }


    public getInTouchFormPage getStarted(){
        Wait.wait10(getStartedButton,driver);
        Utils.jsClick(getStartedButton,driver);
        return new getInTouchFormPage(driver);
    }
}
