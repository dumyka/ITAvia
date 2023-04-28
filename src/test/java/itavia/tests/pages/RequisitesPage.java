package itavia.tests.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RequisitesPage {
  private final String OOO_ITAVIA = "ООО «АйТи Авиа»";

  public RequisitesPage clickRequisites() {
    $("#SITE_FOOTER").$(byText("Реквизиты")).click();
    return this;
  }

  public RequisitesPage verifyRequisites() {
    $("#comp-ju2i994o").shouldHave(text(OOO_ITAVIA));
    return this;
  }
}
