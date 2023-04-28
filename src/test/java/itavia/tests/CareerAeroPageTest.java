package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Dmitriy.Golovanov")
public class CareerAeroPageTest extends TestBase {

  @DisplayName("Страница CARRIER содержит информацию об CARRIER.AERO")
  @Test
  void openCarrierAeroPage() {
    step("Открытие страницы АйТи-Авиа", () -> {
      itAviaPage.openPageItAvia();
    });
    step("Открытие страницы CARRIER", () -> {
      careerPage.openCareerPage();
    });
    step("Проверка, что страница содержит информацию о CARRIER.AERO", () -> {
      careerPage.verifyCareerAero();
    });
  }
}
