package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Dmitriy.Golovanov")
public class AgencyAeroPageTest extends TestBase {

  @DisplayName("Страница AGENCY содержит информацию об AGENCY.AERO")
  @Test
  void openAgencyAeroPage() {
    step("Открытие страницы АйТи-Авиа", () -> {
      itAviaPage.openPageItAvia();
    });
    step("Открытие страницы AGENCY", () -> {
      agencyAeroPage.openAgencyPage();
    });
    step("Проверка, что страница содержит информацию об AGENCY.AERO ", () -> {
      agencyAeroPage.verifyAgencyAero();
    });
  }
}
