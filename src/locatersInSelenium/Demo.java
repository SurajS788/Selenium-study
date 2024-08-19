package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {


        System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement element =driver.findElement(By.xpath("//input[@name='email']"));
        WebElement element2 =driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys("Shiprasingh7885@gmail.com");
        element2.sendKeys("Shiprasingh");
        driver.findElement(By.xpath("//button[@value='1']")).click();

    }
}
