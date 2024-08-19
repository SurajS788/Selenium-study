package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) {

        //find elements is use to interect with multiple element
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        List<WebElement> allelement = driver.findElements(By.tagName("input"));
        System.out.println(allelement.size());
        for( WebElement o : allelement)
        {
            System.out.println(o);
        }
    }
}
