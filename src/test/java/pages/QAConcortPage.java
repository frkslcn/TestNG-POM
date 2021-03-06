package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class QAConcortPage {
  public WebDriver driver;
   public QAConcortPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        
    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id="UserName")
    public WebElement usernameKutusu;

    @FindBy(id="Password")
    public WebElement passwordKutusu;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy (xpath = "//*[.='Try again please']")
    public WebElement LoginFailedYazisi;

 @FindBy (xpath = "//span[text()='Hotel Management']")
 public WebElement hotelManagementLinki;

   @FindBy(partialLinkText = "Hotel Rooms")
   public WebElement hotelRoomsLinki;

   @FindBy(xpath = "//span[text()='Add Hotelroom ']")
   public WebElement addHotelRoomButonu;

   @FindBy(id="IDHotel")
   public WebElement addRoomIdDropdown;

   @FindBy(id ="IDGroupRoomType")
   public WebElement addRoomType;

   @FindBy(xpath="//thead/tr[1]/th")
   public List<WebElement> basliklarListesi;

   @FindBy(xpath = "//tbody")
   public WebElement tBodyTumu;

   @FindBy(xpath = "//tbody//tr")
   public List<WebElement> satirlarListesi;

   @FindBy(xpath = "//tbody//tr[1]")
   public WebElement birinciSatir;

   @FindBy(xpath = "//tbody//tr//td[4]")
   public List<WebElement> dorduncuSutunListesi;










    public void ConcortHotelLogin(){

     Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
     QAConcortPage qaConcortPage=new QAConcortPage();
     qaConcortPage.ilkLoginLinki.click();
     qaConcortPage.ilkLoginLinki.click();
     qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAvalidUsername"));
     qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
     qaConcortPage.loginButonu.click();




    }

}
