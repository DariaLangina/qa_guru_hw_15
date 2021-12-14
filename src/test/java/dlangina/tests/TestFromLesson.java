package dlangina.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codeborne.selenide.Configuration;
import dlangina.config.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestFromLesson {

  public WebDriver driver = new WebDriverProvider().get();

  @BeforeAll

  static void setupClass() {
    WebDriverManager.chromedriver().setup();
    WebDriverManager.firefoxdriver().setup();
    Configuration.startMaximized = true;
  }

  @AfterEach
  void tearDown() {
    driver.quit();
  }

  @Test
  public void testGithubTitle() {
    assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
  }
}
