package tests.practıce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P02 {

    /*
- Birbirine bağımlı testler oluşturun.
- beforeClass oluşturup setUp ayarlarini yapin.
- Birbirine bağımlı testler oluşturarak
- ilk once wisequarte'a gidin
- sonra youtube'a bağımlı olarak google'a gidin
- daha sonra amazon'a bağımlı olarak amazon' a gidin
- driver'i kapatın.
 */

   /*
    - Birbirine bağımlı testler oluşturun.
    - beforeClass oluşturup setUp ayarlarini yapin.
    - Birbirine bağımlı testler oluşturarak
    - ilk once wisequarte'a gidin
    - sonra wisequarter'a bağımlı olarak youtube'a gidin
    - daha sonra youtube'a bağımlı olarak amazon' a gidin
    - driver'i kapatın.
     */
    //- beforeClass oluşturup setUp ayarlarini yapin.
    static WebDriver driver;

        /*@BeforeClass
        public static void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

         */

    //önce wisequarter sitesine gidelim
    @Test
    public void wisequarter(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }

    @Test (dependsOnMethods = "wisequarter")
    public void youtube(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
    }
    @Test (dependsOnMethods = "youtube")
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
    }
}
