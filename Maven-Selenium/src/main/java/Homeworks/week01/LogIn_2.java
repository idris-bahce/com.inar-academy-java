package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("idris");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("bahce");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        if (driver.findElement(By.id("ctl00_MainContent_status")).getText().equals("Invalid Login or Password.")){
            System.out.println("LOG IN CASE: FAIL");
        }
    }
}
