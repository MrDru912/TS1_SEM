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
        //new ChooseRestaurants(getDriver()).goToRestaurants();
        // new ChooseFood(getDriver()).takeFood();
        //new ChooseMarket(getDriver()).goToMarket();
        new ChooseMarket(getDriver()).goToMarket().takeFood();
    }

    @Test
    public void BuyTestRestaurant(){
        new ChooseRestaurants(getDriver()).goToRestaurants().takeFood();
        //new ChooseMarket(getDriver()).goToMarket();
        //new ChooseMarketFood(getDriver()).takeFood();
    }

    @Test
    public void ForCouriersTest(){
        new  СhooseLocationCouriers(getDriver()).ChooseLocal().doAkk();//.doAkk();//.ChooseLocal().doBlank();
    }

    @Test
    public void ForStoresTest(){
        new  СhooseLocationStore(getDriver()).ChooseLocal().doBlank();
    }

    @ParameterizedTest
    @CsvSource({
            "Jordan, Peel, jordan@gmail.com, hi, Other, Angola, Berlin, +34684257921"
    })
    public void MediaTest(String first, String last, String emailData, String pub, String j, String c, String ci, String num){
        new NewsPage(getDriver()).getData(first, last, emailData, pub, j, c, ci, num);
        // new PressPage(getDriver()).getData().getData(first, last, emailData, pub, j, c, ci, num);
    }

    @Test
    public void SubscribeTest(){
        new  doSubscribe(getDriver()).BlankSubscribe();//.doAkk();//.ChooseLocal().doBlank();
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
