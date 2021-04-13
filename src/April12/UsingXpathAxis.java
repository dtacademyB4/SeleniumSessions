package April12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathAxis {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io/software-qa-engineer");

        System.out.println(driver.findElement(By.xpath("//div[@data-w-id='1a9a10ab-9099-0692-389c-e8ef87d67598']//h6")).getText());
        // Locating a unique parent and navigate to non unique element





        System.out.println( driver.findElement(By.xpath("//h6[.='Navigation']/parent::div")).getText());
        // Locate a non unique parent by first locating its unique child and navigate back to its parent
        //h6[.='Navigation']/parent::div -> find the h6 with text Navigation and navigate to its parent called div



        System.out.println( driver.findElement(By.xpath("//h6[.='The Program']/following-sibling::p")).getText());
        // Locate a non unique sibling by fisrt locating a unique sibling and navigating to its following sibling
        //h6[.='The Program']/following-sibling::p


        System.out.println( driver.findElement(By.xpath("//p[contains(text(), 'The program will take 24 weeks')]/preceding-sibling::h6")).getText());
      // Locate a non unique sibling by fisrt locating a unique sibling and navigating to its preceding sibling
        //p[contains(text(), 'The program will take 24 weeks')]/preceding-sibling::h6


    }
}
