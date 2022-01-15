package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C02_CHNegativeTest extends TestBase {
    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //http://qa-environment.koalaresorthotels.com adresine git
    @Test
    public void test(){
        driver.get("https://www.concorthotel.com");
        //login butonuna bas
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.ilkLoginLinki.click();
        //test data username: manager1 ,
        concortHotelPage.usernameKutusu.sendKeys("manager1");
        //test data password : manager1!
        concortHotelPage.passwordKutusu.sendKeys("manager1!");
        concortHotelPage.loginButonu.click();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(concortHotelPage.LoginFailedYazisi.isDisplayed());



    }



}
