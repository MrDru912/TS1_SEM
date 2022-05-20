package shorivar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LocationStoreBlank {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@type='text']")
    private WebElement name;
    @FindBy(how = How.XPATH, using = "//*[@type='tel']")
    private WebElement tel;
    @FindBy(how = How.XPATH, using = "//*[@type='email']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div/form/div[5]/div/input")
    private WebElement pod;
    @FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div/form/div[6]/div/div[1]/input")
    private WebElement address;
    @FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div/form/div[8]/div/input")
    private WebElement prod;
    @FindBy(how = How.XPATH, using = "//div[2]/div/label[2]/input")
    private WebElement radio;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/form/button")
    private WebElement submit;


    public LocationStoreBlank(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        driver.get("https://webforms.pipedrive.com/f/2XBZBT0X5P97qXz8ySkTeAocRAYzb1FgUoDkv1vC2m1P5hLub6ChWJokZEGLxzoen");

    }

    public LocationStoreBlank doBlank(){
        WebElementAction.doKeys(driver, name, "John");
        WebElementAction.doKeys(driver, tel, "8005553535");
        WebElementAction.doKeys(driver, email, "hi@gmail.com");
        WebElementAction.doKeys(driver, pod, "John");
        WebElementAction.doKeys(driver, address, "John");
        WebElementAction.doKeys(driver, prod, "John");
        Utils.jsClick(radio, driver);
        Utils.jsClick(submit, driver);
        //WebElementAction.doClick(driver, accept);
        //WebElementAction.doClick(driver, article);
       // Utils.jsClick(article, driver);
        // WebElementAction.doClick(driver, slide01);
        //WebElementAction.doClick(driver, request);
        //WebElementAction.doClick(driver, facebook);
        return new LocationStoreBlank(driver);
    }
}
