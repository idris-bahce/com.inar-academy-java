package Udemy.Technics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AddingChart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.manage().window().maximize();
        String[] listToBuy = {"Cucumber","Tomato ","Carrot"};
        List<String> list = Arrays.asList(listToBuy);

        List<WebElement> webElementListOfButtons = driver.findElements(By.xpath("//div[@class=\"product-action\"]"));
        List<WebElement> webElementListOfNames = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));

        int timeForBreak = 0;

        for (int i = 0; i < webElementListOfButtons.size(); i++) {
            if (isInList(webElementListOfNames.get(i),list)){
                webElementListOfButtons.get(i).click();
                timeForBreak++;
                if (timeForBreak == list.size()){
                    break;
                }
            }
        }
    }

    private static boolean isInList(WebElement webElement, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (webElement.getText().contains(list.get(i))){
                return true;
            }
        }
        return false;
    }


}
