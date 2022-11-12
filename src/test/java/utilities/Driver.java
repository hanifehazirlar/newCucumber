package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver(){
        // SingletonPattern : tekli kullanim demektir. Bir class'in farkli class'lardan
        // obje olusturarak kullanimini engellemektir bu sebeple default constractor yerine
        // private Driver() constractori ekledik
    }
    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {//driver'a deger atanmissa
            driver.close();
            driver = null;//kapandiktan sonra tekrar kullanabilmek, riske atmamak icin tekrar null yaptik
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
 /*
          Testleri calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu icin yeni
          bir pencere (driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
          bir kere driver'i calistir diyerek bir kere if icini calistiracak ve driver artik bir kere
          calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz
          ayni pencerede (driver) uzerinde calisacak
        */
// POM'de Driver icin TestBase class'ina extends etmek yerine
//Driver class'indan static method'lar kullanarak driver olusturup,
//ilgili ayarlarin yapilmasi ve en sonda driver'in kapatilmasi tercih edilmistir.
//POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini engellemek icin
//Singleton pattern kullanimi benimsenmistir.

//Singleton Pattern -> tekli kullanim, bir class'in farkli class'lardan
// obje olusturularak kullanimini engellemek icin kullanilir.
// Bunu saglamak icin yapmamiz gereken sey oldukca basit
// obje olusturmak icin kullanilan constructor'i private yaptiginizda
// baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ

// POM'da artik inheritance yerine object ve static kullanarak methodlara ulasiyoruz
// page classina objeyle driver classina static ile ulasiriz
