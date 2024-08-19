package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {


    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");

        WebElement multidropdown = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multidropdown);

        select.selectByIndex(2);
        select.selectByValue("apple");
        select.selectByVisibleText("Orange");

        //deselect statements
        select.deselectByIndex(2);
        select.deselectByValue("apple");
        select.deselectByVisibleText("Orange");

        //to deselect all
      // select.deselectAll();

    }
}