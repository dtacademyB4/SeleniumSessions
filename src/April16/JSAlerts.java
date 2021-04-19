package April16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlerts {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[contains(text(), 'Alert')]")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println( alert.getText());
        alert.accept();
        // If an alert is not handled and you do any operation on unhandled alert, UnhandledAlertException: unexpected alert open:  is thrown

        if(driver.findElement(By.id("result")).getText().equals("You successfully clicked an alert")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }

        driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();

       alert = driver.switchTo().alert();
        System.out.println( alert.getText());

       alert.dismiss();

        if(driver.findElement(By.id("result")).getText().equals("You clicked: Cancel")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }

        driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();

        alert = driver.switchTo().alert();

        alert.sendKeys("Hola");

        System.out.println( alert.getText());

        alert.accept();

        if(driver.findElement(By.id("result")).getText().equals("You entered: "+ "Hola")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }

        // Handle Dialog boxes
        // Handle it like any web element

        driver.get("https://demoqa.com/modal-dialogs");

        driver.findElement(By.id("showLargeModal")).click();
        driver.findElement(By.xpath("//button[@class='close']")).click();

        // Volvo dialog box
        //button[@title='Accept Cookies']
        driver.get("https://www.volvocars.com/us/inventory/results?carModel=XC90&trim=Momentum&engine=T5");

        driver.findElement(By.xpath("//button[@title='Accept Cookies']")).click();

        driver.findElement(By.xpath("//input[@class='zip-input']")).sendKeys("22203" + Keys.ENTER);








    }
}
