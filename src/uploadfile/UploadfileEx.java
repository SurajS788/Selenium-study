package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadfileEx {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement element = driver.findElement(By.id("file-upload"));
        element.sendKeys("C:\\Users\\HP\\Downloads\\scream statment.xlsx");

        driver.findElement(By.id("file-submit")).click();

       WebElement uploadelement= driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
       if(uploadelement.isDisplayed()) {
           System.out.println("uploaded successfully");
       }else {
           System.out.println("unsusseful");
       }
       driver.close();
       }



    }

