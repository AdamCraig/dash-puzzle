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
}
