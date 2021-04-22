package april19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[.='Enable']")).click();


        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = driver.findElement(By.xpath(" //input[@type='text']"));

        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.sendKeys("hola como estas?");

   //     TimeoutException: Expected condition failed: waiting for element to be clickable:

     //   ElementNotInteractableException: element not interactable


        // FluentWait Example

        driver.findElement(By.xpath("//button[.='Remove']")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        driver.findElement(By.xpath("//button[.='Add']")).click();

        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

       new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='checkbox']")));

        driver.findElement(By.xpath("//input[@id='checkbox']")).click();





    }
}
