package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductInformation_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        logIn(driver);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Order")).click();
        Thread.sleep(2000);
        fillTheInfoList(driver);
    }

    private static void fillTheInfoList(WebDriver driver) {
        driver.findElement(By.xpath("//option[@value='FamilyAlbum']")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("3");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("John Lennon");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Silver Avenue");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Paterson");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("New Jersey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("245621");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("2541256322547852");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/26");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
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
