import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org");

        LandingPage landingPage = new LandingPage();
        landingPage.submitForm(driver);

        SearchResultsPage searchResultsPage= new SearchResultsPage();
        searchResultsPage.waitForSearchResults(driver);


        assertEquals("Trunk Club",
                searchResultsPage.getSearchResults(driver));

        driver.quit();
    }

}
