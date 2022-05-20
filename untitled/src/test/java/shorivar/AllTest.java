package shorivar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AllTest extends TestCase{

    @ParameterizedTest
    @CsvSource({
            "Jordan, Peel, jordan@gmail.com, Japan, +34684257921, hi"
    })
    public void FirstTest(String first, String last, String emailData, String loc, String num, String letter){
        new WorkChoose(getDriver()).getData().getData(first, last, emailData, loc, num, letter);
    }

    @Test
    public void BuyTestMarket(){
        new ChooseMarket(getDriver()).goToMarket().takeFood();
    }

    @Test
    public void BuyTestRestaurant(){
        new ChooseRestaurants(getDriver()).goToRestaurants().takeFood();
    }

    @Test
    public void ForCouriersTest(){
        new  СhooseLocationCouriers(getDriver()).ChooseLocal().doAkk();
    }

    @Test
    public void ForStoresTest(){
        LocationStoreBlank l = new  СhooseLocationStore(getDriver()).ChooseLocal();
        l.doBlank();
    }

    @ParameterizedTest
    @CsvSource({
            "Jordan, Peel, jordan@gmail.com, hi, Other, Angola, Berlin, +34684257921"
    })
    public void MediaTest(String first, String last, String emailData, String pub, String j, String c, String ci, String num){
         new PressPage(getDriver()).getData().getData(first, last, emailData, pub, j, c, ci, num);
    }

    @Test
    public void SubscribeTest(){
        new  doSubscribe(getDriver()).BlankSubscribe();
    }

    @Test
    public void GoMediaTest(){
        new  GoToMedia(getDriver()).in();
        new  GoToMedia(getDriver()).wifi();
        new  GoToMedia(getDriver()).facebook();
        new  GoToMedia(getDriver()).inst();
        new  GoToMedia(getDriver()).twitter();
    }

}
