package browsereOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;

public class Firefox {
    public static void main(String[] args)  throws InterruptedException {
        FirefoxOptions Options =new FirefoxOptions();
        Options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        System.setProperty("WebDriver.gecko.driver","D:\\Automation\\webDrivers\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver(Options);
        driver.get("https://edso.in/");
        Thread.sleep(5000);
        driver.close();
    }
    }

