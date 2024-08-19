package webelementcomond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement element= driver.findElement(By.id("displayed-text"));
        WebElement hidebtn= driver.findElement(By.id("hide-textbox"));
        WebElement showbtn= driver.findElement(By.id("show-textbox"));

        System.out.println(element.isDisplayed());  //true
        hidebtn.click();
        System.out.println(element.isDisplayed());  // false
        showbtn.click();
        System.out.println(element.isDisplayed());  //true
        driver.close();



    }
}
