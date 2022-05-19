package shorivar;

import HelpClasses.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**Created by shorivar*/

public class FirstTest extends TestCase{
    @ParameterizedTest
    @CsvSource({
            "Jordan, Peel, jordan@gmail.com, Japan, +34684257921, hi"
    })
    public void FirstTest(String first, String last, String emailData, String loc, String num, String letter){
        new WorkChoose(getDriver()).getData().getData(first, last, emailData, loc, num, letter);
    }
}