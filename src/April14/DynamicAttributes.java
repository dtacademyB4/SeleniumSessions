package April14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAttributes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://register.rediff.com/register/register.php");

        driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("Fuad");
        // xpath methods such as starts-with(), ends with(), contains()
    }
}
