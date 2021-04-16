package April16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables {

    public static void main(String[] args) {
        //table[@id='ctl00_MainContent_orderGrid']//tr[1]//th

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER );

        List<WebElement> elements = driver.findElements(By.xpath(" //table[@id='ctl00_MainContent_orderGrid']//tr[1]//th"));

        for (WebElement element : elements) {
            System.out.print(element.getText() + " ");
        }

        // Find if any table cell equals to a string "7, Flower Street"

        List<WebElement> elements1 = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td"));

        for (WebElement webElement : elements1) {
            if(webElement.getText().equals("7, Flower Street")){
                System.out.println("The search term is found");
                break;
            }
        }

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr"));

        for (WebElement row : rows) {
            System.out.println(row.getText());
        }

    }
}
