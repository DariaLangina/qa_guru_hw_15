package dlangina.config;

import org.aeonbits.owner.Config;

@Config.Sources({
    "file:/tmp/api.properties",
    "classpath:config/api.properties"
})
public interface ApiConfig extends Config {

  @Key("baseUrl")
  @DefaultValue("https://www.edimdoma.ru/")
  String getBaseUrl();

  @Key("token")
  String token();
}
