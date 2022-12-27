package Udemy.Technics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class E2E {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("it is enabled");
            Assert.assertTrue(true);
        }else {
            Assert.fail();
        }
        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        for (int i = 0; i < 4; i++) {//5 adults
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency'] //option[4]")).click();

        driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
    }
}
