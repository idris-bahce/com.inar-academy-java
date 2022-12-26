package Udemy.FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators {
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
                Thread.sleep(2000);
                Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
                Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello idris,");
                driver.findElement(By.xpath("//*[text()='Log Out']")).click();
                driver.close();
            }
        } catch (Exception a) {
            driver.quit();
            System.exit(0);
        }
    }
}
