package April14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER );

        driver.findElement(By.cssSelector("a[href='Process.aspx']")).click();

        WebElement element = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_2"));

//        if(! element.isSelected()){
//          element.click();
//        }
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        if(Math.random()>0.33){
            radioButtons.get(0).click();
        }else if(Math.random()>0.66){
            radioButtons.get(1).click();
        }else{
            radioButtons.get(2).click();
        }

        driver.findElement(By.cssSelector("a[href='Default.aspx']")).click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement e:
             checkboxes) {
            if(!e.isSelected())
                    e.click();
        }

        driver.findElement(By.cssSelector("#ctl00_MainContent_btnDelete")).click();

    }
}
