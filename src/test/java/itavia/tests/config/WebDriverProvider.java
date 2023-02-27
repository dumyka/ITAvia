package itavia.tests.config;

import com.codeborne.selenide.Configuration;
import itavia.tests.TestBase;
import java.util.Map;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverProvider extends TestBase {
  private WebDriverConfig config;

  public WebDriverProvider() {
    this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    createWebDriver();
  }

  private void createWebDriver() {
    switch (config.getBrowser()) {
      case "chrome":
        Configuration.browser = "chrome";
        break;
      case "firefox":
        Configuration.browser = "firefox";
        break;
      default:
        throw new RuntimeException(config.getBrowser());
    }

    Configuration.baseUrl = config.getBaseUrl();
    Configuration.browserVersion = config.getBrowserVersion();
    Configuration.remote = config.getRemoteURL();

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
        "enableVNC", true,
        "enableVideo", true
    ));
    Configuration.browserCapabilities = capabilities;
  }

}