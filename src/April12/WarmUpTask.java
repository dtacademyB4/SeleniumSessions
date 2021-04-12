package April12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask {


    public static void main(String[] args) {
        // Go to http://demo.guru99.com/test/newtours/register.php
        // Fill up the form using  various locator strategies
        // Click on Submit
        // Verify the title is Register: Mercury Tours
        // Verify that full name matches the information that you entered previously

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(" http://demo.guru99.com/test/newtours/register.php");

        String first = "Fuad";
        String last = "Samadov";
        driver.findElement(By. name("firstName")).sendKeys( first ) ;
        driver.findElement(By. name("lastName")).sendKeys(last) ;
        driver.findElement(By. name("phone")).sendKeys("202 458 12 36" ) ;
        driver.findElement(By. id("userName")).sendKeys("Fatih520@hotmail.com" ) ;
        driver.findElement(By. name("address1")).sendKeys("123 main street " ) ;
        driver.findElement(By. name("city")).sendKeys("Arlington" ) ;
        driver.findElement(By. name("state")).sendKeys("VA" ) ;
        driver.findElement(By. name("postalCode")).sendKeys("52200" ) ;
        driver.findElement(By. name("email")).sendKeys("Fatih520@hotmail.com" ) ;
        driver.findElement(By. name("password")).sendKeys("123" ) ;
        driver.findElement(By. name("confirmPassword")).sendKeys("123" ) ;
        driver.findElement(By. name("submit")).click();

        if(driver.getTitle().equals("Register: Mercury Tours")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        String str = driver.findElement(By.xpath("//tr//b")).getText();

        String actualName =  str.substring(str.indexOf(first), str.length()-1);
        String expectedName = first + " " + last;

        if(actualName.equals(expectedName)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL. Actual name: " + actualName + ". Expected name: " + expectedName );
        }









    }

}
