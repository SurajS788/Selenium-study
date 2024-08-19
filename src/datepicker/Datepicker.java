package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Datepicker {

    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement element= driver.findElement(By.id("datepicker"));
        element.click();

        List<WebElement> allelement = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::td/a"));

        for(WebElement c : allelement){
            if( c.getText().equalsIgnoreCase("12")) {
                c.click();
            }break;
            }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
        driver.close();








    }
}
