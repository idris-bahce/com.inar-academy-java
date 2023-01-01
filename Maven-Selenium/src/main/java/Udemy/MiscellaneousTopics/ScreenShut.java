package Udemy.MiscellaneousTopics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShut {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\idris\\screenshot.png"));
    }
}
