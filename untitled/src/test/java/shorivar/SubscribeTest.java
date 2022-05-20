package shorivar;

import org.junit.jupiter.api.Test;

public class SubscribeTest extends TestCase{
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
