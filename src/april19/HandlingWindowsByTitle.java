package april19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingWindowsByTitle {
  static  WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");

        System.out.println("We are at duotech.io. The title of the page is: " + driver.getTitle());

        driver.findElement(By.xpath("//a[.='Learn More']")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER ));

        //On the second window

        switchByTitle("Software QA Engineer");


        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[.='Learn More']")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER ));

        switchByTitle("Software Tester - introduction, responsibilities and how to become one.");




        driver.findElement(By.xpath("//a[.='Enroll Now']")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER ));

        switchByTitle("Duotech Academy SQAE enrollment form");

        System.out.println(driver.getTitle());

        switchByTitle("Duotech Academy | QA Automation Engineer | Business Systems Analyst");

        System.out.println(driver.getTitle());













    }

    public static void switchByTitle(String title){

        for (String windowHandle :  driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }
}
