import java.util.Arrays;

public class App {
  public static void main(String[] args) {}

  public String puzzleMaker(String input) {

    String puzzleMadeFromInput = input;

    puzzleMadeFromInput = puzzleMadeFromInput.replaceAll("a", "-");
    puzzleMadeFromInput = puzzleMadeFromInput.replaceAll("e", "-");
    puzzleMadeFromInput = puzzleMadeFromInput.replaceAll("i", "-");
    puzzleMadeFromInput = puzzleMadeFromInput.replaceAll("o", "-");
    puzzleMadeFromInput = puzzleMadeFromInput.replaceAll("u", "-");

    return puzzleMadeFromInput;
  }
}
