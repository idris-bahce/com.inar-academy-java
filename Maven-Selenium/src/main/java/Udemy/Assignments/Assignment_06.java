package Udemy.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment_06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.id("checkBoxOption2")).click();
        String box = driver.findElement(By.cssSelector("label[for='benz']")).getText();
        WebElement dropbox = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropbox);
        select.selectByVisibleText(box);

        driver.findElement(By.id("name")).sendKeys(box);
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();
        if (alertText.contains(box)){
            System.out.println("Alert massage success!");
        }else
            System.err.println("Alert massage fail!");
    }
}
