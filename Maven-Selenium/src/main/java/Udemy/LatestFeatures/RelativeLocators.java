package Udemy.LatestFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        WebElement nameBox = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());

        WebElement dateOfBirthBox = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dateOfBirthBox)).click();

        WebElement iceCreamBox = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamBox)).click();

        WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
        driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).click();
    }
}
