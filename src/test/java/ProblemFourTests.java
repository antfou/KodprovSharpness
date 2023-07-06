import org.example.Problem_4.ProblemFourMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemFourTests {

   ProblemFourMethods methods = new ProblemFourMethods();

   @Test
   public void calculate_expecting_5(){
       double testInputOperand1 = 2;
       double testInputOperand2 = 3;
       char testInputOperator = '+';
       double testExpectedOutput = 5;

       double actualOutput = methods.calculate(testInputOperand1, testInputOperand2, testInputOperator);
       assertEquals(testExpectedOutput, actualOutput);
   }

   @Test
    public void calculate_expecting_10() {
       double testInputOperand1 = 2;
       double testInputOperand2 = 5;
       char testInputOperator = '*';
       double testExpectedOutput = 10;

       double actualOutput = methods.calculate(testInputOperand1, testInputOperand2, testInputOperator);
       assertEquals(testExpectedOutput, actualOutput);
   }

    @Test
    public void calculate_expecting_22() {
        double testInputOperand1 = 44;
        double testInputOperand2 = 2;
        char testInputOperator = '/';
        double testExpectedOutput = 22;

        double actualOutput = methods.calculate(testInputOperand1, testInputOperand2, testInputOperator);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void calculate_expecting_negative_20() {
        double testInputOperand1 = 10;
        double testInputOperand2 = 30;
        char testInputOperator = '-';
        double testExpectedOutput = -20;

        double actualOutput = methods.calculate(testInputOperand1, testInputOperand2, testInputOperator);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperator_expecting_plus(){
       String testInput = "+";
       char testExpectedOutput = '+';

       char actualOutput = methods.fetchOperator(testInput).get(0);
       assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperator_expecting_minus_at_index_one(){
        String testInput = "+-*/";
        char testExpectedOutput = '-';

        char actualOutput = methods.fetchOperator(testInput).get(1);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperator_expecting_multiplication_at_index_three(){
        String testInput = "+++*---/";
        char testExpectedOutput = '*';

        char actualOutput = methods.fetchOperator(testInput).get(3);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperator_expecting_division_at_index_two(){
        String testInput = "123+234-123/2";
        char testExpectedOutput = '/';

        char actualOutput = methods.fetchOperator(testInput).get(2);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperands_expecting_22_at_index_zero(){
        String testInput = "22+234-123/2";
        double testExpectedOutput = 22;

        double actualOutput = methods.fetchOperands(testInput).get(0);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperands_expecting_155_at_index_one(){
        String testInput = "255/155";
        double testExpectedOutput = 155;

        double actualOutput = methods.fetchOperands(testInput).get(1);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void fetchOperands_expecting_102_at_index_three(){
        String testInput = "22+234-123/102";
        double testExpectedOutput = 102;

        double actualOutput = methods.fetchOperands(testInput).get(3);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void solveEquation_expecting_4(){
        String testInput = "2+1/3*4";
        double testExpectedOutput = 4;

        double actualOutput = methods.solveEquation(testInput);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void solveEquation_expecting_109716(){
        String testInput = "123+123/22*9812";
        double testExpectedOutput = 109716;

        double actualOutput = methods.solveEquation(testInput);
        assertEquals(testExpectedOutput, actualOutput);
    }
}
