package multiplewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NeedOfWindowHandle {

    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();

        String windowid=driver.getWindowHandle();
        System.out.println(windowid);
        Set<String> allwindow=driver.getWindowHandles();
        System.out.println(allwindow);

       for(String a : allwindow){
            if(!a.contentEquals(windowid)){
                driver.switchTo().window(a);
                driver.findElement(By.linkText("INTERVIEW")).click();
                driver.close();

            }
        }
       driver.switchTo().window(windowid);
        driver.close();



    }

}