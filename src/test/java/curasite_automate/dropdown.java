package curasite_automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropdown {

    public static void main(String[] args)  throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.orangehrm.com/en/book-a-free-demo");


        Thread.sleep(1000);
       WebElement dropdown= driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));

        List<WebElement> options=dropdown.findElements(By.tagName("option"));
      System.out.println( options.size());
        Thread.sleep(1000);
        for(WebElement opt:options)
        {
            String textvalue=opt.getText();
            System.out.println(textvalue);

            if(textvalue.equalsIgnoreCase("egypt"))
            {
                opt.click();
                break;
            }
        }

        Thread.sleep(1000);








    }
}
