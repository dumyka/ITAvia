package itavia.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import itavia.config.WebDriverConfig;
import itavia.pages.AgencyAeroPage;
import itavia.pages.CareerAeroPage;
import itavia.pages.ItAviaPage;
import itavia.pages.RequisitesPage;
import itavia.config.WebDriverProvider;
import itavia.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import itavia.pages.EdiflyAeroPage;
import itavia.pages.PortAeroPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
  ItAviaPage itAviaPage = new ItAviaPage();
  CareerAeroPage careerPage = new CareerAeroPage();
  AgencyAeroPage agencyAeroPage = new AgencyAeroPage();
  PortAeroPage portAeroPage = new PortAeroPage();
  EdiflyAeroPage ediflyAeroPage = new EdiflyAeroPage();
  RequisitesPage requisitesPage = new RequisitesPage();


  @BeforeAll
  static void beforeAll() {

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

