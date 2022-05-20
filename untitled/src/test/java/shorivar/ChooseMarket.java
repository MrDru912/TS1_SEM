package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChooseMarket {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/nav/div/div[2]/div[2]/div/div[3]/a")
    private WebElement buttonToMarket;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/a[1]")
    private WebElement market;

    public ChooseMarket(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/discovery");
    }

    public ChooseMarketFood goToMarket(){
        WebElementAction.doClick(driver, accept);
        WebElementAction.doClick(driver, buttonToMarket);
        WebElementAction.doClick(driver, market);
        return new ChooseMarketFood(driver);
    }
}
