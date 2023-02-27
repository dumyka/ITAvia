package itavia.tests.config;

import org.aeonbits.owner.Config;
@Config.Sources({
    "classpath:local.properties"
})
public interface WebDriverConfig extends Config {

  @Key("baseUrl")
  @DefaultValue("https://www.itavia.ru/")
  String getBaseUrl();

  @Key("browser")
  @DefaultValue("CHROME")
  String getBrowser();

  @Key("version")
  @DefaultValue("100.0")
  String getBrowserVersion();

  @Key("remoteUrl")
  String getRemoteURL();
}
