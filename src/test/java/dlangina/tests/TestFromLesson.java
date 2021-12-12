package dlangina.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dlangina.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class TestFromLesson extends TestBase {

  public WebDriver driver = new WebDriverProvider().get();

  @AfterEach
  void tearDown() {
    driver.quit();
  }

  @Test
  public void testGithubTitle() {
    assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
  }
}
