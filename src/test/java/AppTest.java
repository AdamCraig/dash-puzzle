import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

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

  @Test
  public void solveThePuzzle_forExactGuessMatch_stringSayingThatsCorrect() {
    App testPuzzle = new App();
    assertEquals("That's correct!", testPuzzle.solveThePuzzle("puppy"));
  }
}
