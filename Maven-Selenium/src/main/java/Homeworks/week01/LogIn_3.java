package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        String s = driver.findElement(By.xpath("//p[@class='info'][2]")).getText();
        String[] passwordAndId = s.split("\\n");
        String[] Id = passwordAndId[0].split(" - ");
        String[] password = passwordAndId[1].split(" - ");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(Id[1]);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password[1]);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(2000);
        try {
            if (driver.getCurrentUrl().equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/")) {
                System.out.println("TEST CASE : PASS");
            }
        } catch (Exception e){
            System.err.println("TEST CASE : FAIL");
        }
        driver.close();
    }
}
