package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.time.Duration;

public class FirstAutomation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Navigate to the MakeMyTrip Railways page
        driver.get("https://www.amazon.in/");




        String currentURL = driver.getCurrentUrl();

        System.out.println(currentURL);
        System.out.println(driver.getTitle());


       WebElement temp= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

       temp.sendKeys("iphone");
       temp.submit();


       WebElement item=driver.findElement(By.xpath("//button[@class='a-button-text']"));

       item.click();

       Thread.sleep(5000);

       driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();


       Thread.sleep(5000);




     driver.close();




        // driver.findElement(By.xpath(""));

        //From Field
        /*
        driver.findElement(By.xpath("//div[@class='rsw_inputBox selectRailCity  ']/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class= 'hsw_autocompletePopup autoSuggestPlugin ' ]/div/input")).sendKeys("Delhi");

        List<WebElement> dynamicList=driver.findElements(By.cssSelector("p[class= 'searchedResult font14 darkText']"));

        for(int i=0; i<dynamicList.size(); i++) {
            String text=dynamicList.get(i).getText();
            System.out.println("Text is: "+text);
            if(text.contains("Delhi")) {
                dynamicList.get(i).click();
                break;
            }
        }

        Thread.sleep(3000);

        //To Field
        WebElement element=driver.findElement(By.xpath("//div[@class= 'hsw_autocomplePopup autoSuggestPlugin ' ]/div/input"));
        element.sendKeys("Lucknow");
        Thread.sleep(3000);
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);

        Thread.sleep(3000);


        //Date
        List<WebElement> selectDate= driver.findElements(By.cssSelector("div[class='DayPicker-Day']"));
        Thread.sleep(3000);
        for(int i=0; i<selectDate.size(); i++) {
            String text=selectDate.get(i).getText();
            System.out.println("Text is: "+text);
            if(text.equals("20")) {
                selectDate.get(i).click();
                break;
            }
        }

        //Class
        List<WebElement> selectClass=driver.findElements(By.tagName("li"));
        Thread.sleep(3000);
        for(int i=0; i<selectClass.size(); i++) {
            String text=selectClass.get(i).getText();
            System.out.println("Text is: "+text);
            if(text.contains("Third AC")) {
                selectClass.get(i).click();
                break;
            }
        }

        driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
        Thread.sleep(5000);
        driver.close();  */





    }
}
