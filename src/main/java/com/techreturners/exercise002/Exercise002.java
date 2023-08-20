package com.techreturners.exercise002;

import com.techreturners.exercise001.User;

import java.util.List;

public class Exercise002 {

    public boolean isFromManchester(Person person ) {
        return person.city.equals("Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.age >= ageLimit)
        {
            return true;
        }
        return false;
    }
    
}
