package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCouriersAccount {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div[2]/div/div/div/div/div/div/button[1]")
    private WebElement sign;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div/div[1]/div[2]/div/div/div[1]/div/span")
    private WebElement slide01;

    public NewCouriersAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/apply-as-courier");
    }

    public NewCouriersAccount doAkk(){
        //WebElementAction.doClick(driver, accept);
        //WebElementAction.doClick(driver, article);
        Utils.jsClick(sign, driver);
        // WebElementAction.doClick(driver, slide01);
        //WebElementAction.doClick(driver, request);
        //WebElementAction.doClick(driver, facebook);
        return new NewCouriersAccount(driver);
    }
}
