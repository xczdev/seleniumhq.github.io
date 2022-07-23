package dev.selenium.getting_started;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InstallDriversTest {
    @Test
    public void chromedriver() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.quit();
    }

    @Test
    public void msedgedriver() {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.quit();
    }

    @Test
    public void geckodriver() {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.quit();
    }

    @Test
    public void iedriver() {
        Assumptions.assumeTrue(Platform.getCurrent().equals(Platform.WINDOWS), "IE only available on Windows");

        WebDriverManager.iedriver().setup();

        WebDriver driver = new InternetExplorerDriver();

        driver.quit();
    }

    @Test
    public void safaridriver() {
        Assumptions.assumeTrue(Platform.getCurrent().equals(Platform.MAC), "IE only available on Mac");

        WebDriverManager.safaridriver().setup();

        WebDriver driver = new SafariDriver();

        driver.quit();
    }
}
