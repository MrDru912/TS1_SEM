package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChooseFood {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div[4]/div[2]/div[1]/div[4]/div/section[1]/div[2]/div[1]/div/button")
    private WebElement food1;
    @FindBy(how = How.XPATH, using = "//span[@data-localization-key='product-modal.submit.add']")
    private WebElement add1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div[4]/div[2]/div[1]/div[4]/div/section[5]/div[2]/div[3]/div/button")
    private WebElement food2;
    @FindBy(how = How.XPATH, using = "/html/body/div[17]/div/aside/footer/div/div/div/div[2]/button")
    private WebElement add2;

    public ChooseFood(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/cze/prague/restaurant/wokin-jindrisska");
    }

    public ChooseFood takeFood(){
       // WebElementAction.doClick(driver, accept);
        WebElementAction.doClick(driver, food1);
        Utils.jsClick(add1, driver);
        //WebElementAction.doClick(driver, add1);
        //WebElementAction.doClick(driver, food2);
        //Utils.jsClick(add2, driver);
        //WebElementAction.doClick(driver, add2);
        return new ChooseFood(driver);
    }
}
