package curasite_automate;


import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class curo_test {

    public static <list> void main(String[] args)throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Navigate to the MakeMyTrip Railways page
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();

        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");

        driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id='btn-login']")).click();


        // for dropdown

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='combo_facility']"));

        // Find all option elements within the dropdown
        List<WebElement> options = dropdown.findElements(By.tagName("option"));

        // Loop through the list of options and select one by visible text
        for (WebElement temp : options) {
            // Get the text of the option element
            String optionText = temp.getAttribute("value");
            System.out.println("Option: " + optionText);

            // Check for a specific option and click it (for example, selecting 'Hongkong CURA Healthcare Center')
            if (optionText.equals("Seoul CURA Healthcare Center")) {
                temp.click();
                break; // Exit the loop after selecting the option
            }
        }


        // for checkbox
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@class='checkbox-inline']")).click();



     // for select box
        WebElement checkboxContainer = driver.findElement(By.xpath("//div[@class='col-sm-4']"));

        System.out.println("Container found");

// Find all radio button inputs within the container
        List<WebElement> radioButtons = checkboxContainer.findElements(By.xpath("//input[@name='programs']"));

        System.out.println("Radio buttons found: " + radioButtons.size());

        for (WebElement radioButton : radioButtons) {
            // Get the associated label for each radio button
            String optionText = radioButton.getAttribute("value");
            System.out.println("Option: " + optionText);

            // Check for a specific option and select it (for example, selecting 'Medicaid')
            if (optionText.equals("Medicaid")) {
                radioButton.click(); // Click the radio button to select it
                System.out.println("Selected: " + optionText);
                break; // Exit the loop after selecting the option
            }
        }

        // for date pickers

        WebElement datepicker=driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        datepicker.click();
        datepicker.sendKeys("10/5/2003");
        datepicker.click();

       Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("hello i am not feeling good so book an appointed for me");

        Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
       Thread.sleep(2000);

       driver.close();



    }
}
