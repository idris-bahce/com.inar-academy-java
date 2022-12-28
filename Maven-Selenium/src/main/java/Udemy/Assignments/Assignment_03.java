package Udemy.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment_03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        signIn(driver, wait);

        addToChart(wait,driver);
    }

    private static void addToChart(WebDriverWait wait, WebDriver driver) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-info'])[1]")));
        List<WebElement>elements = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (WebElement element : elements) {
            element.click();
        }
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
    }

    private static void signIn(WebDriver driver, WebDriverWait wait) {
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
        driver.findElement(By.cssSelector("#okayBtn")).click();
        driver.findElement(By.xpath("//option[@value='stud']")).click();
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
    }
}
