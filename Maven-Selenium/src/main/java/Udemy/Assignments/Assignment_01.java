package Udemy.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Assignment_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();

        int selectedCounter = 0;
        List<WebElement> webElements = driver.findElements(By.cssSelector("input[type=checkbox]"));
        webElements.remove(webElements.size()-1);
        for (WebElement element : webElements) {
            if (element.isSelected()){
                selectedCounter++;
            }
        }
        System.out.println("Checked box number is: " + selectedCounter);
    }
}
