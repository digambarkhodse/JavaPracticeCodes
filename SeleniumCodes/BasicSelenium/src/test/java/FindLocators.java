import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FindLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the MakeMyTrip website
            driver.get("https://www.makemytrip.com/");
            driver.manage().window().maximize();
            Thread.sleep(4000);
            WebElement fromInput = driver.findElement(By.id("fromCity"));
            fromInput.click();
            WebElement fromTextInput = driver.findElement(By.xpath("//input[@placeholder='From']"));
            fromTextInput.sendKeys("Mumbai");
            Thread.sleep(2000); // Wait for suggestions to appear
            fromTextInput.sendKeys(Keys.ENTER);
            WebElement toInput = driver.findElement(By.id("toCity"));
            toInput.click();
            WebElement toTextInput = driver.findElement(By.xpath("//input[@placeholder='To']"));
            toTextInput.sendKeys("Delhi");
            Thread.sleep(2000); // Wait for suggestions to appear
            toTextInput.sendKeys(Keys.ENTER);

            // Click on the departure date field
            WebElement departureDate = driver.findElement(By.cssSelector("label[for='departure']"));
            departureDate.click();

            // Select a specific date, e.g., 15th of next month
            WebElement dateSelector = driver.findElement(By.cssSelector("div.DayPicker-Day[aria-label='Thu Nov 15 2024']"));
            dateSelector.click();

            // Pause to allow time for results to load
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
