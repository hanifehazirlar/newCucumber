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
   @FindBy(xpath ="//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisDropDown;

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

   @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnBox;

   @FindBy(xpath = "//tbody/tr/td")
    public List<WebElement> hastaBilgileri;




}
