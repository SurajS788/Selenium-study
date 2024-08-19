package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SingleSelectDropdown {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");

        WebElement dropdown= driver.findElement(By.id("carselect"));
       // System.out.println(dropdown.isSelected());

       Select select= new Select(dropdown);
        //   to select options in dropdown
        //1.SELECT with index
//       select.selectByIndex(2);

        //2.SELECT with value
        select.selectByValue("benz");  // value is copies from inspect

       //3. SELECT by visible text
        select.selectByVisibleText("Honda"); // wrten in text form in inspect







                 //to fetch all option of dropdown
     /*   Select select= new Select(dropdown);
        List<WebElement> allelement= select.getOptions();
        for(WebElement e : allelement){
            System.out.println(e.getText());
          } */







    }
}
