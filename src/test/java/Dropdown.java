import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //selecting multiple checkboxes
        /*
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(500);

        WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));

        Select opt=new Select(dropdown);

        //opt.selectByVisibleText("Canada");
        opt.selectByValue("japan");*/


        //BOOTSRAP DROPDOWN

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

       WebElement obj= driver.findElement(By.xpath("//span[@class='multiselect-selected-text']"));

       obj.click();

        List<WebElement> dropdownopt=obj.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//input[@type='checkbox']"));

        for(WebElement ch:dropdownopt)
        {
            System.out.println(ch.getAttribute("value"));
            ch.click();
        }






        




    }
}

