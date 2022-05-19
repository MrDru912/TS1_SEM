package mamend;

import HelpClasses.Utils;
import HelpClasses.Wait;
import mamaeand.GetInTouchForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class getInTouchFormPage {
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name='V2ViRm9ybUNhcHR1cmVCbG9jazo5YmQ4NTcxMC1jYzk2LTExZWMtOTM5OC1kYmUwZjg2YjMzYTA']")
    private WebElement name;
    @FindBy(how = How.XPATH, using = "//input[@name='V2ViRm9ybUNhcHR1cmVCbG9jazo4OGMxNjk0MC1kMDg0LTExZWMtYTc2MS00NzQ5NjFjNTgzODU']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//input[@name='V2ViRm9ybUNhcHR1cmVCbG9jazo4OGMxNjk0MS1kMDg0LTExZWMtYTc2MS00NzQ5NjFjNTgzODU']")
    private WebElement phone;
    @FindBy(how = How.XPATH, using = "//input[@name='V2ViRm9ybUNhcHR1cmVCbG9jazo4OGMxOTA1MC1kMDg0LTExZWMtYTc2MS00NzQ5NjFjNTgzODU']")
    private WebElement company;
    @FindBy(how = How.XPATH, using = "//input[@name='V2ViRm9ybUNhcHR1cmVCbG9jazo4OGMxOTA1MS1kMDg0LTExZWMtYTc2MS00NzQ5NjFjNTgzODU']")
    private WebElement website;
    @FindBy(how = How.XPATH, using = "//input[@id='V2ViRm9ybUNhcHR1cmVCbG9jazo0MDIyOGJjMC1kMWJlLTExZWMtYTc2MS00NzQ5NjFjNTgzODU']")
    private WebElement country;
    @FindBy(how = How.XPATH, using = "//input[@id='V2ViRm9ybUNhcHR1cmVCbG9jazo4OGMxZGU3MC1kMDg0LTExZWMtYTc2MS00NzQ5NjFjNTgzODU']")
    private WebElement interestedIn;
    @FindBy(how = How.XPATH, using = "//textarea[@name='V2ViRm9ybUNhcHR1cmVCbG9jazo5YmQ4N2UyMS1jYzk2LTExZWMtOTM5OC1kYmUwZjg2YjMzYTA']")
    private WebElement message;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement submit;


    public getInTouchFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void fillForm(GetInTouchForm f){
        Wait.wait10(name,driver);
        Wait.wait10(email,driver);
        Wait.wait10(phone,driver);
        Wait.wait10(country,driver);
        Wait.wait10(company,driver);
        Wait.wait10(website,driver);
        Wait.wait10(interestedIn,driver);
        Wait.wait10(message,driver);

        name.sendKeys(f.getName());
        email.sendKeys(f.getEmail());
        phone.sendKeys(f.getPhoneNumber());
        company.sendKeys(f.getCompany());
        website.sendKeys(f.getWebsite());
        country.click();
        WebElement choice = driver.findElement(By.xpath("//li[text()='"+f.getCountry()+"']"));
        choice.click();
        interestedIn.click();
        WebElement choice2 = driver.findElement(By.xpath("//li[text()='"+f.getInterestedIn()+"']"));
        choice2.click();
        message.sendKeys(f.getMessage());
//        Utils.jsClick(submit,driver);
    }
}
