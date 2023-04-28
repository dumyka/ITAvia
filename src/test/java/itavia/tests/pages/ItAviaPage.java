package itavia.tests.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ItAviaPage {
  private final String DEVELOPMENT =
      "Разработка и развитие, внедрение и сопровождение эксплуатации" +
          " автоматизированных распределительных (дистрибутивных) систем";

  public ItAviaPage openPageItAvia() {
    open("https://www.itavia.ru/");
    $("h3.font_8").shouldHave(text(DEVELOPMENT));
    return this;
  }

  public ItAviaPage clickLogoSite() {
    $("#comp-kfmr2u24").click();
    return this;
  }

  public ItAviaPage verifyMainPage() {
    $("h3.font_8").shouldHave(text(DEVELOPMENT));
    return this;
  }
}
