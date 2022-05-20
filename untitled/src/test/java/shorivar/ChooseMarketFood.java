package shorivar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChooseMarketFood {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div[4]/div[2]/div[1]/div[3]/div/section[1]/div[2]/div[1]/div/button")
    private WebElement food1;
    @FindBy(how = How.XPATH, using = "//span[@data-localization-key='product-modal.submit.add']")
    private WebElement add1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div[4]/div[2]/div[1]/div[3]/div/section[1]/div[2]/div[2]/div/button")
    private WebElement food2;
    @FindBy(how = How.XPATH, using = "//div[text()='Add to order']")
    private WebElement add2;

    public ChooseMarketFood(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/cze/prague/venue/artic-bakehouse-myslikova");
    }

    public ChooseMarketFood takeFood(){
        WebElementAction.doClick(driver, accept);
        WebElementAction.doFastClick(driver, food1);
        Utils.jsClick(add1, driver);
        // WaitClass.wait10(, driver);
        // WebElementAction.doClick(driver, add1);
        //driver.findElement(By.id("product-modal.submit"));
       // WebElementAction.doFastClick(driver, add1);
      //  WebElementAction.doClick(driver, food2);
        //Utils.jsClick(add2, driver);
        //WebElementAction.doClick(driver, add2);
        return new ChooseMarketFood(driver);
    }
}
