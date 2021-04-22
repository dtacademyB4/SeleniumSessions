package April21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AmazonWindowsHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        driver.findElement(By.linkText("Amazon Home")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER));

        // Verify that the new page contains text "The New Home Essentials"

        // How to switch to other window in Selenium?



        System.out.println( driver.getTitle());

        String current = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(current)){
                driver.switchTo().window(windowHandle);
            }
        }
        System.out.println( driver.getTitle());

        if(driver.getPageSource().contains("The New Home Essentials")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }








    }
}
