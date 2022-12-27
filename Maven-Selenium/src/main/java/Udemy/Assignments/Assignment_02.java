package Udemy.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Assignment_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Idris");
        driver.findElement(By.name("email")).sendKeys("Idris@email.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("exampleInputPassword1");
        driver.findElement(By.id("exampleCheck1")).click();
       // driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"]//option [1]")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("Male");
        System.out.println("Is Entrepreneur enabled: "+driver.findElement(By.id("inlineRadio3")).isEnabled());
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("04041996");
        driver.findElement(By.xpath("//input[@class=\"btn btn-success\"]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"))
                .getText().contains("Success! The Form has been submitted successfully!."));

    }
}
