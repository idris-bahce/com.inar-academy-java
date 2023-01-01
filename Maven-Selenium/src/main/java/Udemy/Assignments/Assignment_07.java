package Udemy.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment_07 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        List<WebElement> elementsRow = driver.findElements(By.xpath("//table[@name='courses']//tr"));
        System.out.println("Number of the rows in the table is: " + elementsRow.size());

        List<WebElement> elementsCol = driver.findElements(By.xpath("//table[@name='courses']//th"));
        System.out.println("Number of the columns in the table is: " + elementsCol.size());
        //second row:
        System.out.println(elementsRow.get(2).getText());
        driver.close();
    }
}
