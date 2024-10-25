package curasite_automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_automate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/piyushraj/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dummyflights.com/?gad_source=1&gclid=EAIaIQobChMIkca59NeXiQMVNA-DAx3SYRVzEAAYAyAAEgKBffD_BwE");


        driver.findElement(By.xpath("//input[@class='form-control des-date homepage_border']")).click();


        //body/section[@id='rh_main']/div[@id='mBWrapper']/main[@class='rh_content']/div[@id='homeV2-root']/div[@class='topSection']/div[@id='autoSuggestContainer']/div[@class='sc-hSdWYo cMISeA']/div[@class='sc-jWBwVP hyJWPH']/div[@id='onwardCal']/div[@class='labelCalendarContainer']/div[@class='sc-jzJRlG hrJoeL']/div[@class='DatePicker__CalendarContainer-sc-1kf43k8-0 jQCNYF']/div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/div[3]

     //  String values=driver.findElement(By.xpath("//"))

    }
}
