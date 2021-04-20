package april19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {
        //div[@id='finish']//h4

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit waits are set
        // globally for all elements

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // CLick on Start
        driver.findElement(By.tagName("button")).click();

        // Verify that text is equal to Hello World

        //Static wait -> hardcoded wait that will stop the execution for given amount of time
//         Thread.sleep(10000); // this type of wait is not encouraged in coding because it will increase the
        // execution time of your test
        //

        String text = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();

        if(text.equals("Hello World!")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL:" + text);
        }


    }
}
