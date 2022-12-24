package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductInformation_3 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        logIn(driver);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Order")).click();
        Thread.sleep(2000);
        fillTheInfoList(driver);
        driver.findElement(By.linkText("View all orders")).click();
        Thread.sleep(1500);
        checkIfInfosTrue(driver);
        driver.close();
    }

    private static void checkIfInfosTrue(WebDriver driver) throws FileNotFoundException, InterruptedException {
        File file = new File("C:\\Users\\idris\\workspace\\com.inar-academy-java\\Maven-Selenium\\src\\main\\java\\Homeworks\\week01\\Check");
        Scanner input = new Scanner(file);
        int row = 0;
        Thread.sleep(1500);
        while (input.hasNext()){
            row++;
            String[] information = input.nextLine().split("-");
            for (int i = 0; i < information.length; i++) {
                if (!driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_orderGrid_ctl"+ ((row + 1)<10?"0"+(row+1):(row+1)) +"_OrderSelector\"]//following::td["+(i+1)+"]")).getText().equals(information[i])){
                    System.out.println(row+". row " + (i+1) + ". column: FAIL");
                }else
                    System.out.println(row+". row " + (i+1) + ". column: PASS");
            }
        }
    }

    private static void fillTheInfoList(WebDriver driver) throws FileNotFoundException, InterruptedException {
        File file = new File("C:\\Users\\idris\\workspace\\com.inar-academy-java\\Maven-Selenium\\src\\main\\java\\Homeworks\\week01\\Orders");
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            String[] info = input.nextLine().split("-");
            driver.findElement(By.xpath("//*[@name=\"ctl00$MainContent$fmwOrder$ddlProduct\"]//child::option["+ ((int)(Math.random()*3) + 1) +"]")).click();
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+((int)(Math.random() * 3)))).click();
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(info[0]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(info[1]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(info[2]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(info[3]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(info[4]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(info[5]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(info[6]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(info[7]);
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        }

    }

    private static void logIn(WebDriver driver) {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        String s = driver.findElement(By.xpath("//p[@class='info'][2]")).getText();
        String[] passwordAndId = s.split("\\n");
        String[] Id = passwordAndId[0].split(" - ");
        String[] password = passwordAndId[1].split(" - ");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(Id[1]);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password[1]);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }
}
