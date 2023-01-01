package Udemy.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment_08 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.id("autocomplete")).sendKeys("uni");
        for (int i = 0; i < 7; i++) {//since we have 7 times press down button, I put here 7
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        }
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

    }
}
