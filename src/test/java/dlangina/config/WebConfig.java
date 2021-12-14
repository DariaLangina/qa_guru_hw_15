package dlangina.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${environment}.properties")
public interface WebConfig extends Config {

  @Key("browser")
  @DefaultValue("CHROME")
  String getBrowser();

  @Key("browserVersion")
  @DefaultValue("95.0")
  String getBrowserVersion();

  @Key("browserSize")
  @DefaultValue("1920x1080")
  String getBrowserSize();

  @Key("remoteWebDriver")
  String getRemoteWebDriver();
}
