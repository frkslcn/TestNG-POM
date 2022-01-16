package tests.day14;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.TestBase;

public class C04_AmazonConfigReader extends TestBase {

    @Test
    public void test(){
//amazo----nutella ara----sonuc yazisini yazdirin---sonuc yazisinin nutella icerdigini test edin
     driver.get(ConfigReader.getProperty("amazonUrl"));

        AmazonPages amazonPages=new AmazonPages(driver);
     //nutella ara
        amazonPages.aramaKuutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime")+ Keys.ENTER);
     //sonuc yazisini yazdirin---sonuc yazisinin nutella icerdigini test edin
        System.out.println(amazonPages.sonucYazisiElementi.getText());
        Assert.assertTrue(amazonPages.sonucYazisiElementi.getText().contains(ConfigReader.getProperty("amazonArananKelime")));



    }
}
