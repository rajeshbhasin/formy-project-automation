import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rajeshbhasin/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Rajesh");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Bhasin");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Engineering Manager");
        Thread.sleep(3000);

        WebElement radioButton = driver.findElement(By.id("radio-button-3"));
        radioButton.click();
        WebElement checkBox = driver.findElement(By.id("checkbox-1"));
        checkBox.click();
        Thread.sleep(3000);

        WebElement dropdown = driver.findElement(By.id("select-menu"));
        dropdown.click();
        Thread.sleep(3000);
        WebElement option = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[5]"));
        option.click();
        Thread.sleep(3000);

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("09/15/1986");
        datePicker.sendKeys(Keys.ENTER);


        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert")));
        String text = alert.getText();
        Assert.assertEquals(text,"The form was successfully submitted!");


        Thread.sleep(3000);


        driver.quit();
    }
}
