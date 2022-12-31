package Udemy.PracticalProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
        //Handling Table Grids
        int sum =0;
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
        for (WebElement element: elements ) {
            sum += Integer.parseInt(element.getText());
        }
        System.out.println("Sum of the numbers in table is: " + sum);
    }
}
