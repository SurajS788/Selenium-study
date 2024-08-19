package action_and_actionsclass.mousebasedactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDrop {

    public static void main(String[] args) {


        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        WebElement element = driver.findElement(By.id("draggable"));
        WebElement element2 = driver.findElement(By.id("droppable"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(element, element2)
                .pause(Duration.ofSeconds(3))
                .perform();

    }
}