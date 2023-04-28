package itavia.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CareerAeroPage {

  private final String CARRIER_AERO = "CARRIER.AERO";

  public CareerAeroPage openCareerPage() {
    $("#SITE_HEADER").$("#comp-jmqkhoot").click();
    return this;
  }

  public CareerAeroPage verifyCareerAero() {
    $("[data-testid=richTextElement]").shouldHave(text(CARRIER_AERO));
    return this;
  }
}
