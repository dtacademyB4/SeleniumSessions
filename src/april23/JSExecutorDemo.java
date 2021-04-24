package april23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JSExecutorDemo {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();



        driver.get("https://demoqa.com/automation-practice-form");

        WebElement check = driver.findElement(By.id("hobbies-checkbox-1"));

//        driver.findElement(By.id("hobbies-checkbox-1")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;  //Cast driver to JSExecutor and assign it to JS Executor reference

        js.executeScript("arguments[0].click();", check);// clicking an element that was not clickable otherwise

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");



        js.executeScript("document.getElementById('ctl00_MainContent_username').value='Tester';");
        js.executeScript("document.getElementById('ctl00_MainContent_password').value='test';");

        js.executeScript("arguments[0].click();", driver.findElement(By.id("ctl00_MainContent_login_button")));


        driver.get("https://www.duotech.io/");


        WebElement element = driver.findElement(By.xpath("//a[contains( text(), 'Software QA')]"));
        System.out.println( element.isDisplayed());

        // To click on a hidden link that appears only when you hover over with a mouse.
        js.executeScript("arguments[0].click();", element);



    }
}
