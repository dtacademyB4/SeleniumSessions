package April14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggesttiveDropdowns {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hotels.com/");
        driver.manage().deleteAllCookies();
         driver.findElement(By.xpath("//button[@class='_1yFrqc']")).click();
         Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='_3E17b1']")).sendKeys("Ibiza" );

         // ElementNotInteractableException: element not interactable
        // span is not intearctable using sendKeys() method


    }
}
