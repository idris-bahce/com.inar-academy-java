package Udemy.Technics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        List<WebElement>elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        elements.remove(0);
        for (WebElement element: elements) {
            element.click();
            if (element.isSelected()){
                System.out.println("Test Case: PASS");
            }else {
                System.out.println("Test Case: FAIL");
            }
        }
    }
}
