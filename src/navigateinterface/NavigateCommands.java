package navigateinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
         element.click();
        // to go back in the web page
         driver.navigate().back();
         // to go forward in the webpage
         driver.navigate().forward();
        // to go refresh the web page
         driver.navigate().refresh();


    }
}
