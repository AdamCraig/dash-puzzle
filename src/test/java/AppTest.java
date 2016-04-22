import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void puzzleMaker_forAnyStringInput_string() {
    App testPuzzle = new App();
    String testMaker = testPuzzle.puzzleMaker("puppy");
    assertEquals(testMaker instanceof String, testPuzzle.puzzleMaker("puppy"));
  }
}
