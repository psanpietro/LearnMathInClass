package cs3500.learnmath;

public class AdditionMathProblem extends MathProblem {

  AdditionMathProblem(int opA, int opB) {
    super(opA, opB);
  }

  public int getAnswer() {
    return operandA + operandB;
  }

  public char getOperatorCharacter() {
    return '+';
  }

}
