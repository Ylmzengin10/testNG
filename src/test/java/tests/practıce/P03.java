package tests.practıce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Saucedemopage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03 {
    /*
Kullanıcı adını standart_kullanıcı olarak girin
Parolayı secret_sauce olarak girin
Giriş düğmesine tıklayın
Test 1: Düşükten yükseğe doğru fiyat seçin
Test 2: Ürün fiyatlarının yumuşak Assert ile düşükten yükseğe doğru sıralandığını doğrulayın
 */
    /*
Navigate to https://www.saucedemo.com/
Enter the username as standard_user
Enter the password as secret_sauce
Click on login button
Test 1: Choose price Iow to high
Test 2:Verify item prices are sorted from Iow to high with soft Assert

 */



    @Test
        public void suceDemo01(){
            Driver.getDriver().get(ConfigReader.getProperty("sauceDemoUrl"));
            Driver.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");

            Saucedemopage saucedemopage=new Saucedemopage();
            saucedemopage.sifre.sendKeys("secret_sauce");

            saucedemopage.loginbutton.click();
            Select select=new Select(saucedemopage.dropdown);

            select.selectByVisibleText("Price (low to high)");
        }

        @Test
        public void sauceDemo02(){

        }





    }

