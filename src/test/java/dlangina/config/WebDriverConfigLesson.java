package dlangina.config;

import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfigLesson extends Config {

  // Для TestFromLesson
  @Key("browser")
  @DefaultValue("CHROME")
  Browser getBrowser();

  @Key("remoteUrl")
  URL getRemoteUrl();

  @Key("baseUrl")
  @DefaultValue("https://github.com")
  String getBaseUrl();
}
