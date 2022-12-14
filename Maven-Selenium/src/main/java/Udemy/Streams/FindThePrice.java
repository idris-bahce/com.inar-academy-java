package Udemy.Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class FindThePrice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<String> price;
        do {
            List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
            price = elements.stream().filter(s -> s.getText().equals("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
            price.forEach(a-> System.out.println(a));
            if (price.size()<1){
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        }while (price.size()<1);

    }

    private static String getPriceVeggie(WebElement s) {

        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
