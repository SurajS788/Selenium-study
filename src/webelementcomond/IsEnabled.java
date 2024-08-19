package webelementcomond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
       // is enabled check wheater the element is enabled or disabled and give boolean values
       WebElement element= driver.findElement(By.id("enabled-example-input"));
       WebElement disabled = driver.findElement(By.id("disabled-button"));
       WebElement enabled = driver.findElement(By.id("enabled-button"));

        System.out.println(element.isEnabled());  //true
        disabled.click();
        System.out.println(element.isEnabled());  // false
        enabled.click();
        System.out.println(element.isEnabled());  //true
        driver.close();




    }
}
