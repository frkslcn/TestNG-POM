package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
    //driver i baska classlardan sadece Driver class ismi ile cagirabilmek icin Static yaptik.


      public static WebDriver getDriver(){

          if (driver==null){
              //buraya yazdigimiz if in nedeni her calistiginda yeni bir driver olusturmamasi icin
              //if driver i kontrol edecek, eger bir deger atamsi yapildiysa yenibir driver olusturmayacak.
              switch (ConfigReader.getProperty("browser")) {
                  //case i driver i istedigimiz browserda calistirmak icin kullaniyoruz
                  //
                  case "chrome":
                      WebDriverManager.chromedriver().setup();
                      driver = new ChromeDriver();
                      break;
                  case "firefox":
                      WebDriverManager.firefoxdriver().setup();
                      driver = new FirefoxDriver();
                      break;
                  case "opera":
                      WebDriverManager.chromedriver().setup();
                      driver = new ChromeDriver();
                      break;
                  case "edge":
                      WebDriverManager.edgedriver().setup();
                      driver = new EdgeDriver();
                      break;
                  default:
                      WebDriverManager.chromedriver().setup();
                      driver = new ChromeDriver();

              }




              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
          }

          return driver;
      }

    public static void closeDriver(){

          if (driver!=null){
              driver.quit();
          }
    //burada yeniden null degeri atamamizin sebebi bir sonraki get driver method u cagirisimizda yeni deger atayabilmek istememizdir
        driver=null;
    }


}
