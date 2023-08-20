package com.techreturners.exercise005;

import com.techreturners.exercise001.User;

import java.util.ArrayList;
import java.util.List;

public class Exercise005 {
    // This is my solution, right or wrong, creating a list of
    // all the characters in the English alphabet. The second
    // part of each element in the list is a boolean. If a letter
    // of the input string evaluated can be found in the list, then
    // the accompanying boolean field will be set to true. The plan is,
    // assuming the string being evaluated IS a pangram, none of the
    // boolean fields will have a value of false, they will all be true.
    public List<Alphabet> setLettersOfAlphabet() {

        List<Alphabet> lettersOfAlphabet = new ArrayList<Alphabet>();

        Alphabet a1 = new Alphabet('A', false);
        Alphabet a2 = new Alphabet('B', false);
        Alphabet a3 = new Alphabet('C', false);
        Alphabet a4 = new Alphabet('D', false);
        Alphabet a5 = new Alphabet('E', false);
        Alphabet a6 = new Alphabet('F', false);
        Alphabet a7 = new Alphabet('G', false);
        Alphabet a8 = new Alphabet('H', false);
        Alphabet a9 = new Alphabet('I', false);
        Alphabet a10 = new Alphabet('J', false);
        Alphabet a11 = new Alphabet('K', false);
        Alphabet a12 = new Alphabet('L', false);
        Alphabet a13 = new Alphabet('M', false);
        Alphabet a14 = new Alphabet('N', false);
        Alphabet a15 = new Alphabet('O', false);
        Alphabet a16 = new Alphabet('P', false);
        Alphabet a17 = new Alphabet('Q', false);
        Alphabet a18 = new Alphabet('R', false);
        Alphabet a19 = new Alphabet('S', false);
        Alphabet a20 = new Alphabet('T', false);
        Alphabet a21 = new Alphabet('U', false);
        Alphabet a22 = new Alphabet('V', false);
        Alphabet a23 = new Alphabet('W', false);
        Alphabet a24 = new Alphabet('X', false);
        Alphabet a25 = new Alphabet('Y', false);
        Alphabet a26 = new Alphabet('Z', false);

        lettersOfAlphabet.add(a1);
        lettersOfAlphabet.add(a2);
        lettersOfAlphabet.add(a3);
        lettersOfAlphabet.add(a4);
        lettersOfAlphabet.add(a5);
        lettersOfAlphabet.add(a6);
        lettersOfAlphabet.add(a7);
        lettersOfAlphabet.add(a8);
        lettersOfAlphabet.add(a9);
        lettersOfAlphabet.add(a10);
        lettersOfAlphabet.add(a11);
        lettersOfAlphabet.add(a12);
        lettersOfAlphabet.add(a13);
        lettersOfAlphabet.add(a14);
        lettersOfAlphabet.add(a15);
        lettersOfAlphabet.add(a16);
        lettersOfAlphabet.add(a17);
        lettersOfAlphabet.add(a18);
        lettersOfAlphabet.add(a19);
        lettersOfAlphabet.add(a20);
        lettersOfAlphabet.add(a21);
        lettersOfAlphabet.add(a22);
        lettersOfAlphabet.add(a23);
        lettersOfAlphabet.add(a24);
        lettersOfAlphabet.add(a25);
        lettersOfAlphabet.add(a26);

        return lettersOfAlphabet;
    }

    public boolean isPangram(String input) {
        // Create a list of all 26 letters of the alphabet
        List<Alphabet> EnglishAlphabet = setLettersOfAlphabet();

        if (!input.isEmpty())
        {
            return false;
        }

        int lengthOfInputString = input.length();

        for (int i = 0; i <= lengthOfInputString; i++)
        {
            Character letterOfString = Character.toUpperCase(input.charAt(i));
            if (!Character.isWhitespace(letterOfString))
            {
                if (EnglishAlphabet.contains(letterOfString)) {

                    // What I'm trying to do is set the boolean field = true
                    // if the letter is present in the list of alphabetical characters
                }
            }
        }

        // Here I would evaluate if any elements within EnglishAlphabet are
        // NOT contained in the string that has been passed in it. If it can't
        // find any elements that match this, that means the string must be a pangram
        // and the program can return true.  Otherwise it will return false;

        return true;
    }

}
