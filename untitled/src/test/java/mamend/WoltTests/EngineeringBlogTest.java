package mamend.WoltTests;

import HelpClasses.TestCase;
import mamend.WoltStartPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EngineeringBlogTest extends TestCase {

    @Test
    public void engineeringBlogTest(){
        new WoltStartPage(getDriver()).
                goToEngBlog()
                .goToArticle().
                goToKotlinArticle();
    }
}
