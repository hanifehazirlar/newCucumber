package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US009_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_009_UI_StepDefinition {
    US009_Page us009_page=new US009_Page();
    Faker faker=new Faker();
    Random random=new Random();
    @Given("HH Personel {string} e gider")
    public void hhPersonelEGider(String arananUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @And("HH Personel sayfanin sag ust  kosesindeki drop down a tiklar")
    public void hhPersonelSayfaninSagUstKosesindekiDropDownATiklar() {
        us009_page.loginDropDown.click();
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
        ReusableMethods.waitFor(3);
        us009_page.myPagesDropDown.click();
    }

    @And("HH Personel Search Patient sekmesine tiklar")

    public void hhPersonelSearchPatientSekmesineTiklar() {
        ReusableMethods.waitFor(3);
        us009_page.searchPatientText.click();

    }


    @Then("HH Gidilen sayfada hasta bilgilerinin gorunur oldugunu dogrular")
    public void hhGidilenSayfadaHastaBilgilerininGorunurOldugunuDogrular() {
       List<WebElement> patientsWE=us009_page.hastaBilgileri;
        for (WebElement w:patientsWE ) {
            assertTrue(w.isDisplayed());
        }

    }

    @Then("HH Personel hastanin Edit buttonuna tiklar")
    public void hhPersonelHastaninEditButtonunaTiklar() {
        us009_page.editButton.click();
    }
    String id;
    @And("HH Personel ID yi duzenler")
    public void hhPersonelIDYiDuzenler() {
        id=faker.idNumber().valid();
        us009_page.idBox.sendKeys(id);
        Driver.getDriver().navigate().refresh();

    }
    String firstname;
    @And("HH Personel  FirstName i duzenler")
    public void hhPersonelFirstNameIDuzenler() {
        Driver.getDriver().navigate().refresh();
       firstname=faker.name().firstName();
       us009_page.firstNameBox.clear();
        us009_page.firstNameBox.sendKeys(firstname);
    }
    String lastname;
    @And("HH Personel LastName i duzenler")
    public void hhPersonelLastNameIDuzenler() {
        lastname=faker.name().lastName();
        us009_page.lastNameBox.clear();
        us009_page.lastNameBox.sendKeys(lastname);
    }

    @And("HH Personel Birth Date i duzenler")
    public void hhPersonelBirtDateIDuzenler() {

       us009_page.birthDateBox.sendKeys("09.09.2005",Keys.ARROW_RIGHT,"10:30");
    }
    @And("HH Personel Email i duzenler")
    public void hhPersonelEmailIDuzenler() {

        us009_page.emailBox.clear();
        us009_page.emailBox.sendKeys("ayse1234@gmail.com");
    }

    @And("HH Personel Phone u duzenler")
    public void hhPersonelPhoneUDuzenler() {
      us009_page.phoneBox.clear();
      us009_page.phoneBox.sendKeys("2345662332");
    }
    @And("HH Personel Gender i duzenler")
    public void hhPersonelGenderIDuzenler() {
        Select select=new Select(us009_page.genderDropDown);
        List<WebElement> genderList=select.getOptions();
        select.selectByValue("FEMALE");
    }

    @And("HH Personel Blood Group u duzenler")
    public void hhPersonelBloodGroupUDuzenler() {
        Select select=new Select(us009_page.bloodGroupDropDown);
        List<WebElement> bloodGroupList=select.getOptions();
        select.selectByIndex(3);

    }
    String address;
    @And("HH Personel Address i duzenler")
    public void hhPersonelAddressIDuzenler() {
        address=faker.address().fullAddress();
        us009_page.adressBox.clear();
        us009_page.adressBox.sendKeys(address);
    }
    String description;
    @And("HH Personel Description i duzenler")
    public void hhPersonelDescriptionIDuzenler() {
        description=faker.book().title();
        us009_page.descriptionTextarea.clear();
        us009_page.descriptionTextarea.sendKeys(description);
    }
    @And("HH Personel User i duzenler")
    public void hhPersonelUserIDuzenler() {
        Select select=new Select(us009_page.userDropDown);
        List<WebElement> userList=select.getOptions();
        //select.selectByIndex(16);
    }
    @And("HH Personel Country i duzenler")
    public void hhPersonelCountryIDuzenler() {
        Select select=new Select(us009_page.countryDropDown);
        List<WebElement> countryList=select.getOptions();
       // ReusableMethods.waitFor(5);
         //   select.selectByValue("Turkiyem");
        //ReusableMethods.waitFor(3);
    }
    @And("HH Personel State-City i duzenler")
    public void hhPersonelStateCityIDuzenler() {
        //Select select=new Select(us009_page.stateCityDropDown);
        //List<WebElement> cityList=select.getOptions();
        //ReusableMethods.waitFor(5);
       // select.selectByValue("Adana");
    }
    @And("HH Personel save buttonuna basar")
    public void hhPersonelSaveButtonunaBasar() {
        ReusableMethods.waitFor(5);
        us009_page.saveButton.click();
        ReusableMethods.waitFor(5);
    }

    @And("HH Personel yaptigi degisiklikleri dogrular")
    public void hhPersonelYaptigiDegisiklikleriDogrular() {
        ReusableMethods.waitFor(5);
        List<WebElement> guncelHastaBilgileri=us009_page.guncelHastaBilgileri;
        List<String> guncelHastaString=new ArrayList<>();
        for (WebElement w:guncelHastaBilgileri) {
            guncelHastaString.add(w.getText());
        }
        Assert.assertNotEquals(id,guncelHastaString.get(0));
        Assert.assertEquals(firstname,guncelHastaString.get(2));
        Assert.assertEquals(lastname,guncelHastaString.get(3));
        Assert.assertEquals("09/09/05 10:30",guncelHastaString.get(4));
        Assert.assertEquals("2345662332",guncelHastaString.get(5));
        Assert.assertEquals("ayse1234@gmail.com",guncelHastaString.get(6));
        Assert.assertEquals("FEMALE",guncelHastaString.get(7));
        Assert.assertEquals("B-",guncelHastaString.get(8));
        Assert.assertEquals(address,guncelHastaString.get(9));
        Assert.assertEquals(description,guncelHastaString.get(10));
        Assert.assertEquals("team9",guncelHastaString.get(12));
        Assert.assertEquals("Turkiyem",guncelHastaString.get(13));
        //Assert.assertNotEquals("Adana",guncelHastaString.get(14));

    }


    @And("HH Personel sayfayi kapatir")
    public void hhPersonelSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("HH Personel Patient SSN box a tiklar ve hasta SSN I girer")
    public void hhPersonelPatientSSNBoxATiklarVeHastaSSNIGirer() {
        ReusableMethods.waitFor(5);
        us009_page.ssnBox.sendKeys("802-15-6704");
        ReusableMethods.waitFor(5);
    }

    @And("HH Personel hasta bilgilerinin dolduruldugunu dogrular")
    public void hhPersonelHastaBilgilerininDolduruldugunuDogrular() {
        List<WebElement> guncelHastaBilgileri=us009_page.hastaBilgileri;

        for (WebElement w:guncelHastaBilgileri) {
            assertTrue(w.isDisplayed());
        }
    }

    @And("HH Personel hasta bilgilerini siler")
    public void hhPersonelHastaBilgileriniSiler() {
         Driver.getDriver().navigate().refresh();
        us009_page.birthDateBox.clear();
        us009_page.descriptionTextarea.clear();

    }

    @And("HH Personel hastabilgilerini sildigini dogrular")
    public void hhPersonelHastabilgileriniSildiginiDogrular() {
        ReusableMethods.waitFor(5);
        List<WebElement> guncelHastaBilgileri=us009_page.guncelHastaBilgileri;
        List<String> guncelHastaString=new ArrayList<>();
         for (WebElement w:guncelHastaBilgileri) {
           guncelHastaString.add(w.getText());
          }
        assertEquals("BirdDate silinemedi","",guncelHastaString.get(4));
        assertEquals("Description silinemedi","",guncelHastaString.get(10));

    }

    @And("HH Personel Patient SSN box a tiklar ve hasta {string} girer")
    public void hhPersonelPatientSSNBoxATiklarVeHastaGirer(String SSN) {
        ReusableMethods.waitFor(5);
        us009_page.ssnBox.sendKeys(SSN);
        ReusableMethods.waitFor(5);
    }

    @And("HH Personel back tusuna basar")
    public void hhPersonelBackTusunaBasar() {
        ReusableMethods.waitFor(5);
        us009_page.backButton.click();
    }
}
