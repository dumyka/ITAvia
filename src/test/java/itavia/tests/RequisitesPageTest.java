package itavia.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Dmitriy.Golovanov")
public class RequisitesPageTest extends TestBase {

  @DisplayName("Страница Реквизиты содержит реквизиты компании OOO АйТи Авиа ")
  @Test
  void checkCompanyInformation() {
    step("Открытие страницы АйТи-Авиа", () -> {
      itAviaPage.openPageItAvia();
    });
    step("Открытие страницы с реквизитами", () -> {
      requisitesPage.clickRequisites();
    });
    step("Проверка, что реквизиты принадлежат АйТи-Авиа", () -> {
      requisitesPage.verifyRequisites();
    });
  }

}
