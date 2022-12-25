package week_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestSite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logIn(driver);
        Assert.assertEquals(driver.findElement(By.className("title")).getText(),"PRODUCTS");
        addToChart(driver);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        checkOut(driver);
        WebDriverWait waitObj = new WebDriverWait(driver,Duration.ofSeconds(3000));
        //waitObj.until(ExpectedConditions.elementToBeClickable(By.id()))

    }

    private static void checkOut(WebDriver driver) {
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Mehmet");
        driver.findElement(By.id("last-name")).sendKeys("yılmaz");
        driver.findElement(By.id("postal-code")).sendKeys("03300");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(),
                "THANK YOU FOR YOUR ORDER");
    }

    private static void addToChart(WebDriver driver) {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

    }

    private static void logIn(WebDriver driver) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
