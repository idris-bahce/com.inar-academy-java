package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("idris");
        driver.findElement(By.name("inputPassword")).sendKeys("try123");
        driver.findElement(By.className("signInBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            if (driver.findElement(By.cssSelector("p.error")).getText().equals("* Incorrect username or password")) {
                driver.findElement(By.linkText("Forgot your password?")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
                Thread.sleep(3000);
                String s = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
                String[] strings = s.split("'");
                driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
                driver.findElement(By.id("inputUsername")).sendKeys("idris");
                driver.findElement(By.name("inputPassword")).sendKeys(strings[1]);
                Thread.sleep(2000);
                driver.findElement(By.className("signInBtn")).click();
            }
        } catch (Exception a) {
           driver.quit();
           System.exit(0);
        }
    }
}
