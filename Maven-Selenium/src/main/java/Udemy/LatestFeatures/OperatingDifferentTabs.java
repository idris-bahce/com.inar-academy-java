package Udemy.LatestFeatures;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class OperatingDifferentTabs {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/angularpractice");
        driver.manage().window().maximize();

        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentURL = it.next();
        String childURL = it.next();
        driver.switchTo().window(childURL);
        driver.get("https://rahulshettyacademy.com/");
        String nameOfCourse = driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/p/core-java-for-automation-testers-interview-programs'])[2]")).getText();
        driver.switchTo().window(parentURL);
        WebElement nameBox = driver.findElement(By.xpath("(//input[@name='name'][1])[1]"));
        nameBox.sendKeys(nameOfCourse);
        File file = nameBox.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("logo.png"));

    }
}
