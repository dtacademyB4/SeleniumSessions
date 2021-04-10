package April9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io/");

        // Click on Contacts link

        driver.findElement(By.linkText("Contacts")).click();
        // Verify the page title contains Contact Us
        System.out.println( driver.getTitle().contains("Contact Us") ? "PASS" : "FAIL");

        // Go to amazon.com
        // Locate the link with partial match "gift ideas"
        // Click

        driver.get("https://www.amazon.com/");


        try {
            driver.findElement(By.partialLinkText("gift ideas")).click();

            System.out.println(driver.getTitle().contains("Mother's Day") ? "PASS" : "FAIL");
        }catch (NoSuchElementException e){
            System.out.println("Element was not found");
        }

        driver.navigate().to("https://www.duotech.io/");


        System.out.println(driver.findElement(By.tagName("h1")).getText());

       WebElement h1Element =  driver.findElement(By.tagName("h1"));






    }
}
