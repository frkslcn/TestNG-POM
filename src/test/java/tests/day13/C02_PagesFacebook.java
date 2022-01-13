package tests.day13;

import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFacebook extends TestBase {
     @Test
    public void test() throws InterruptedException {
         //facebook login sayfasina gidin
         driver.get("https://www.facebook.com");
         FacebookPage facebookPage=new FacebookPage(driver);
         facebookPage.cookiesgec();
         Thread.sleep(2000);

         //kullanici adi:techproed
         facebookPage.mailKutusu.sendKeys("techproed@hotmail.com");
         //sifre : 12345
         facebookPage.sifreKutusu.sendKeys("12345");
         facebookPage.loginTusu.click();
         //yazdigimizzda giris yapmadigimizi test edin

         //page sayfasinda cookiesGec() method u olusturun




     }





}
