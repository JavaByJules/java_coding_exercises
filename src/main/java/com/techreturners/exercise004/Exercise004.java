package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    // I have to confess, I have not heard of a gigasecond before. Anyway, what I would do,
    // bearing in mind the amount of days in a year can vary, as can the amount of days in
    // a month, my formula would be as follows:
    // Use % to mod the amount of whole days, then the same process to find the amount of
    // whole hours, then the same to identify the remaining minutes and seconds.
    // The formula to calculate the number of seconds in a day would be to find the value
    // of 60 (minutes) * 60 (seconds) * 24 (hours). Once this is identified, we can then
    // identify the amount of whole days in a gigasecond. Then, we can identify whole hours
    // 60 (minutes) * 60 (seconds), the whole minutes (60 seconds) and any remaining seconds

    public Exercise004(LocalDate date) {
        throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }

    public Exercise004(LocalDateTime dateTime) {
        throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }

    public LocalDateTime getDateTime() {
        throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }
}
