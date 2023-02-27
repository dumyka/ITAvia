package itavia.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import itavia.tests.config.WebDriverConfig;
import itavia.tests.config.WebDriverProvider;
import itavia.tests.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import itavia.tests.pages.PageItAvia;

public class TestBase {
  PageItAvia pageItAvia = new PageItAvia();
  private static WebDriverConfig config;


  @BeforeAll
  static void beforeAll() {

    WebDriverProvider provider = new WebDriverProvider();

  }

  @BeforeEach
  void addListener() {

    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
  }

  @AfterEach
  void addAttachments() {
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
  }
}

