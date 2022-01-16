package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C05_NegativeTestConfigReader extends TestBase {
    @Test
    public void test(){
        //1 ) Bir Class olustur : NegativeTest
        //2) Bir test method olustur NegativeLoginTest()
        //http://qa-environment.koalaresorthotels.com adresine git
        driver.get(ConfigReader.getProperty("CHurl"));

        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        //login butonuna bas
        concortHotelPage.ilkLoginLinki.click();
        //test data username: manager1 ,
        concortHotelPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHInvalidUsername"));
        //test data password : manager1!
        concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHInvalidPassword"));
        concortHotelPage.loginButonu.click();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(concortHotelPage.LoginFailedYazisi.isDisplayed());





    }


}
