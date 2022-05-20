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
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/main/div/div[5]/div/button/div[3]/div[2]")
    private WebElement order;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/a/button")
    private WebElement google;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/button[2]/span/span/span")
    private WebElement facebook;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/div/div/div/div[3]/button[2]")
    private WebElement accept2;


    public ChooseMarketFood(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/cze/prague/venue/artic-bakehouse-myslikova");
    }

    public ChooseMarketFood takeFood(){
       // System.out.println("CATS");
        //WebElementAction.doClick(driver, accept);
        WebElementAction.doFastClick(driver, food1);
        Utils.jsClick(add1, driver);
        Utils.jsClick(order, driver);
        Utils.jsClick(facebook, driver);
        return new ChooseMarketFood(driver);
    }
}
