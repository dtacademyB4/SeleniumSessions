package April16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WarmUpTask {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

                  //1.Go to amazon.com

         String searchTerm = "keyboard";
                 //2. Search for a "mouse"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm +  Keys.ENTER );

                //3. Verify that the results contain the string "mouse"

        //a[@class='a-link-normal a-text-normal']

//        List<WebElement> links = driver.findElements(By.xpath("//a[@class='a-link-normal a-text-normal']"));
        List<WebElement> links = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));

       boolean containsSearchTerm = true;
        for (WebElement link : links) {
            if(! link.getText().isEmpty()) {
               if( !link.getText().toLowerCase().contains(searchTerm) ){

                   System.out.println(link.getText());
                   containsSearchTerm = false;
               }

            }
        }

        if(containsSearchTerm){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }




    }
}
