package javascriptexecutertoscrool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AtmptToScroolByActionCls {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");

        WebElement element= driver.findElement(By.linkText("'Not humanly possible': Critics slam Pan's record"));

        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
        driver.close();


    }
}
