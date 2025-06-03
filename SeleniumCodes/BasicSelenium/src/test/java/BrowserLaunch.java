
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class BrowserLaunch {

    public static void main(String []args) throws IOException, InterruptedException {

        WebDriver driver;
        WebDriver driver1;

        /*driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");

        WebDriver driver2 = new EdgeDriver();

        driver.get("https://google.com");

        driver = new ChromeDriver();
        //System.out.println(driver.getPageSource());
        driver.get("http://www.google.com/");*/

       /* driver1= new ChromeDriver();

        driver1.manage().window().maximize();
        driver1.get("http://www.google.com/");*/

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
Thread.sleep(5);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File f=new File("C:\\Users\\Digambar Khodse\\Downloads\\image2.png");
        FileHandler.copy(src,f);

JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(5);

        Thread.sleep(5000);
Dimension d=new Dimension(200,800);
driver.manage().window().setSize(d);

        /*driver1 = new ChromeDriver();

        driver1.manage().window().maximize();
        driver1.get("http://www.google.com/");
        driver1.quit();
        driver.quit();*/
        }

    }

