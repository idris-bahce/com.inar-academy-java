package Udemy.Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(originalList,sortedList);
    }
}
