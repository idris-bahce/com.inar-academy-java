package Homeworks.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewAllOrders_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        logIn(driver);
        Thread.sleep(2000);
        for (int i = 2; i <= 9; i++) {
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[" + i + "]/td[13]/input")).click();
            Thread.sleep(3000);
            if (i == 3 || i == 5) {
                changeTheValues(driver);
            } else
                driver.navigate().back();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[" + i + "]/td[1]/input")).click();
        }

    }

    private static void changeTheValues(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']//child::option[1]")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("75");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        Thread.sleep(2000);
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
