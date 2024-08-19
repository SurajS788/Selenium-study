package browsereOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeWithBinary {
    public static void main(String[] args) {

        EdgeOptions options= new EdgeOptions();
        options.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        System.setProperty("Webdriver.edge.driver","D:\\Automation\\webDrivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://edso.in/");
        driver.close();

    }
}
