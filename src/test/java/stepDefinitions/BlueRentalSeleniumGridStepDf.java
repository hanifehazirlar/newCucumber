package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BlueRentalSeleniumGridStepDf {
    WebDriver driver;
    @Given("user is on the application_url {string}")
    public void userIsOnTheApplication_url(String url) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.1.104:4444"),new ChromeOptions());
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String title) {
        assertEquals("Title' lar eslesmedi",title,driver.getTitle());
    }

    @Then("close the remote driver")
    public void closeTheRemoteDriver() {
        driver.quit();
    }

    @Given("user is on the application_url with Edge {string}")
    public void userIsOnTheApplication_urlWithEdge(String url) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.1.104:4444"),new EdgeOptions());
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }
}
