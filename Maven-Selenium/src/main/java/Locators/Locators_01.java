package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locators_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String[] list = {"idris", "bahce", "rahulshettyacademy"};
        int i = 0;
        while (true) {
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys("idris");
            driver.findElement(By.name("inputPassword")).sendKeys(list[i]);
            driver.findElement(By.className("signInBtn")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            try {
                if (driver.findElement(By.cssSelector("p.error")).getText().equals("* Incorrect username or password")) {
                    i++;
                }
            } catch (Exception a) {
                driver.quit();
                System.exit(0);
            }
        }

    }
}
