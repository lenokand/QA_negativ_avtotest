import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main extends Methods{
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenoka\\IdeaProjects\\Dz7\\src\\test\\java\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.papirus.com.ua/");// куда подключаемся
////       WebElement element = new driver.findElement(By.ByXPath("/html/body/div[2]/header/div[2]/div/div[5]/button"));
//        driver.close();
////все это прописали в методе конект
//    }
@Test(description = "first test")
    public static void FirstTest() throws InterruptedException {

    ClickButton("/html/body/div[2]/header/div[2]/div/div[5]/button");
//    WaitLoadPage(3000);
    ClickButton("/html/body/div[2]/header/div[2]/div/div[5]/div/div/div/ul/li[2]");
    SendKeys("/html/body/div[2]/header/div[2]/div/div[5]/div/div/div/div/div[2]/form/div[1]/input", "Имя");
//    Thread.sleep(3000);//затормози на столько секунд


    SendKeys("//*[@id=\"auth-popup\"]/div/div/div/div[2]/form/div[2]/input", "test@gmail.com");
    SendKeys("//*[@id=\"auth-popup\"]/div/div/div/div[2]/form/div[3]/input", "0501234567");
    SendKeys("//*[@id=\"auth-popup\"]/div/div/div/div[2]/form/div[4]/input", "123456");
    SendKeys("//*[@id=\"auth-popup\"]/div/div/div/div[2]/form/div[5]/input", "123456");
    WaitLoadPage(3000);
    ClickButton("//*[@id=\"auth-popup\"]/div/div/div/div[2]/form/button");
}
}
