package Udemy.MiscellaneousTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        SoftAssert a = new SoftAssert();
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int respondCode = connection.getResponseCode();
            a.assertTrue(respondCode<400,link.getText() + " is FAILED");

        }
        a.assertAll();
        driver.close();

    }
}
