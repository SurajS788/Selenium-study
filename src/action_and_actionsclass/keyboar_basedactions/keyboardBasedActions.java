package action_and_actionsclass.keyboar_basedactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardBasedActions {
    //keyUP     --only applicable to sift alr and control key
    //KeuDown    --only applicable to sift alr and control key
    //sendkey

    public static void main(String[] args) {


        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement element = driver.findElement(By.name("q"));

        Actions actons = new Actions(driver);
        actons.moveToElement(element).click(element)
                .keyDown(Keys.SHIFT)
                .sendKeys("cloths")
                .pause(Duration.ofSeconds(4))
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .perform();



    }
}
