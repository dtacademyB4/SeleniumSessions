package April9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {




//        String xpath = "/html/body/div[2]/div[2]/div[1]/nav/div[1]/div/div/a";

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io/");

        String text = driver.findElement(By.xpath("//a[@class='link-4 w--current']")).getText();
        System.out.println(text);

        String text1 = driver.findElement(By.xpath("//a[@class='link-4']")).getText();
        System.out.println(text1);

        //a[@href='/contact'][@class='link-2']

        String text3 = driver.findElement(By.xpath("//a[@href='/contact'][@class='link-2']")).getText();
        System.out.println(text3);

    }
}
