import org.example.Problem_3.ProblemThreeMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProblemThreeTests {

    ProblemThreeMethods methods = new ProblemThreeMethods();

    @Test
    void calculate_expecting_3_addition() {
        String testInput = "2+1";
        int result = methods.calculate(testInput);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void calculate_expecting_1_subtraction() {
        String testInput = "2-1";
        int result = methods.calculate(testInput);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void calculate_expecting_1_multiplication() {
        String testInput = "2*1";
        int result = methods.calculate(testInput);
        int expected = 2;
        assertEquals(expected, result);
    }
    @Test
    void calculate_expecting_2_division() {
        String testInput = "2/1";
        int result = methods.calculate(testInput);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void fetchOperator_expecting_plus_char() {
        String testInput = "1+2";
        char result = methods.fetchOperator(testInput);
        char expected = '+';
        assertEquals(expected, result);
    }

    @Test
    void fetchOperator_expecting_minus_char() {
        String testInput = "1-2";
        char result = methods.fetchOperator(testInput);
        char expected = '-';
        assertEquals(expected, result);
    }

    @Test
    void fetchOperator_expecting_division_char() {
        String testInput = "1/2";
        char result = methods.fetchOperator(testInput);
        char expected = '/';
        assertEquals(expected, result);
    }

    @Test
    void fetchOperator_expecting_multiplication_char() {
        String testInput = "1*2";
        char result = methods.fetchOperator(testInput);
        char expected = '*';
        assertEquals(expected, result);
    }

    @Test
    void fetchOperator_expecting_assert_NOT_equals() {
        char expected1and2 = '*';
        char expected3and4 = '+';

        String testInput1 = "1+2";
        char result1 = methods.fetchOperator(testInput1);

        String testInput2 = "1-2";
        char result2 = methods.fetchOperator(testInput2);

        String testInput3 = "1/2";
        char result3 = methods.fetchOperator(testInput3);

        String testInput4 = "1*2";
        char result4 = methods.fetchOperator(testInput4);

        assertNotEquals(expected1and2, result1);
        assertNotEquals(expected1and2, result2);
        assertNotEquals(expected3and4, result3);
        assertNotEquals(expected3and4, result4);
    }
}