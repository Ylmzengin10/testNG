package tests.DAY15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class C05_QualitydemyLoginTesti {
    @Test
    public void test01(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin
        QualitydemyPage qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // login butonuna basin
        qualitydemyPage.loginButonu.sendKeys(Keys.ENTER);


        // basarili olarak giris yapildigini test edin

        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();
    }
}
