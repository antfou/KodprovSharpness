import org.example.Problem_2.ProblemTwoErrorhandling;
import org.example.Problem_2.ProblemTwoMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProblemTwoTests {

    ProblemTwoMethods methods = new ProblemTwoMethods();
    ProblemTwoErrorhandling error = new ProblemTwoErrorhandling();

    @Test
    public void countHTMLtagsTest_Expecting_21(){
        String testInput1 = "http://www.google.com/";
        int expected1 = 21;
        assertEquals(expected1, methods.countHTMLtags(testInput1));
    }

    @Test
    public void countHTMLtagsTest_Expecting_27(){
        String testInput2 = "http://www.fougner.se/";
        int expected2 = 27;
        assertEquals(expected2, methods.countHTMLtags(testInput2));
    }

    @Test
    public void countHTMLtagsTest_Not_Expecting_212(){
        String testInput3 = "http://www.google.com/";
        int expected3 = 212;
        assertNotEquals(expected3, methods.countHTMLtags(testInput3));
    }

    @Test
    public void isValidUrl_url_expecting_false(){
        String testinput = "w.hejpådig.se";
        boolean expectedOutput = false;

        assertEquals(error.isValidUrl(testinput), expectedOutput);;
    }

    @Test
    public void isValidUrl_url_expecting_true(){
        String testinput = "http://www.google.com/";
        boolean expectedOutput = true;
        boolean actualOutput = error.isValidUrl(testinput);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void normalizeUrl_google_expecting_equals(){
        String testinput = "google.com";
        String expectedOutput = "https://www.google.com";
        String actualOutput = error.normalizeUrl(testinput);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void normalizeUrl_google_expecting_NOTequals(){
        String testinput = "google.com";
        String expectedOutput = "www.google.com";
        String actualOutput = error.normalizeUrl(testinput);

        assertNotEquals(actualOutput, expectedOutput);
    }
}
