package April14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.List;

public class Dropdowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

        WebElement stockType = driver.findElement(By.name("stockType"));
        Select select = new Select(stockType);

        select.selectByVisibleText("Used Cars");
//        select.deselectByVisibleText("Used Cars"); //You may only deselect options of a multi-select

        select = new Select(driver.findElement(By.name("makeId")));
//        select.selectByValue("20069");

        // Get the list of all car makes and print it

       // List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        System.out.println(select.getFirstSelectedOption().getText());


        new Select(driver.findElement(By.name("modelId"))).selectByIndex(1); // index is 0 based
        new Select(driver.findElement(By.name("radius"))).selectByVisibleText("50 Miles from"); // index is 0 based
        driver.findElement(By.name("zip")).sendKeys("22042");
         driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector(".NZE2g")).click();



        //
    }
}
