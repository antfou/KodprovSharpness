import org.example.Problem_5.ProblemFiveMethods;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProblemFiveTests {

    ProblemFiveMethods methods = new ProblemFiveMethods();

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
    public void removeOperatorFromList_expecting_0_is_addition(){
        List<Character> testInputOperatorList = List.of('-','+','*');
        char testExpectedOutput = '+';

        char actualOutput = methods.removeOperatorFromList(0, testInputOperatorList).get(0);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void removeOperatorFromList_expecting_1_is_addition(){
        List<Character> testInputOperatorList = List.of('-','-','+');
        char testExpectedOutput = '+';

        char actualOutput = methods.removeOperatorFromList(0, testInputOperatorList).get(1);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void removeOperatorFromList_expecting_1_is_multiplication(){
        List<Character> testInputOperatorList = List.of('/','+','*');
        char testExpectedOutput = '*';

        char actualOutput = methods.removeOperatorFromList(1, testInputOperatorList).get(1);
        assertEquals(testExpectedOutput, actualOutput);
    }

    @Test
    public void solveOneEquation_expecting_1_equals_12(){
        char testInputOperator = '*';
        int testInputOperatorIndex = 1;
        List<Double> testInputOperandList = List.of(1.0, 2.0,6.0);
        double expectedOutput = 12.0;

        double actualOutput = methods.solveOneEquation(testInputOperator, testInputOperatorIndex, testInputOperandList).get(1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void solveOneEquation_expecting_0_equals_1(){
        char testInputOperator = '-';
        int testInputOperatorIndex = 0;
        List<Double> testInputOperandList = List.of(2.0, 1.0,6.0);
        double expectedOutput = 1.0;

        double actualOutput = methods.solveOneEquation(testInputOperator, testInputOperatorIndex, testInputOperandList).get(0);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void solveOneEquation_expecting_0_doesNOT_equals_6(){
        char testInputOperator = '-';
        int testInputOperatorIndex = 0;
        List<Double> testInputOperandList = List.of(2.0, 1.0,6.0);
        double expectedOutput = 6.0;

        double actualOutput = methods.solveOneEquation(testInputOperator, testInputOperatorIndex, testInputOperandList).get(0);
        assertNotEquals(expectedOutput, actualOutput);
    }



}
