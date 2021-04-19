package April16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframes {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        driver.switchTo().defaultContent();



        driver.switchTo().frame("frame2");

        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
    }
}
