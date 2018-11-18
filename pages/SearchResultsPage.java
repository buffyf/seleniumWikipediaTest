import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {

    public static void waitForSearchResults(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading"))));
    }

    public static String getSearchResults(WebDriver driver)
    {
        return driver.findElement(By.id("firstHeading")).getText();
    }
}

