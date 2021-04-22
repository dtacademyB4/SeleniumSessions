package April21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonPageDynamicAds {

    public static void main(String[] args) {


        // How to handle dynamic ads in Amazon homepage?
        // How do you verify that specific ad about prime video is there?

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement PrimeAd = driver.findElement(By.xpath("//img[@alt='So much to watch included with Prime. Prime members get Prime Video.']"));

//        while(!PrimeAd.isDisplayed()){ // if the element is not displayed, infinite loop
//
//        }

        // Explicit wait creation:
        // 1. Create WebDriverWait object by passing webdriver instance and timeout to the constructor
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //2. Specify the Condition of the wait
           wait.until(ExpectedConditions.visibilityOf(PrimeAd));





        if(PrimeAd.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
