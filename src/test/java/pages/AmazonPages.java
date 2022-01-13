package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {

    WebDriver driver;
    //bir page sayfasi olusturuldugunda mutlaka yapmamiz gereken sey
    //bir constructor olusturup driver a ilk degeri atamaktir(instantiate)
    public AmazonPages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
      public AmazonPages(){

      }


    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKuutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

    @FindBy(id = "searchDropdownBox" )
    public WebElement dropdownMenu;

}
