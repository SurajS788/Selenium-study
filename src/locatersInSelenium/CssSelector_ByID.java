package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_ByID {
    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //first method
      //  WebElement element =driver.findElement(By.cssSelector("input[type='text']"));
        //second method using # instead of attribute
        WebElement element =driver.findElement(By.cssSelector("input#email"));
        element.sendKeys("Enter  value");


    }
}
