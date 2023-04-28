package itavia.tests.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EdiflyAeroPage {

  private final String EDYFLY = "EDIFLY - Innovative Software SARL";

  public EdiflyAeroPage openEdiflyPage() {
    $("#SITE_HEADER").$("#comp-jmqkjioj").click();
    return this;
  }

  public EdiflyAeroPage verifyEdiflyAero() {
    $("#comp-jmsswdte").shouldHave(text(EDYFLY));
    return this;
  }
}
