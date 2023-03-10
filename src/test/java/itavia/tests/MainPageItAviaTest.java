package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageItAviaTest extends TestBase {

  @DisplayName("Страница Реквизиты содержит реквизиты компании OOO АйТи Авиа ")
  @Owner("Dmitriy.Golovanov")
  @Test
  void companyDetails() {
    step("Открытие страницы АйТи-Авиа", () -> {
      pageItAvia.openPageItAvia();
    });
    step("Открытие страницы с реквизитами", () -> {
      pageItAvia.requisites();
    });
    step("Проверка, что реквизиты принадлежат АйТи-Авиа", () -> {
      pageItAvia.verifyRequisites();
    });
  }

  @DisplayName("Страница CARRIER содержит информацию об CARRIER.AERO")
  @Owner("Dmitriy.Golovanov")
  @Test
  void carrierAero() {
    step("Открытие страницы АйТи-Авиа", () -> {
      pageItAvia.openPageItAvia();
    });
    step("Открытие страницы CARRIER", () -> {
      pageItAvia.careerPage();
    });
    step("Проверка, что страница содержит информацию о CARRIER.AERO", () -> {
      pageItAvia.verifyCareerAero();
    });
  }

  @DisplayName("Страница AGENCY содержит информацию об AGENCY.AERO")
  @Owner("Dmitriy.Golovanov")
  @Test
  void agencyAero() {
    step("Открытие страницы АйТи-Авиа", () -> {
      pageItAvia.openPageItAvia();
    });
    step("Открытие страницы AGENCY", () -> {
      pageItAvia.agencyPage();
    });
    step("Проверка, что страница содержит информацию об AGENCY.AERO ", () -> {
      pageItAvia.verifyAgencyAero();
    });
  }

  @DisplayName("Страница PORT содержит информацию о PORT.AERO")
  @Owner("Dmitriy.Golovanov")
  @Test
  void portAero() {
    step("Открытие страницы АйТи-Авиа", () -> {
      pageItAvia.openPageItAvia();
    });
    step("Открытие страницы PORT", () -> {
      pageItAvia.portPage();
    });
    step("Проверка, что страница содержит информацию о PORT.AERO", () -> {
      pageItAvia.verifyPortAero();
    });
  }

  @DisplayName("Cтраница EDIFLY содержит информацию о EDIFLY - Innovative Software SARL")
  @Owner("Dmitriy.Golovanov")
  @Test
  void ediFly() {
    step("Открытие страницы АйТи-Авиа", () -> {
      pageItAvia.openPageItAvia();
    });
    step("Открытие страницы EDIFLY", () -> {
      pageItAvia.ediflyPage();
    });
    step("Проверка, что страница содержит информацию об EDIFLY - Innovative Software SARL", () -> {
      pageItAvia.verifyEdiflyAero();
    });

  }

  @DisplayName("Переход на главную страницу при клике на лого сайта")
  @Owner("Dmitriy.Golovanov")
  @Test
  void goMainPageByLogo() {
    step("Открытие страницы АйТи-Авиа", () -> {
      pageItAvia.openPageItAvia();
    });
    step("Открытие страницы с реквизитами", () -> {
      pageItAvia.requisites();
    });
    step("Нажатие на логотип сайта", () -> {
      pageItAvia.logoSite();
    });
    step("Проверка, что переход осуществился на главную страницу", () -> {
      pageItAvia.verifyMainPage();
    });

  }
}
