package April16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");  //switched to parent frame
        WebElement iframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(iframe);
        //  switched to a child frame
        System.out.println(driver.findElement(By.tagName("p")).getText());

        driver.switchTo().parentFrame();
        driver.findElement(By.tagName("body")).getText();
//

    }
}
