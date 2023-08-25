package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {

        if (input.isEmpty())
        {
            return false;
        }

        input = input.toLowerCase();

        for (Character ch = 'a'; ch <= 'z'; ch++)
        {
            // Checks if the string does not contain the value of ch
            if (!input.contains(String.valueOf(ch)))
            {
                // It's not a pangram, therefore exit immediately
                return false;
            }
        }

        // The end of the loop has been reached and
        // all 26 letters of the alphabet are present -
        // if a letter was missing the program would
        // have exited before now.
        return true;
    }

}
