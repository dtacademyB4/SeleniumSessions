package april19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class HandlingWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");

        System.out.println("We are at duotech.io. The title of the page is: " + driver.getTitle());

        driver.findElement(By.xpath("//a[.='Learn More']")).sendKeys(Keys.chord(Keys.LEFT_SHIFT, Keys.ENTER ));

        String windowHandleParent = driver.getWindowHandle();// gets the id for the current window
        System.out.println("The current window handle: " + windowHandleParent);
        Set<String> windowHandles = driver.getWindowHandles(); // returns the all open windows' handles

        System.out.println("All window handles: " + windowHandles.getClass());

        for (String windowHandle : windowHandles) {
            if(! windowHandle.equals(windowHandleParent)){
                driver.switchTo().window(windowHandle);
            }
        }

        System.out.println("The new pages title is: " + driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//h2[@class='about-side-header']")).getText());

        driver.switchTo().window(windowHandleParent);

        System.out.println(driver.getTitle());








    }
}
