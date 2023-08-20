package com.techreturners.exercise001;

import java.util.List;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        DecimalFormat twoDPlaces = new DecimalFormat("#.##");
        //Double.valueOf(twoDForm.format(d))
        return Double.valueOf(twoDPlaces.format((originalPrice/100 * vatRate) + originalPrice));
    }

    public String reverse(String sentence) {
        // Add your code here
        String stringInReverse = "";

        for (int i=0; i < sentence.length(); i++)
        {
            Character letter= sentence.charAt(i);
            stringInReverse = letter + stringInReverse;
        }
        return stringInReverse;
    }

    public int countLinuxUsers(List<User> users) {
        int countOfLinuxUsers = 0;
        for (User isLinuxUser : users) {
            if (isLinuxUser.getType().equals("Linux"))
            {
                countOfLinuxUsers++;
            }
        }
        return countOfLinuxUsers;
    }
}
