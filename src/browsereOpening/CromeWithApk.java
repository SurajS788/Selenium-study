package browsereOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class CromeWithApk {
    public static void main(String[] args) throws IllegalStateException {
        ChromeOptions chromeoptions= new ChromeOptions();
        chromeoptions.setBinary("D:\\Automation\\webbrowser\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver(chromeoptions);
        driver.get("https://edso.in/");
    }
}