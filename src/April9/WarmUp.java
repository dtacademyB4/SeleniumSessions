package April9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WarmUp {


    public static void main(String[] args) {
        // Setup
//        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "/Users/duotech/Documents/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.duotech.io/");
        String str = "Duotech Academy";
        String source = driver.getPageSource();

        //Navigate to tiktok.com
        //   4. Verify the url is https://www.tiktok.com/
        driver.get("https://www.tiktok.com/");
        String expectedUrl = "https://www.tiktok.com/";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test case is passed. Actual URL "+ actualUrl + " matches to expected Url " + expectedUrl);
        }else{
            System.out.println("Test is failed. Actual URL is "+ actualUrl + " expected Url is " + expectedUrl);
        }
        // Navigate to https://stackoverflow.com/
        // 6. Verify the title contains Stack Overflow
        driver.get("https://stackoverflow.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Stack Overflow";
        System.out.println();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test case is passed. The title "+ actualTitle + " contains " + expectedTitle);
        }else{
            System.out.println("Test is failed. Actual title is "+ actualTitle + " does not contain " + expectedTitle);
        }
        // 7. Navigate back to duotech.io and verify that page contains
        // Start New IT Career text
        driver.navigate().back();
        driver.navigate().back();
        String str1 = "Start New IT Career";
        String source1 = driver.getPageSource();
        if(source1.contains(str1)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail. The pade does not contain the word " + str);
        }
        driver.quit();
    }


    public static void assertEqual(String expected, String actual){
        if(expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail.");
        }
    }
}
