package Udemy.RealTimeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class End2End_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        WebElement firstColumn = footer.findElement(By.xpath("//table[@class='gf-t']//td[1]"));
        System.out.println(firstColumn.findElements(By.tagName("a")).size());

        for (int i = 1; i < firstColumn.findElements(By.tagName("a")).size(); i++) {
            String clickNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickNewTab);

        }
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
    }
}
