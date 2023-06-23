import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Methods {
    protected static WebDriver driver;

    @BeforeClass
    public static void Connect(){
        try{
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get("https://www.papirus.com.ua/");
                    }catch(Exception e){
            System.out.println("Resource didin't download");
        }
    }
    public static void waitUntil(String selector) throws InterruptedException {
        WebElement element = (new WebDriverWait(driver, java.time.Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
//        Thread.sleep(1500);
    }

    public static void ClickButton(String xp) throws InterruptedException {

        waitUntil(xp);
        WebElement element = driver.findElement(By.xpath(xp));
        element.click();
    }
    public static void WaitLoadPage(int time) throws InterruptedException {
        Thread.sleep(time);
    }
    public static void SendKeys(String xp, String  txt) throws InterruptedException {
        waitUntil(xp);
        WebElement element = driver.findElement(By.xpath(xp));
        element.click();
        element.sendKeys(txt);
    }

    @AfterClass(alwaysRun = true)
    public static void CloseBrauser(){

//        driver.quit();
    }
}
