package itavia.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import itavia.tests.config.WebDriverConfig;
import itavia.tests.config.WebDriverProvider;
import itavia.tests.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import itavia.tests.pages.PageItAvia;

public class TestBase {
  PageItAvia pageItAvia = new PageItAvia();
  private static WebDriverConfig config;


  @BeforeAll
  static void beforeAll() {
    //Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
    //Configuration.browser = System.getProperty("browser", "chrome");
    //Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
    //Configuration.remote = System.getProperty("remote");

    WebDriverProvider provider = new WebDriverProvider();


  }

  @BeforeEach
  void addListener(){
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
  }

  @AfterEach
  void addAttachments(){
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
  }
}

