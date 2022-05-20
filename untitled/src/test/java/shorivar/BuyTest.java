package shorivar;

import org.junit.jupiter.api.Test;

public class BuyTest extends TestCase {

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
}
