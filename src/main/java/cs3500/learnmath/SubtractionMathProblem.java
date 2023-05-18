package cs3500.learnmath;

public class SubtractionMathProblem extends MathProblem {
  public SubtractionMathProblem(int opA, int opB) {
    super(opA, opB);
  }

  public int getAnswer() {
    return operandA - operandB;
  }

  public char getOperatorCharacter() {
    return '-';
  }
}
