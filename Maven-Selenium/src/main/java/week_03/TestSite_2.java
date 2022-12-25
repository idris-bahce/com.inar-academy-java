package week_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestSite_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        logIn(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
                .getText(),"Epic sadface: Username and password do not match any user in this service");
        driver.close();
    }

    private static void logIn(WebDriver driver) {
        driver.findElement(By.id("user-name")).sendKeys("standard_usr");
        driver.findElement(By.id("password")).sendKeys("secret_sace");
        driver.findElement(By.id("login-button")).click();
    }
}
