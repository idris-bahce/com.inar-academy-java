import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) {
     //  System.setProperty("webdriver.chrome.driver","C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
     //  WebDriver driver = new ChromeDriver();
     //  driver.get("https://github.com/");
     //  System.out.println(driver.getTitle());
     //  driver.close();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\idris\\Desktop\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
