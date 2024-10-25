import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Authenticated_popup {

    public static void main(String[] args)  throws  InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //selecting multiple checkboxes

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        Thread.sleep(500);



    }
}
