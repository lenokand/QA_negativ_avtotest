import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenoka\\IdeaProjects\\Dz7\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.papirus.com.ua/");// куда подключаемся

        driver.close();
//        WebElement element = new driver.findElement(By.ByXPath);
    }

}
