package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class СhooseLocationStore {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div/div[1]/div[2]/div/div/div[2]/a/button")
    private WebElement article;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div/div[1]/div[2]/div/div/div[1]/div/span")
    private WebElement slide01;

    public СhooseLocationStore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/retailers");
    }

    public LocationStoreBlank ChooseLocal(){
        WebElementAction.doClick(driver, accept);
        Utils.jsClick(article, driver);
        return new LocationStoreBlank(driver);
    }
}
