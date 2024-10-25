import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //selecting multiple checkboxes

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(5000);
        Alert myalert=driver.switchTo().alert();

        Thread.sleep(5000);
        System.out.println(myalert.getText());
        myalert.accept();


        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(5000);

        Alert myalert2=driver.switchTo().alert();

        Thread.sleep(5000);

      //  myalert2.accept(); // for entering ok
        myalert2.dismiss();  // for entering cancel or dismiss

        // for enter in promt window

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(5000);

        Alert myalert3=driver.switchTo().alert();

        myalert3.sendKeys("hello alert");
        myalert3.accept();











    }
}
