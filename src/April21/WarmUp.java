package April21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WarmUp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Fatih"  );
        driver.findElement(By.id("lastName")).sendKeys("gundogdu");
        driver.findElement(By.id("userEmail")).sendKeys("Fatih@hotmail.com"  );
        driver.findElement(By.xpath("//label[@class= 'custom-control-label']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("userNumber")).sendKeys("2024578963"  );

        for (int i = 0; i < 10; i++) {
            driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.BACK_SPACE);

        }

        driver.findElement(By.id("dateOfBirthInput")).sendKeys("7 Apr 2020" + Keys.ENTER);
        driver.findElement(By.id("subjectsInput")).sendKeys("fatih assignment");
        driver.findElement(By.id("hobbies-checkbox-1")).sendKeys(Keys.SPACE);
        driver.findElement(By.id("currentAddress")).sendKeys("123 main st.arlington Va"  );

        driver.findElement(By.id("state")).click();
        driver.findElement(By.xpath("//div[.='NCR']")).click();
        driver.findElement(By.id("city")).click();
        driver.findElement(By.xpath("//div[.='Delhi']")).click();
//
        driver.findElement(By.id("submit")).click();

        WebElement closeLargeModal = driver.findElement(By.id("closeLargeModal"));
        if(closeLargeModal.isEnabled()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
