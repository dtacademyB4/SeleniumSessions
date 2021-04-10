package April9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMechanisms {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

//        WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));
//        inputBox.sendKeys("cocktail dress" + Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cocktail dress" + Keys.ENTER);

         Thread.sleep(1000);  //waits for 5 secs
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("high heel shoes" + Keys.ENTER);

        Thread.sleep(1000);  //waits for 5 secs
        driver.get("https://www.duotech.io/");

        String expectedText = "Start your new IT career";

        String actualText = driver.findElement(By.className("black-text")).getText();

        if(expectedText.equals(actualText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL: actual text is: " + actualText);
        }

        System.out.println(driver.findElement(By.className("link-4")).getText());


        // linkText and partialLinkText




    }
}
