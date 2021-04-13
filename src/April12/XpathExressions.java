package April12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathExressions {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io/");

        List<WebElement> elements = driver.findElements(By.xpath("//*[@href]"));// find all elements with href attribute

        for (WebElement el:
             elements) {
            System.out.println(el.getAttribute("href"));
        }

//        driver.findElement(By.xpath("//a[@href='/enroll-sqae']")).click(); // using unique href attribute

        driver.findElement(By.xpath("//a[@href='/enroll-sqae'][@class='button-2 w-button']")).click(); // using unique href attribute


        System.out.println(driver.findElement(By.xpath("//h1[.='Spring 2021']")).getText());
        // element that has a text Spring 2021


        // xpath  for locating an h1 element that contains "Enrollment"
           //h1[contains( text(), 'Enrollment'  )]

        System.out.println(driver.findElement(By.xpath("//h1[contains( text(), 'Enrollment'  )]")).getText());


        driver.get("https://www.duotech.io/faq");

        // Using predicate to locate an element (xpath expression)[2] -> second element out of many

       //     (//a[@href='#']//h5)[2]

        System.out.println(driver.findElement(By.xpath("(//a[@href='#']//h5)[2]")).getText());





    }
}
