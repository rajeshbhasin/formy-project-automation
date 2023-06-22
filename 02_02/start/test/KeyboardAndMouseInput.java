import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/rajeshbhasin/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Rajesh Bhasin");

        WebElement button = driver.findElement(By.id("button"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        button.click();
        driver.quit();
    }
}
