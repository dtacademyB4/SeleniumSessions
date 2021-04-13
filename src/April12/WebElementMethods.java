package April12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementMethods {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");


        System.out.println(driver.findElement(By.name("q")).getAttribute("class"));
        System.out.println(driver.findElement(By.name("q")).getAttribute("data-ved"));


        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        int expectedQuantity = 1;

       String actualQuantity =  driver.findElement(By.id("quantity_wanted")).getAttribute("value");

       if(Integer.parseInt(actualQuantity) == expectedQuantity){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
       }


       driver.get("https://duotech.io");
        System.out.println(driver.findElement(By.xpath("//p[@class='paragraph-big']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='hero-table-intro']")).getText());


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("tester");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("display"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("float"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("clear"));

        String expectedColor = "rgba(255, 0, 0, 1)";
       String actualColor = driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color");

       if(actualColor.equals(expectedColor)){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
       }


        driver.get("https://duotech.io");


        System.out.println(driver.findElement(By.xpath("//img[@class='image-2']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//h1")).getLocation());


        System.out.println(driver.findElement(By.xpath("//img[@class='image-2']")).getSize());
        System.out.println(driver.findElement(By.xpath("//h1")).getSize());


        System.out.println(driver.findElement(By.xpath("//img[@class='image-2']")).getSize());
        System.out.println(driver.findElement(By.xpath("//h1")).getSize());


        driver.get("https://google.com");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='MV3Tnb']"));

        for (WebElement el:
             elements) {
            System.out.println(el.getTagName());
        }


        driver.findElement(By.name("q")).sendKeys("How much is the average salary for an SDET in DC area?" + Keys.ENTER);

        driver.findElement(By.name("q")).clear();

        driver.get("https://dice.com");

        Thread.sleep(3000);

        driver.findElement(By.id("google-location-search")).sendKeys("New York");

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Airpods pro");
        driver.findElement(By.name("btnK")).submit();



    }
}
