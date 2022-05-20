package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PressPage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/div/main/div/section[1]/article/div[2]/div/a")
    private WebElement article;
    @FindBy(how = How.XPATH, using = "//*[@id='slick-slide01']/div/a")
    private WebElement slide01;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div[2]/div/div/a")
    private WebElement request;
    @FindBy(how = How.XPATH, using =  "/html/body/div/main/div[1]/div/div/div[2]/div[3]/ul/li[4]/a")

    private WebElement facebook;


    public PressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://press.wolt.com/en-WW");
    }

    public NewsPage getData(){
        //WebElementAction.doClick(driver, accept);
        WebElementAction.doClick(driver, article);
        WebElementAction.doClick(driver, slide01);
        //WebElementAction.doClick(driver, request);
        //WebElementAction.doClick(driver, facebook);
        return new NewsPage(driver);
    }
}
