package action_and_actionsclass.mousebasedactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHold {
    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement element = driver.findElement(By.xpath("//li[text()='F']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(element)
                .pause(Duration.ofSeconds(5))
                .release(element)
                .perform();



        driver.close();




    }
}
