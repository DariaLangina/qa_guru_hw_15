package dlangina.config;

import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

  @Key("browser")
  @DefaultValue("CHROME")
  Browser getBrowser();

  @Key("remoteUrl")
  URL getRemoteUrl();

  @Key("baseUrl")
  @DefaultValue("https://github.com")
  String getBaseUrl();

  @Key("browserVersion")
  @DefaultValue("96.0")
  String browserVersion();

  @Key("browserSize")
  @DefaultValue("1920x1080")
  String browserSize();

  @Key("remoteDriverUrl")
  String remoteDriverUrl();
}
