package cs3500.learnmath;

import java.util.ArrayList;
import java.util.Random;

public class ProblemSet {
  private ArrayList<MathProblem> problemSet= new ArrayList<> ();

  public void generateProblems (int countToGenerate) {
    Random r = new Random();
    for (int i = 0; i < countToGenerate; i++) {
      MathProblem p = new AdditionMathProblem(r.nextInt() % 10, r.nextInt() % 10);
    }
  }
}
