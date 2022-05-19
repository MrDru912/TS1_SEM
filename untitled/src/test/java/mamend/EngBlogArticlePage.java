package mamend;

import HelpClasses.Utils;
import HelpClasses.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EngBlogArticlePage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@title='kotlin']")
    private WebElement kotlinLink;

    public EngBlogArticlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void goToKotlinArticle(){
        Wait.wait30(kotlinLink,driver);
        Utils.jsClick(kotlinLink,driver);
        WebElement nextArticleWithKotlin = driver.findElement(By.xpath("//article[@id='post-21173']"));
        Wait.wait30(nextArticleWithKotlin,driver);
        Utils.jsClick(nextArticleWithKotlin,driver);
    }

}
