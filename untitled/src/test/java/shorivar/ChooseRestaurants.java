package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChooseRestaurants {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[text()='Accept']")
    private WebElement accept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/nav/div/div[2]/div[2]/div/div[2]/a")
    private WebElement buttonToRestaurants;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/a[2]")
    private WebElement restaurant;

    public ChooseRestaurants(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://wolt.com/en/discovery");
    }

    public ChooseFood goToRestaurants(){
        WebElementAction.doClick(driver, accept);
        WebElementAction.doClick(driver, buttonToRestaurants);
        WebElementAction.doClick(driver, restaurant);
        return new ChooseFood(driver);
    }
}
