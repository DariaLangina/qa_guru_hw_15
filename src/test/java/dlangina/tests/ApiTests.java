package dlangina.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import dlangina.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTests {

  ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

  @Test
  public void checkLocalToken() {
    assertEquals(apiConfig.getToken(), "testToken");
  }

  @Test
  public void checkApiBaseUrl() {
    System.out.println(apiConfig.getBaseUrl());
    assertThat(apiConfig.getBaseUrl()).isEqualTo("https://github.com");
  }
}
