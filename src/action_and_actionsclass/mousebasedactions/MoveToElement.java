package action_and_actionsclass.mousebasedactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElement {
    //to moving mouse to an element
    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).pause(Duration.ofSeconds(4))
                .perform();




    }
}
