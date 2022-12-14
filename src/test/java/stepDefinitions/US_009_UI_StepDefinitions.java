package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US009_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_009_UI_StepDefinitions {
    US009_Page us009_page=new US009_Page();
    @Given("HH Personel {string} e gider")
    public void hhPersonelEGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @And("HH Personel sayfanin sag ust  kosesindeki drop down a tiklar")
    public void hhPersonelSayfaninSagUstKosesindekiDropDownATiklar() {
        us009_page.girisDropDown.click();
    }

    @And("HH Personel Sing in segmesine tiklar")
    public void hhPersonelSingInSegmesineTiklar() {
        us009_page.signInText.click();
    }

    @And("HH Personel  Username box a gecerli {string}  girer")
    public void hhPersonelUsernameBoxAGecerliGirer(String username) {
        us009_page.usernameBox.sendKeys(ConfigReader.getProperty(username));
    }

    @And("HH Personel Password box a gecerli {string} girer")
    public void hhPersonelPasswordBoxAGecerliGirer(String password) {
        us009_page.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }

    @And("HH Personel  giris yapmak uzere Sign in butonuna  tiklar")
    public void hhPersonelGirisYapmakUzereSignInButonunaTiklar() {

        us009_page.signInButton.click();
    }

    @And("HH Personel MY PAGES sekmesine tiklar")
    public void hhPersonelMYPAGESSekmesineTiklar() {
        us009_page.myPagesDropDown.click();
    }

    @And("HH Personel Search Patient sekmesine tiklar")
    public void hhPersonelSearchPatientSekmesineTiklar() {
        us009_page.searchPatientText.click();
    }

    @And("HH Personel Patient SSN box a hasta SSN'ini girer")
    public void hhPersonelPatientSSNBoxAHastaSSNIniGirer() {
        us009_page.ssnBox.sendKeys("547-12-1454");
    }

    @Then("HH Gidilen sayfada hasta bilgilerinin gorunur oldugunu dogrular")
    public void hhGidilenSayfadaHastaBilgilerininGorunurOldugunuDogrular() {
        //List<WebElement> patientList=Driver.getDriver().findElements(By.xpath("//tbody/tr/td"));
       // patientList.stream().map(WebElement::getText).forEach(System.out::println);

    }

    @When("HH Kullanici cookies i siler")
    public void hhKullaniciCookiesISiler() {
        //Driver.getDriver().manage().deleteAllCookies();
    }

    @And("HH Kullanci browser i kapatir")
    public void hhKullanciBrowserIKapatir() {
        Driver.closeDriver();
    }


    @Given("HH Personel url e gider")
    public void hhPersonelUrlEGider() {
        Driver.getDriver().get("https://www.medunna.com/");
    }
}
