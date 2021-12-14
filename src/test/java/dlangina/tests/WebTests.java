package dlangina.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import dlangina.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class WebTests {

  @Test
  public void webLocaleTest() {
    System.setProperty("environment", "chromeLocal");
    WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    assertThat(webConfig.getBrowser()).isEqualTo("FIREFOX");
    assertThat(webConfig.getBrowserVersion()).isEqualTo("96.0");
    assertThat(webConfig.getBrowserSize()).isEqualTo("1024x768");
  }

  @Test
  public void webRemoteTest() {
    System.setProperty("environment", "selenoid");
    WebConfig webConfig = ConfigFactory.create(WebConfig.class,
                                               System.getProperties());

    assertThat(webConfig.getBrowser()).isEqualTo("FIREFOX");
    assertThat(webConfig.getBrowserVersion()).isEqualTo("91.0");
    assertThat(webConfig.getBrowserSize()).isEqualTo("1024x768");
    assertThat(webConfig.getRemoteWebDriver()).isEqualTo(
        "https://user1:1234@selenoid.autotests.cloud/wd/hub/");

  }
}
