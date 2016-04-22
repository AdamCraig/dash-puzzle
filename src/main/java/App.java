import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public String puzzleMaker(String input) {

    String puzzleMadeFromInput = input;
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    for (char vowel : vowels) {
      puzzleMadeFromInput = puzzleMadeFromInput.replace(vowel, '-');
    }

    return puzzleMadeFromInput;
  }

  public String solveThePuzzle(String guess) {

    String correctAnswer = "puppy";

    if (guess.equals(correctAnswer)) {
      return "That's correct!";
    } else {
      return "Sorry, that's wrong.";
    }

  }
}
