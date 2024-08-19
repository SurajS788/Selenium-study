package webelementcomond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeySubmitClearClickMethod {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        WebElement element =  driver.findElement(By.id("twotabsearchtextbox"));
                element.sendKeys("mobiles");
              //  element.clear();
                element.submit();

      // driver.findElement(By.id("nav-search-submit-button")).click();



    }

}
