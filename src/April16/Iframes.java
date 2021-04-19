package April16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

    public static void main(String[] args) {
        //body[@id='tinymce']//p

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

//        driver.switchTo().frame("mce_0_ifr"); // switch using iframe's id
//        driver.switchTo().frame(0); // switch using iframe's id which is zero based

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area. Press ALT-0 for help.']"))); // switch using iframe as a webelement


        System.out.println(driver.findElement(By.xpath("//body[@id='tinymce']//p")).getText());
        driver.findElement(By.xpath("//body[@id='tinymce']//p")).clear();
        driver.findElement(By.xpath("//body[@id='tinymce']//p")).sendKeys("Hello");

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']")).click();




    }
}
