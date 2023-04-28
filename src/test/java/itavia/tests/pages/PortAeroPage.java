package itavia.tests.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PortAeroPage {

  private final String PORT_AERO = "PORT.AERO";

  public PortAeroPage openPortPage() {
    $("#SITE_HEADER").$("#comp-jmqkj9sy").click();
    return this;
  }

  public PortAeroPage verifyPortAero() {
    $("#comp-jmsv1ae2").shouldHave(text(PORT_AERO));
    return this;
  }
}
