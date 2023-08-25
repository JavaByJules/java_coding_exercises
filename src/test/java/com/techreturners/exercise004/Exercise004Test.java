package com.techreturners.exercise004;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    // Test to see what is a Gigasecond from my Date of Birth, 24th October 1968
    @Test
    public void checkGetDateTimeForMyDateOfBirth() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1968, Month.OCTOBER, 24, 5, 6, 0, 0));

        LocalDateTime expected = LocalDateTime.of(2000, Month.JULY, 2, 6, 52, 40);

        assertEquals(expected, ex004.getDateTime());
    }

}
