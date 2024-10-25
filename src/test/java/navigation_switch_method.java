import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class navigation_switch_method {

    public static void main(String[] args)  throws  InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

       Set<String>  ids= driver.getWindowHandles();

        List<String> allid=new ArrayList<>(ids);

        String parentid=allid.get(0);
        String childid=allid.get(1);

        System.out.println("parentid"+parentid);
        System.out.println(driver.getWindowHandle());

        WebElement obj= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
        obj.sendKeys("piyuhs");

        driver.switchTo().window(parentid);


       for(String a:allid)
       {
          // System.out.println(a);
       }

       //driver.quit();


    }
}
