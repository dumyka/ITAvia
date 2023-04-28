package itavia.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AgencyAeroPage {

  private final String AGENCY_AERO = "AGENCY.AERO";

  public AgencyAeroPage openAgencyPage() {
    $("#SITE_HEADER").$("#comp-jmqkixgz").click();
    return this;
  }

  public AgencyAeroPage verifyAgencyAero() {
    $("#comp-jmsuqhqb").shouldHave(text(AGENCY_AERO));
    return this;
  }
}
