package shorivar;

import org.junit.jupiter.api.Test;

public class BuyTest extends TestCase {

    @Test
    public void BuyTest(){
        //new ChooseRestaurants(getDriver()).goToRestaurants();
       // new ChooseFood(getDriver()).takeFood();
        //new ChooseMarket(getDriver()).goToMarket();
        new ChooseMarketFood(getDriver()).takeFood();
    }
}
