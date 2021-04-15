package April14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");




     //   body > div.page-wrapper > div:nth-child(5) > div.wrapper.w-container > a   absolute Css path
        //a[@class='button w-button']  XPATH expression
        //a.button.w-button            CSS expression

        driver.findElement(By.cssSelector("a.button.w-button")).click();


        for (int i = 0; i < 10; i++) {
            driver.get("https://www.duotech.io/contact");

            // form.contact-split-form input#name

            driver.findElement(By.cssSelector("form.contact-split-form input#name")).sendKeys("Akmal");
            driver.findElement(By.cssSelector("form.contact-split-form input#email")).sendKeys("akmal@gmail.com");
            driver.findElement(By.cssSelector("form.contact-split-form textarea#field")).sendKeys("We are just testing. Relax");
            driver.findElement(By.cssSelector("form.contact-split-form input.contact-button")).click();
            Thread.sleep(1000);

        }


         driver.get("https://www.duotech.io/business-systems-analyst");

       // a[href='/enroll-bsa'][class='button contact-ready-button w-button']

        driver.findElement(By.cssSelector("a[href='/enroll-bsa'][class='button contact-ready-button w-button']")).click();

       // input[name^='Register'] -> input element with name attribute whose value starts with Register
        driver.findElement(By.cssSelector("input[name^='Register']")).click();





    }
}
