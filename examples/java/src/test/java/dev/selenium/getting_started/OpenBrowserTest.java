package dev.selenium.getting_started;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class OpenBrowserTest {
    @Test
    public void chromeSession() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.quit();
    }

    @Test
    public void edgeSession() {
        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);

        driver.quit();
    }

    @Test
    public void firefoxSession() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);

        driver.quit();
    }

    @Test
    public void internetExplorerSession() {
        Assumptions.assumeTrue(Platform.getCurrent().equals(Platform.WINDOWS), "IE only available on Windows");
        WebDriverManager.iedriver().setup();

        InternetExplorerOptions options = new InternetExplorerOptions();
        WebDriver driver = new InternetExplorerDriver(options);

        driver.quit();
    }

    @Test
    public void internetExplorerCompatibilitySession() {
        Assumptions.assumeTrue(Platform.getCurrent().equals(Platform.WINDOWS), "IE only available on Windows");
        WebDriverManager.iedriver().setup();

        InternetExplorerOptions options = new InternetExplorerOptions();
        options.attachToEdgeChrome();
        options.withEdgeExecutablePath(System.getenv("EDGE_PATH"));

        WebDriver driver = new InternetExplorerDriver(options);

        driver.quit();
    }

    @Test
    public void safariSession() {
        Assumptions.assumeTrue(Platform.getCurrent().equals(Platform.MAC), "IE only available on Mac");
        WebDriverManager.safaridriver().setup();

        SafariOptions options = new SafariOptions();

        WebDriver driver = new SafariDriver(options);

        driver.quit();
    }
}
