package javascriptexecutertoscrool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWebElement {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        WebElement element= driver.findElement(By.xpath("//img[@alt='Crompton Optime 78 cm 4 Burners Built-in Glass HOB with Digital Timer, Full Brass Burners & 3D Flame Technology...']"));

        JavascriptExecutor je =(JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();",element);
    }
}