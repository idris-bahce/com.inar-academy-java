package Homeworks.week02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class TestingPhotos {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        logInPage(driver);

        testPhotos(driver);

        driver.close();

    }

    private static void testPhotos(WebDriver driver) throws InterruptedException {
        //We put every image in this list
        List<WebElement> webElements = driver.findElements(By.xpath("//img[@class='inventory_item_img']"));

        //Here, the list of true images are given:
        String[] srcOfImagesInTheSite = {"https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.34e7aa42.jpg",
                "https://www.saucedemo.com/static/media/bike-light-1200x1500.a0c9caae.jpg",
        "https://www.saucedemo.com/static/media/bolt-shirt-1200x1500.c0dae290.jpg",
                "https://www.saucedemo.com/static/media/sauce-pullover-1200x1500.439fc934.jpg",
                "https://www.saucedemo.com/static/media/red-onesie-1200x1500.1b15e1fa.jpg",
        "https://www.saucedemo.com/static/media/red-tatt-1200x1500.e32b4ef9.jpg"};


        int index = 0;
        for (WebElement element: webElements) {//we control each image
            try {
                Assert.assertEquals(element.getAttribute("src"), (srcOfImagesInTheSite[index]));
                System.out.println("Image " + (index+1) + "' Test : PASS" );
            }catch (Error e){
                System.out.println("Image " + (index+1) + "' Test : FAIL" );
            }
            index++;
        }
    }

    private static void logInPage(WebDriver driver) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //problem_user
      // driver.findElement(By.id("user-name")).sendKeys("problem_user");
      // driver.findElement(By.id("password")).sendKeys("secret_sauce");
      // driver.findElement(By.id("login-button")).click();
    }
}
