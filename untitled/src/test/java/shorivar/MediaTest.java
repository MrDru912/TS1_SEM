package shorivar;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;;

public class MediaTest extends TestCase {

    @ParameterizedTest
    @CsvSource({
            "Jordan, Peel, jordan@gmail.com, hi, Other, Angola, Berlin, +34684257921"
    })
    public void MediaTest(String first, String last, String emailData, String pub, String j, String c, String ci, String num){
        new NewsPage(getDriver()).getData(first, last, emailData, pub, j, c, ci, num); //PressPage(getDriver()).getData()
    }
}
