import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rajeshbhasin/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement tab = driver.findElement(By.id("alert-button"));
        tab.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        driver.quit();
    }
}
