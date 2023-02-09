package tests;

import com.codeborne.selenide.Configuration;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.PageItAvia;

public class TestBase {
  PageItAvia pageItAvia = new PageItAvia();


  @BeforeAll
  static void beforeAll() {
    //Configuration.timeout=300000;
    // Configuration.pageLoadStrategy = "eager";
    Configuration.browserSize = "1920x1080";
    //Configuration.holdBrowserOpen = true;
    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    Configuration.browser = "chrome";
    Configuration.browserVersion = "100.0";
    Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
    Configuration.browser = System.getProperty("browser", "chrome");
    Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
    Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
        "enableVNC", true,
        "enableVideo", true
    ));

    Configuration.browserCapabilities = capabilities;
  }
}
