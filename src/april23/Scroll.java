package april23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scroll {

    public static void main(String[] args) throws InterruptedException {
        https://artville.ua/

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();



        driver.get("https://artville.ua/");

        Thread.sleep(5000);



        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500);");

        System.out.println(driver.findElement(By.xpath("//h2[@class='about__desc-title section__desc-title']")).getText());

        js.executeScript("window.scrollBy(0,-500);");
    }
}
