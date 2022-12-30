package Udemy.AjaxCallChildWindowsAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingAjax {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        //move mouse to the location
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
        //entering letters with capital
        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).
                sendKeys("hello").doubleClick().build().perform();
    }
}
