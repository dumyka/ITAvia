package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Dmitriy.Golovanov")
public class EdiflyAeroTest extends TestBase{

  @DisplayName("Cтраница EDIFLY содержит информацию о EDIFLY - Innovative Software SARL")
  @Test
  void openEdiFlyPage() {
    step("Открытие страницы АйТи-Авиа", () -> {
      itAviaPage.openPageItAvia();
    });
    step("Открытие страницы EDIFLY", () -> {
      ediflyAeroPage.openEdiflyPage();
    });
    step("Проверка, что страница содержит информацию об EDIFLY - Innovative Software SARL", () -> {
      ediflyAeroPage.verifyEdiflyAero();
    });

  }
}
