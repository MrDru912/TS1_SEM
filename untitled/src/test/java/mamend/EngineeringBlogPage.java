package mamend;

import HelpClasses.Utils;
import HelpClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.helpers.Util;

public class EngineeringBlogPage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//article[@id='post-21280']")
    private WebElement article;

    public EngineeringBlogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public EngBlogArticlePage goToArticle(){
        Wait.wait30(article,driver);
        Utils.jsClick(article,driver);
        return new EngBlogArticlePage(driver);
    }

}
