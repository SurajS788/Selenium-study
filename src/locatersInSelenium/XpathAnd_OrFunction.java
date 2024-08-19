package locatersInSelenium;

import findElement.FindElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAnd_OrFunction {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

      //AND method is used when all the two locaters is correct
     /*   WebElement element = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
         element.sendKeys("suraj singh");          */

         // OR method if any 1 of the two locater  is correct
        WebElement element = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
        element.sendKeys("suraj singh");

    }
}


