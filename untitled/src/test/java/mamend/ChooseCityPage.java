package mamend;

import HelpClasses.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChooseCityPage {

    private final WebDriver driver;


    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement city;


    public ChooseCityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void chooseCity(String city){
        WebElement cityButton = driver.findElement(By.xpath("//span[text()='"+city+"']"));
        Utils.jsClick(cityButton,driver);
    }

}
