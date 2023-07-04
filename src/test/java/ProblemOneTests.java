import org.example.Problem_1.ProblemOneMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemOneTests {

    ProblemOneMethods methods = new ProblemOneMethods();

    @Test
    public void isAnagram_Nirvana_GreenDay_expecting_false(){
        String testInput1 = "Nirvana";
        String testInput2 = "Green Day";
        assertFalse(methods.isAnagram(testInput1,testInput2));
    }

    @Test
    public void isAnagram_Militar_Ebba_expecting_false(){
        String testInput1 = "Militär";
        String testInput2 = "Ebba";
        assertFalse(methods.isAnagram(testInput1,testInput2));
    }

    @Test
    public void isAnagram_Tom_Marvolo_Riddle_expecting_true(){
        String testInput1 = "Tom Marvolo Riddle";
        String testInput2 = "I am Lord Voldemort";
        assertTrue(methods.isAnagram(testInput1,testInput2));
    }

    @Test
    public void isAnagram_Army_Mary_expecting_true(){
        String testInput1 = "army";
        String testInput2 = "Mary";
        assertTrue(methods.isAnagram(testInput1,testInput2));
    }

}