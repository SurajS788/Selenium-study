package webelementcomond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) {


        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement benz = driver.findElement(By.id("benzradio"));

// is selected is used to check the radio button
        System.out.println(benz.isSelected());  //false
        benz.click();
        System.out.println(benz.isSelected());  //true
        driver.close();
    }
}