import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void puzzleMaker_forAnyStringInputWithoutVowels_string() {
    App testPuzzle = new App();
    assertEquals("why", testPuzzle.puzzleMaker("why"));
  }
}
