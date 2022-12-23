package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewAllOrders_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        logIn(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[4]/td[13]/input")).click();
        Thread.sleep(2000);
        changeTheValues(driver);
        driver.close();
    }

    private static void changeTheValues(WebDriver driver) {
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).clear();
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("Ferhat Kaya");
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).clear();
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("25, Silver Avenue");
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).clear();
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Kars");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[3]/td[13]/input")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[7]/td[13]/input")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
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
