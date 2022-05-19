package mamend;

import HelpClasses.TestCase;
import mamaeand.CompanyForm;
import mamaeand.GetInTouchForm;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WoltDriveTest extends TestCase {

    @ParameterizedTest
    @CsvSource({
            "Jack Daniels,jd@gmail.com,+42032565765,Jack Daniels,https://www.jackdaniels.com/en-us,Poland,Web,Hello world",
    })
    public void woltDriveTest(String name,String email,String phoneNumber,
                              String company,String website,String country,
                              String interestedIn,String message){
        GetInTouchForm form = new GetInTouchForm(name,email,phoneNumber,company,website,country,interestedIn,message);
        new WoltStartPage(getDriver()).goToWoltDrive().getStarted().fillForm(form);
    }

}
