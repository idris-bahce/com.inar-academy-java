package Udemy.MiscellaneousTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SSLCheck {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle());


    }
}
