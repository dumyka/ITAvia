package itavia.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import itavia.tests.config.WebDriverConfig;
import itavia.tests.config.WebDriverProvider;
import itavia.tests.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import itavia.tests.pages.AgencyAeroPage;
import itavia.tests.pages.CareerAeroPage;
import itavia.tests.pages.EdiflyAeroPage;
import itavia.tests.pages.PortAeroPage;
import itavia.tests.pages.RequisitesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import itavia.tests.pages.ItAviaPage;

public class TestBase {
  ItAviaPage itAviaPage = new ItAviaPage();
  CareerAeroPage careerPage = new CareerAeroPage();
  AgencyAeroPage agencyAeroPage = new AgencyAeroPage();
  PortAeroPage portAeroPage = new PortAeroPage();
  EdiflyAeroPage ediflyAeroPage = new EdiflyAeroPage();
  RequisitesPage requisitesPage = new RequisitesPage();
  private static WebDriverConfig config;


  @BeforeAll
  static void beforeAll() {

    WebDriverProvider provider = new WebDriverProvider();

    new WebDriverProvider().createWebDriver();
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
    Selenide.closeWebDriver();
  }
}

