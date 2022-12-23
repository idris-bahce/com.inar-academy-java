package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogIn_1 {
    public static void main(String[] args) throws FileNotFoundException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        File file = new File("C:\\Users\\idris\\workspace\\com.inar-academy-java\\Maven-Selenium\\src\\main\\java\\Homeworks\\week01\\ID and Passwords");
        if (!file.exists()) {
            System.err.println("There is no such a file!");
            System.exit(0);
        }
        Scanner input = new Scanner(file);
        int count = 0;
        while (input.hasNext()) {
            count++;
            driver.findElement(By.id("ctl00_MainContent_username")).clear();
            String line = input.nextLine();
            String[] idAndPass = line.split(" ");
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(idAndPass[0]);
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(idAndPass[1]);
            driver.findElement(By.name("ctl00$MainContent$login_button")).click();

            if (driver.getCurrentUrl().equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/")) {
                System.out.println("TEST CASE" + count + ": PASS");
            } else
                System.err.println("TEST CASE " + count + ": FAIL");
        }
        input.close();
        driver.close();
    }
}
