package april23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyboardActions {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();



        driver.get("https://www.google.com/");
        // Every aaction using Actions class must end with build().perform();
        Actions action = new Actions(driver);
        WebElement inputbox = driver.findElement(By.name("q"));
        action.keyDown(Keys.LEFT_SHIFT).sendKeys(inputbox, "caps lock").keyUp(Keys.LEFT_SHIFT).build().perform();
        action.sendKeys(inputbox, " helloo").build().perform();

        WebElement gmail = driver.findElement(By.linkText("Gmail"));

        action.keyDown(Keys.LEFT_CONTROL).click(gmail).keyUp(Keys.LEFT_CONTROL).build().perform();


    }
}
