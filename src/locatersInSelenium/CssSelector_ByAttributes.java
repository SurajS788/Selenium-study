package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_ByAttributes {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       // 1st method
      //  WebElement element =driver.findElement(By.cssSelector("input[type='password']"));
        //2nd method removing attribute by .
        WebElement element =driver.findElement(By.cssSelector("input.password"));
        element.sendKeys("Enter  value");
    }
}
