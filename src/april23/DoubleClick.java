package april23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DoubleClick {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();



        driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");

        driver.switchTo().frame("frame_Examples");

        Actions action = new Actions(driver);
        WebElement aside = driver.findElement(By.tagName("aside"));
       // action.click(aside).click(aside).build().perform();
        action.doubleClick(aside).build().perform();



    }
}
