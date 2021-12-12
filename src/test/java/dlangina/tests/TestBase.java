package dlangina.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

  @BeforeAll
  static void setupClass() {
    WebDriverManager.chromedriver().setup();
    WebDriverManager.firefoxdriver().setup();
  }
}
