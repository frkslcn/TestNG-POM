package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class negativeTest {
    //1) smokeTest paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //- yanlisSifre
    //- yanlisKulllanici
    //- yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1!
    //2) http://qa-environment.concorthotel.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    QAConcortPage qaConcortPage;
    @Test(priority = -5)
    public void yanlisSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        qaConcortPage.ilkLoginLinki.click();
        qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAvalidUsername"));
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHInvalidPassword"));
        qaConcortPage.loginButonu.click();
        Assert.assertTrue(qaConcortPage.LoginFailedYazisi.isDisplayed());

    }
    @Test(dependsOnMethods = "yanlisSifre")
    public void yanlisKullanici(){
        qaConcortPage=new QAConcortPage();
        qaConcortPage.usernameKutusu.clear();
        qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHInvalidUsername"));
        qaConcortPage.passwordKutusu.clear();
        qaConcortPage.loginButonu.click();
        Assert.assertTrue(qaConcortPage.LoginFailedYazisi.isDisplayed());

        Driver.closeDriver();
    }


}
