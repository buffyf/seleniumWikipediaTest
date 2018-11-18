import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public static void submitForm(WebDriver driver)
    {
        driver.findElement(By.id("searchInput")).sendKeys("Trunk Club");

        driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click();
    }
}

