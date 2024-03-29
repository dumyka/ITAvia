package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Dmitriy.Golovanov")
public class MainPageItAviaTest extends TestBase {

  @DisplayName("Переход на главную страницу при клике на лого сайта")
  @Test
  void goMainPageByLogo() {
    step("Открытие страницы АйТи-Авиа", () -> {
      itAviaPage.openPageItAvia();
    });
    step("Открытие страницы с реквизитами", () -> {
      requisitesPage.clickRequisites();
    });
    step("Нажатие на логотип сайта", () -> {
      itAviaPage.clickLogoSite();
    });
    step("Проверка, что переход осуществился на главную страницу", () -> {
      itAviaPage.verifyMainPage();
    });
  }
}
