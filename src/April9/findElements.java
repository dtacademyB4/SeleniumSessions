package April9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {

public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The number of links on this page: " + links.size());
        for (WebElement e : links) {
                System.out.println(e.getText());
        }


        for (WebElement e : links) {
                System.out.println(e.getAttribute("href"));
        }

        System.out.println(driver.findElements(By.tagName("iframe")).getClass());
        List<WebElement> listOfIframes = driver.findElements(By.tagName("iframe"));

        System.out.println(listOfIframes.size());


        // What happens if findElement() method can't find any matching element? -> NoSuchElementException is thrown
        // What happens if findElements() method can't find any matching element? -> There is no exception thrown, it simply returns empty list



}
}
