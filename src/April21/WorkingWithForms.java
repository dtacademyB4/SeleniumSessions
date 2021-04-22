package April21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WorkingWithForms {




    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();



        driver.get(" https://www.duotech.io/enroll-bsa");


        WebElement iframe = driver.findElement(By.xpath("//iframe[starts-with(@id, '1619')]"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Akmal");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Last']")).sendKeys("Bek");
        driver.findElement(By.xpath("//input[@type='email'][@data-size='full'][@data-role='i123-input']")).sendKeys("mail@mail.com");
        driver.findElement(By.xpath("//input[@placeholder='### ### #### ']")).sendKeys("2154213611");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("123 Main st");
        driver.findElement(By.xpath("//input[@placeholder='Street Address Line 2']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Vienna");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Postal / Zip Code']")).sendKeys("22142");

        driver.findElement(By.xpath("//div[@role='application']")).click();
        driver.findElement(By.xpath("//div[@data-action='select-year']")).click();
        driver.findElement(By.xpath("//div[@data-year='2018']")).click();
        driver.findElement(By.xpath("//div[@data-month='2']")).click();
        driver.findElement(By.xpath("//div[@data-day='15']")).click();

        WebElement select = driver.findElement(By.tagName("select"));
        Select s = new Select(select);

        s.selectByValue("ON-CAMPUS");

        driver.findElement(By.xpath("//input[@id='text-00000014']")).sendKeys("Masters");

        if( ! driver.findElement(By.id("00000016_4")).isSelected()){
            driver.findElement(By.id("00000016_4")).click();
        }

        driver.findElement(By.id("text-00000018")).sendKeys("Fatih");

        driver.findElement(By.cssSelector("input[id^='tos']")).click();

        driver.findElement(By.cssSelector("button[type='submit']")).click();










    }
}
