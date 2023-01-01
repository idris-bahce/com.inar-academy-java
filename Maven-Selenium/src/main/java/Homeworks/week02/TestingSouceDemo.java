package Homeworks.week02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class TestingSouceDemo {
    /* Test Cases:
1.   Doğru ID doğru Şifre
2.   Yanlış ID yanlış şifre
3.   Yanlış ID doğru şifre
4.   Doğru ID yanlış şifre
5.   Fotoğrafların doğruluğu testi(idris)
6.   Buttonların çalışma testi(hasan)
7.   Sepete sipariş düşüyor mu testi(Üzeyir)
8.   Dropdown testi(berk)
9.   Your information testi
10.     Sipariş alma*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        testCase1(driver);//Doğru ID doğru Şifre
        testCase2(driver);//Yanlış ID yanlış şifre
        testCase3(driver);//Yanlış ID doğru şifre
        testCase4(driver);//Doğru ID yanlış şifre
        testCase5(driver);//Fotoğrafların doğruluğu testi(idris)
        testCase6(driver);//Buttonların çalışma testi(hasan)
        testCase7(driver);//Sepete sipariş düşüyor mu testi(Üzeyir)
        testCase8(driver);//Dropdown testi(berk)
        testCase9(driver);//Your information testi
        testCase10(driver);//Sipariş alma (End to end)
    }

    private static void testCase10(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("a[class=shopping_cart_link]")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Idris");
        driver.findElement(By.id("last-name")).sendKeys("Garden");
        driver.findElement(By.id("postal-code")).sendKeys("34537");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        SoftAssert a = new SoftAssert();
        a.assertEquals(driver.findElement(By.cssSelector("h2[class='complete-header']")).getText(),"THANK YOU FOR YOUR ORDER");
        driver.quit();
    }

    private static void testCase9(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("a[class=shopping_cart_link]")).click();
        driver.findElement(By.id("checkout")).click();

        SoftAssert a = new SoftAssert();
        driver.findElement(By.id("first-name")).sendKeys("Idris");
        a.assertEquals(driver.findElement(By.id("first-name")).getText(),"Idris");
        driver.findElement(By.id("last-name")).sendKeys("Garden");
        a.assertEquals(driver.findElement(By.id("last-name")).getText(),"Garden");
        driver.findElement(By.id("postal-code")).sendKeys("34537");
        a.assertEquals(driver.findElement(By.id("postal-code")).getText(),"34537");
        driver.findElement(By.id("continue")).click();
        a.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-step-two.html");
        driver.quit();
    }

    private static void testCase8(WebDriver driver) {
        dropDown1(driver);
        dropDown2(driver);
        dropDown3(driver);
        dropDown4(driver);
    }

    private static void dropDown4(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        WebElement staticDropbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select dropdown = new Select(staticDropbox);
        dropdown.selectByValue("hilo");

        //driver.findElement(By.xpath("//select/option[4]")).click();
        List<WebElement> labels = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (int i = 0; i < labels.size() - 1; i++) {
            String[] prices = labels.get(i).getText().split("\\$");
            String[] prices1 = labels.get(i + 1).getText().split("\\$");
            if (Double.parseDouble(prices[1]) - Double.parseDouble(prices1[1]) < 0) {
                System.out.println("TEST IS FAILED!");
                System.exit(-1);
            }
        }
        System.out.println("TEST PASSED!");

        driver.quit();
    }

    private static void dropDown3(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        WebElement staticDropbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select dropdown = new Select(staticDropbox);
        dropdown.selectByValue("lohi");

        //driver.findElement(By.xpath("//select/option[3]")).click();
        List<WebElement> labels = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (int i = 0; i < labels.size() - 1; i++) {
            String[] prices = labels.get(i).getText().split("\\$");
            String[] prices1 = labels.get(i + 1).getText().split("\\$");
            if (Double.parseDouble(prices[1]) - Double.parseDouble(prices1[1]) > 0) {
                System.out.println("TEST IS FAILED!");
                System.exit(-1);
            }
        }
        System.out.println("TEST PASSED!");

        driver.quit();
    }

    private static void dropDown2(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        WebElement staticDropbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select dropdown = new Select(staticDropbox);
        dropdown.selectByValue("za");

        // driver.findElement(By.xpath("//select/option[2]")).click();
        List<WebElement> labels = driver.findElements(By.xpath("(//div[@class='inventory_item_name'])"));
        for (int i = 0; i < labels.size() - 1; i++) {
            if (labels.get(i).getText().compareTo(labels.get(i + 1).getText()) < 0) {
                System.out.println("TEST IS FAILED!");
                System.exit(-1);
            }
        }
        System.out.println("TEST PASSED!");

        driver.quit();
    }

    private static void dropDown1(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        WebElement staticDropbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select dropdown = new Select(staticDropbox);
        dropdown.selectByValue("az");

        //driver.findElement(By.xpath("//select/option[1]")).click();
        List<WebElement> labels = driver.findElements(By.xpath("(//div[@class='inventory_item_name'])"));
        for (int i = 0; i < labels.size() - 1; i++) {
            if(labels.get(i).getText().compareTo(labels.get(i + 1).getText()) > 0){
                System.out.println("TEST IS FAILED!");
                System.exit(-1);
            }
        }
        System.out.println("TEST PASSED!");

        driver.quit();
    }

    private static void testCase7(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);
        List<WebElement> addToChartButtons = driver.findElements(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']"));

        for (int i = 0; i < addToChartButtons.size(); i++) {
            addToChartButtons.get(i).click();
            Assert.assertEquals(driver.findElement(By.xpath("//a/span")).getText(), (i + 1) + "");
        }

        driver.quit();
    }

    private static void testCase6(WebDriver driver) {
        driver = getWebDriver();
        logInPage(driver);

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        for (WebElement button:addToCartButtons) {
            button.click();
        }
        WebElement cartButton = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));

        int numbersOfCart = Integer.parseInt(cartButton.getText());
        Assert.assertEquals(numbersOfCart, addToCartButtons.size());

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        Assert.assertEquals(numbersOfCart, listOfProducts.size());

        driver.quit();
    }

    private static void testCase5(WebDriver driver) throws InterruptedException {
        driver = getWebDriver();
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

    private static void testCase4(WebDriver driver) {
        driver = getWebDriver();
        driver.findElement(By.id("user-name")).sendKeys("ahmet");
        driver.findElement(By.id("password")).sendKeys("mehmet");
        driver.findElement(By.id("login-button")).click();

        String text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        Assert.assertEquals(text,"Epic sadface: Username and password do not match any user in this service");
        driver.quit();
    }

    private static void testCase3(WebDriver driver) {
        driver = getWebDriver();
        driver.findElement(By.id("user-name")).sendKeys("ahmet");
        driver.findElement(By.id("password")).sendKeys("mehmet");
        driver.findElement(By.id("login-button")).click();

        String text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        Assert.assertEquals(text,"Epic sadface: Username and password do not match any user in this service");
        driver.quit();
    }

    private static void testCase2(WebDriver driver) {
        driver = getWebDriver();
        driver.findElement(By.id("user-name")).sendKeys("ahmet");
        driver.findElement(By.id("password")).sendKeys("mehmet");
        driver.findElement(By.id("login-button")).click();

        String text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        Assert.assertEquals(text,"Epic sadface: Username and password do not match any user in this service");
        driver.quit();
    }

    private static WebDriver getWebDriver() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\idris\\Desktop\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }

    private static void testCase1(WebDriver driver) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.quit();
    }

}
