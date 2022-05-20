package shorivar;

import org.junit.jupiter.api.Test;


public class ForStoresTest extends TestCase{
    @Test
    public void ForStoresTest(){
       // new  СhooseLocationStore(getDriver()).ChooseLocal();
        new LocationStoreBlank(getDriver()).doBlank();
    }
}
