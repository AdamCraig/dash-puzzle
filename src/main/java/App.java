import java.util.Arrays;

public class App {
  public static void main(String[] args) {}

  public String puzzleMaker(String input) {

    String puzzleMadeFromInput = input;
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    for (char vowel : vowels) {
      puzzleMadeFromInput = puzzleMadeFromInput.replace(vowel, '-');
    }

    return puzzleMadeFromInput;
  }
}
