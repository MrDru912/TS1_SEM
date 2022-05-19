package mamend.WoltTests;

import HelpClasses.TestCase;
import mamaeand.CompanyForm;
import mamend.WoltStartPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WoltCompanyFormTest extends TestCase {

    @ParameterizedTest
    @CsvSource({
            "Jordan Peel,jordan@gmail.com,+420320565765,AlphaStrategy,2-10,Japan",
//            "Ann Johns,annyfire@gmail.com,++320666777432,Alza,2-10,Latvia",
    })
    public void cooperationBlankForCompanyTest(String name,String email,String phoneNumber,
                                               String company,String companySize,String country){
//        System.out.println(name+" "+email+" "+phoneNumber+" "+companySize+" "+company+" "+country);
        CompanyForm cf = new CompanyForm(name,email,phoneNumber,company,companySize,country);
        new WoltStartPage(getDriver()).goToForCompanies().getInTOuch().contactUs().fillCompanyForm(cf);
    }
}
