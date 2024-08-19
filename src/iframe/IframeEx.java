package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeEx {
    public static void main(String[] args) {


        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        List<WebElement> element = driver.findElements(By.tagName("iframe"));
        System.out.println(element.size());
       // 1.ByIndex  driver.switchto().frame(0)

        // 2. By Name/id
     //   driver.switchTo().frame("frame1");

        //3. by webelement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement frameelement = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(frameelement.getText());

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();


        driver.close();

    }
}
