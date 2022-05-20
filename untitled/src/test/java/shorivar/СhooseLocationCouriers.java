package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class СhooseLocationCouriers {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/main/div/div/div[1]/div[2]/div/div/a/button")
    private WebElement lok;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div/div[1]/div[2]/div/div/div[1]/div/span")
    private WebElement slide01;

    public СhooseLocationCouriers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/couriers");
    }

    public NewCouriersAccount ChooseLocal(){
        WebElementAction.doClick(driver, accept);
        //WebElementAction.doClick(driver, article);
        Utils.jsClick(lok, driver);
        // WebElementAction.doClick(driver, slide01);
        //WebElementAction.doClick(driver, request);
        //WebElementAction.doClick(driver, facebook);
        return new NewCouriersAccount(driver);
    }
}
