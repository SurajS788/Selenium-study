package action_and_actionsclass.mousebasedactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Doubleclick {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2019/11/double-click.html");

        WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(element).pause(Duration.ofSeconds(5)).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();




    }
}
