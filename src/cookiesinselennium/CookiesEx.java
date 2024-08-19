package cookiesinselennium;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesEx {

    public static void main(String[] args) {

        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

        //1. to add cookies
        Cookie cookie = new Cookie("Suraj","singh");
        driver.manage().addCookie(cookie);

        //2. to delete cookies by name
    //    driver.manage().deleteCookieNamed("Suraj");

        //5.delete all
        driver.manage().deleteAllCookies();

        //3. to print all cookies
        Set<Cookie> allcookies= driver.manage().getCookies();

        for( Cookie c: allcookies){
            System.out.println(c);}

        //4.to find cookies by name
      //  System.out.println(driver.manage().getCookieNamed("Suraj"));

        driver.close();
    }
}
