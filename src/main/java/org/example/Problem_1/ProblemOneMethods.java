package org.example.Problem_1;

import java.util.Arrays;

public class ProblemOneMethods {
    public boolean isAnagram(String string1, String string2){
        char[] stringArray1 = string1
                .toLowerCase()
                .replaceAll
                        ("[^a-zA-Z0-9]", "")
                .toCharArray();

        char[] stringArray2 = string2
                .toLowerCase()
                .replaceAll
                        ("[^a-zA-Z0-9]", "")
                .toCharArray();

        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);

        return Arrays.equals(stringArray1,stringArray2);
    }
}
