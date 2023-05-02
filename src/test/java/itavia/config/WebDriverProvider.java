package itavia.config;

import com.codeborne.selenide.Configuration;
import itavia.tests.TestBase;
import java.util.Map;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverProvider extends TestBase {
  private WebDriverConfig config;

  public WebDriverProvider() {
    this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
  }

  public void createWebDriver() {
    Configuration.browser = config.getBrowser();
    Configuration.baseUrl = config.getBaseUrl();
    Configuration.browserVersion = config.getBrowserVersion();
    Configuration.remote = config.getRemoteURL();
    Configuration.browserSize = config.getBrowserSize();

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
        "enableVNC", true,
        "enableVideo", true
    ));
    Configuration.browserCapabilities = capabilities;
  }
}