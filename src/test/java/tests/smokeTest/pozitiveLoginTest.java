package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class pozitiveLoginTest {
    @Test
    public void test(){
        //1) com.techproed altinda bir package olustur : smoketest
        //2) Bir Class olustur : PositiveTest
        //3) Bir test method olustur positiveLoginTest()
        //http://qa-environment.concorthotel.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

        QAConcortPage qaConcortPage=new QAConcortPage();
        //login butonuna bas
        qaConcortPage.ilkLoginLinki.click();
        //test data username: manager ,
        qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAvalidUsername"));
        //test data password : Manager1!
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        qaConcortPage.loginButonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(qaConcortPage.basariliGirisYaziElementi.isDisplayed());
        Driver.closeDriver();

    }

}
