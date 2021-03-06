import org.fluentlenium.adapter.FluentTest;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("You may not know it, but you've entered Word Puzzle Land (TM).");
  }

  @Test
  public void puzzleMaker() {
    goTo("http://localhost:4567");
    fill("#word").with("DOGS ARE COOL");
    submit(".btn");
    assertThat(pageSource()).contains("D-GS -R- C--L");
  }

  @Test
  public void puzzleMaker_noVowelsFound() {
    goTo("http://localhost:4567");
    fill("#word").with("whyWhyWHY");
    submit(".btn");
    assertThat(pageSource()).contains("whyWhyWHY");
  }

  @Test
  public void puzzleMaker_forAnyStringInputWithoutVowels_string() {
    App testPuzzle = new App();
    assertEquals("why", testPuzzle.puzzleMaker("why"));
  }

  @Test
  public void puzzleMaker_forASingleWordInputWithVowels_stringWithDashesInPlaceOfVowels() {
    App testPuzzle = new App();
    assertEquals("m-yb-", testPuzzle.puzzleMaker("maybe"));
  }

  @Test
  public void puzzleMaker_forMultipleWordInputWithVowels_stringWithDashesInPlaceOfVowels() {
    App testPuzzle = new App();
    assertEquals("-nd-rst-nd-ng -s - sk-ll", testPuzzle.puzzleMaker("understanding is a skill"));
  }

  @Test
  public void puzzleMaker_forMultipleWordInputWithVowelsAndCapitalLetters_stringWithDashesInPlaceOfVowels() {
    App testPuzzle = new App();
    assertEquals("D-GS -R- C--L", testPuzzle.puzzleMaker("DOGS ARE COOL"));
  }
}
