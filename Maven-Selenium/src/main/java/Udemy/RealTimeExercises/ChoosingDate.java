package Udemy.RealTimeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ChoosingDate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.path2usa.com/travel-companion/");
        driver.manage().window().maximize();

        //we are going to fly at 6th january
       // driver.findElement(By.id("form-field-travel_comp_date")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector(".flatpickr-day"));
        for (WebElement element: elements) {
            if (element.getAttribute("aria-label").equals("December 6, 2023")){
                element.click();
                break;
            }
        }
    }
}
