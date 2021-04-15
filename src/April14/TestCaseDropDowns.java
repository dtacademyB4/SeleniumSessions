package April14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCaseDropDowns {

    public static void main(String[] args) {
        // Verify that the models that are available for Lamborghini is correct
        //
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");


       new Select(driver.findElement(By.name("stockType"))).selectByVisibleText("Used Cars");

       new Select(driver.findElement(By.name("makeId"))).selectByValue("20069");


        List<WebElement> modelIds = new Select(driver.findElement(By.name("modelId"))).getOptions();

        List<String> expectedList = Arrays.asList( "Aventador",
                                                    "Aventador S",
                                                    "Aventador SVJ",
                                                    "Diablo",
                                                    "Gallardo",
                                                    "Huracan",
                                                    "Huracan EVO",
                                                    "Murcielago",
                                                    "Urus");


        List<String> actualList = new ArrayList<>();


        for (int i = 1; i < modelIds.size(); i++) {
            actualList.add(modelIds.get(i).getText());
        }

        System.out.println(expectedList);
        System.out.println(actualList);

        if(expectedList.equals(actualList)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
