package tests.day13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.TestBase;

public class C03_pages extends TestBase {

    @Test
    public void test(){
        //amazon git----book kateg.sec----java iicin arama yap---bulunan sonuc sayisini yazdir---ilk urunun java yazdigini test edin
        driver.get("https://www.amazon.com");

        AmazonPages amazonPages = new AmazonPages(driver);
        Select select = new Select(amazonPages.dropdownMenu);

        select.selectByVisibleText("Books");

        amazonPages.aramaKuutusu.sendKeys("java"+ Keys.ENTER);

        System.out.println(amazonPages.sonucYazisiElementi.getText());
    }


}
