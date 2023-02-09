package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageItAvia {
  private final String TEXT = "Инвенторная система бронирования грузовых авиперевозок";
  private final String TEXT2 = "ООО «АйТи Авиа»";
  private final String TEXT3 = "CARRIER.AERO";
  private final String TEXT4 = "AGENCY.AERO";
  private final String TEXT5 = "PORT.AERO";
  private final String TEXT6 = "EDIFLY - Innovative Software SARL";

  public PageItAvia openPageItAvia() {
    open("https://www.itavia.ru/");
    $("#comp-jmjesc8m").shouldHave(text(TEXT));
    return this;
  }

  public PageItAvia requisites() {
    $("#SITE_FOOTER").$(byText("Реквизиты")).click();
    return this;
  }

  public PageItAvia verifyRequisites() {
    $("#comp-ju2i994o").shouldHave(text(TEXT2));
    return this;
  }

  public PageItAvia careerPage() {
    $("#SITE_HEADER").$("#comp-jmqkhoot").click();
    return this;
  }

  public PageItAvia verifyCareerAero() {
    $("[data-testid=richTextElement]").shouldHave(text(TEXT3));
    return this;
  }

  public PageItAvia agencyPage() {
    $("#SITE_HEADER").$("#comp-jmqkixgz").click();
    return this;
  }

  public PageItAvia verifyAgencyAero() {
    $("#comp-jmsuqhqb").shouldHave(text(TEXT4));
    return this;
  }

  public PageItAvia portPage() {
    $("#SITE_HEADER").$("#comp-jmqkj9sy").click();
    return this;
  }

  public PageItAvia verifyPortAero() {
    $("#comp-jmsv1ae2").shouldHave(text(TEXT5));
    return this;
  }

  public PageItAvia ediflyPage() {
    $("#SITE_HEADER").$("#comp-jmqkjioj").click();
    return this;
  }

  public PageItAvia verifyEdiflyAero() {
    $("#comp-jmsswdte").shouldHave(text(TEXT6));
    return this;
  }

  public PageItAvia logoSite() {
    $("#comp-kfmr2u24").click();
    return this;
  }

  public PageItAvia verifyMainPage() {
    $("#comp-jmjesc8m").shouldHave(text(TEXT));
    return this;
  }

}
