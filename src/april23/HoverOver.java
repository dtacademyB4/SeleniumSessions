package april23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HoverOver {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();



        driver.get("https://www.duotech.io/");
        WebElement element = driver.findElement(By.xpath("//a[contains( text(), 'Software QA')]"));
        System.out.println( element.isDisplayed());

        WebElement element1 = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-2']//div[.='Programs']"));
        new Actions(driver).moveToElement(element1).build().perform();


        element.click();
    }
}
