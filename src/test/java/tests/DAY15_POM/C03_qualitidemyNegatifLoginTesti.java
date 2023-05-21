package tests.DAY15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_qualitidemyNegatifLoginTesti {

        @Test
        public void test01(){
            // qualitydemy anasayfaya gidin
            Driver.getDriver().get("https://www.qualitydemy.com");
            // ilk login linkine tiklayin
            QualitydemyPage qualitydemyPage = new QualitydemyPage();
            qualitydemyPage.loginButonu.submit();
            // kullanici adi olarak selenium
            qualitydemyPage.emailKutusu.sendKeys("selenium");
            // password olarak heyecandir yazin
            qualitydemyPage.passwordKutusu.sendKeys("heyecandir");
            // login butonuna tiklayin
            qualitydemyPage.loginButonu.sendKeys("ENTER");
            // giris yapilamadigini test edin
            Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
            // sayfayi kapatin
            Driver.closeDriver();
        }

    }

