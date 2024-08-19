package browsereOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {
    //work without binary
    public static void main(String[] args) {


    System.setProperty("Webdriver.edge.driver","D:\\Automation\\webDrivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get("https://edso.in/");




    }}
