import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkboxes {
    public static void main(String[] args)  throws  InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //selecting multiple checkboxes

        driver.get("https://testautomationpractice.blogspot.com");

        List<WebElement> checkb=driver.findElements(By.xpath("//div[@class='form-group'][4]//div[@class='form-check form-check-inline']//label[@class='form-check-label']"));


        System.out.println(checkb.size());

        for( WebElement a:checkb)
        {
            a.click();
            String txt=a.getText();
            System.out.println(txt);

        }


    }
}
