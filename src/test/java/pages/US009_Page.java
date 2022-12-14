package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US009_Page {
   public US009_Page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath ="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginDropDown;

   @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInText;

   @FindBy(xpath ="//*[@id='username']")
    public WebElement usernameBox;

   @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

   @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signInButton;

   @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesDropDown;

   @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
    public WebElement searchPatientText;

   @FindBy(xpath = "//*[@class='form-control']")
    public WebElement ssnBox;

   @FindBy(xpath = "//table/tbody/tr/td")
    public List<WebElement> hastaBilgileri;

   @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement editButton;

   @FindBy(xpath = "//*[@name='id']")
    public WebElement idBox;

   @FindBy(xpath ="//*[@name='firstName']" )
    public WebElement firstNameBox;
    @FindBy(xpath ="//*[@name='firstName']" )
    public List<WebElement> firstNameBoxList;

    @FindBy(xpath ="//*[@name='lastName']" )
    public WebElement lastNameBox;

    @FindBy(xpath ="//*[@name='birthDate']" )
    public WebElement birthDateBox;

    @FindBy(xpath ="//*[@name='email']" )
    public WebElement emailBox;

    @FindBy(xpath ="//*[@name='phone']" )
    public WebElement phoneBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath ="//*[@name='adress']" )
    public WebElement adressBox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionTextarea;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userDropDown;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement stateCityDropDown;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-save fa-w-14 ']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement backButton;
    @FindBy(xpath = "(//table/tbody/tr)[1]/td")
    public List<WebElement> guncelHastaBilgileri;

    @FindBy(xpath = "//*[text()='Created Date']")
    public WebElement createDate;





















}
