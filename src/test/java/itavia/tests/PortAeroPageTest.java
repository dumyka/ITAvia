package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Dmitriy.Golovanov")
public class PortAeroPageTest extends TestBase {
  @DisplayName("Страница PORT содержит информацию о PORT.AERO")
  @Test
  void openPortAeroPage() {
    step("Открытие страницы АйТи-Авиа", () -> {
      itAviaPage.openPageItAvia();
    });
    step("Открытие страницы PORT", () -> {
      portAeroPage.openPortPage();
    });
    step("Проверка, что страница содержит информацию о PORT.AERO", () -> {
      portAeroPage.verifyPortAero();
    });
  }
}
